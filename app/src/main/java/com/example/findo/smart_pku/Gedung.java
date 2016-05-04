package com.example.findo.smart_pku;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by findo on 03/05/16.
 */
public class Gedung extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Islamic Center UIN", "PKM UIN", "Hall Awal Bros", "Hall Hotel Pangeran", "PKM UNRI", "PKM UIR"};
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
            if (pilihan.equals("PKM UIN")) {
                i = new Intent(this,RSAwalBros.class);



            } else if (pilihan.equals("Islamic Center UIN")) {
                i = new Intent(this,RSAlulia.class);


            }else if(pilihan.equals("Hall Room Awal Bros")){
                i=new Intent(this,RSJTampan.class);

            }else if(pilihan.equals("Hall Room hotel Pangeran")) {
                i = new Intent(this, RSShafira.class);

            }else if(pilihan.equals("PKM UNRI")) {
                i = new Intent(this, RSZainab.class);

            }else if(pilihan.equals("PKM UIR")) {
                i = new Intent(this, RSArifin.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
