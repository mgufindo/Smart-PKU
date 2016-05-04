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
public class Restoran extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"Cinto Bundo", "Ayam Lepas", "Titian Pauh", "Gindo", "KFC", "Holland"};
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
            if (pilihan.equals("Cinto Bundo")) {
                i = new Intent(this,RSAwalBros.class);



            } else if (pilihan.equals("RS Aulia")) {
                i = new Intent(this,RSAlulia.class);


            }else if(pilihan.equals("RSJ Tampan")){
                i=new Intent(this,RSJTampan.class);

            }else if(pilihan.equals("RS Shafira")) {
                i = new Intent(this, RSShafira.class);

            }else if(pilihan.equals("RS Zainab")) {
                i = new Intent(this, RSZainab.class);

            }else if(pilihan.equals("RSJ Arifin Achmad")) {
                i = new Intent(this, RSArifin.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
