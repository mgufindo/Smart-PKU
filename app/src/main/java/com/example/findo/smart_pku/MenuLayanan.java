package com.example.findo.smart_pku;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

public class MenuLayanan extends AppCompatActivity {

    Button rumahsakit, restoran, spbu, supermarket, gedung, atm;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        rumahsakit = (Button) findViewById(R.id.rumahsakit);
        restoran = (Button) findViewById(R.id.restoran);
        spbu = (Button) findViewById(R.id.spbu);
        supermarket = (Button) findViewById(R.id.supermarket);
        gedung = (Button) findViewById(R.id.gedung);
        atm = (Button) findViewById(R.id.atm);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        rumahsakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showrumahsakit();

            }
        });

        restoran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showrestoran();

            }
        });

        spbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showspbu();
            }
        });

        supermarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showsupermarket();

            }
        });

        gedung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showgedung();

            }
        });

        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showatm();

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showhelp();
            }
        });

    }

    private void showhelp() {

    }

    private void showatm() {
        Intent i= new Intent(this,Atm.class);
        startActivity(i);
    }

    private void showgedung() {
        Intent i= new Intent(this,Gedung.class);
        startActivity(i);
    }

    private void showsupermarket() {
        Intent i= new Intent(this,Market.class);
        startActivity(i);
    }

    private void showspbu() {
        Intent i= new Intent(this,Spbu.class);
        startActivity(i);
    }

    private void showrestoran() {
        Intent i= new Intent(this,Restoran.class);
        startActivity(i);
    }

    private void showrumahsakit() {
        Intent i= new Intent(this,Rumahsakit.class);
        startActivity(i);

    }
}
