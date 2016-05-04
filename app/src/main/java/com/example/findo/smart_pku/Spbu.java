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
public class Spbu extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] Listrs = new String[]{"SPBU Panam", "SPBU arifin achmad", "SPBU Delima", "SPBU Garuda Sakti", "SPBU Arengka 2", "SPBU Marpoyan"};
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
            if (pilihan.equals("SPBU Panam")) {
                i = new Intent(this,RSAwalBros.class);



            } else if (pilihan.equals("SPBU arifin achmad")) {
                i = new Intent(this,SPBUArifin.class);


            }else if(pilihan.equals("SPBU Delima")){
                i=new Intent(this,SPBUDelima.class);

            }else if(pilihan.equals("SPBU Garuda Sakti")) {
                i = new Intent(this, SPBUGS.class);

            }else if(pilihan.equals("SPBU Arengka 2")) {
                i = new Intent(this, SPBUArengka.class);

            }else if(pilihan.equals("SPBU Marpoyan")) {
                i = new Intent(this, SPBUMarpoyan.class);
            }
            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
