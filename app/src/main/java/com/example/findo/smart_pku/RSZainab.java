package com.example.findo.smart_pku;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by findo on 03/05/16.
 */
public class RSZainab extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Call Center", "Location", "Website", "Drive Direction", "Messaging","Info di google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Listrs));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihanrs(pilihan);

    }

    private void tampilkanpilihanrs(String pilihan) {
        try {
            Intent i = null;
            if (pilihan.equals("Call Center")) {
                String tlpn = "tel:082386838514";
                i = new Intent(Intent.ACTION_DIAL, Uri.parse(tlpn));

            } else if (pilihan.equals("Location")) {
                String geocode = "geo:0.514388, 101.455031";
                i = new Intent(Intent.ACTION_VIEW, Uri.parse(geocode));

            } else if (pilihan.equals("Website")) {
                String web = "http://www.pekanbaru.awalbros.com";
                i = new Intent(Intent.ACTION_VIEW,Uri.parse(web));

            } else if (pilihan.equals("Drive Direction")) {

                String lokasi = "google.navigation:q=0.514388, 101.455031";
                i = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasi));

            } else if (pilihan.equals("Messaging")) {
                //sms
                i = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:082386838514"));

            } else if (pilihan.equals("Info di Google")) {
                i = new Intent(Intent.ACTION_WEB_SEARCH);
                i.putExtra(SearchManager.QUERY,"RS Zainab");

            } else  {
                finish();

            }
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}