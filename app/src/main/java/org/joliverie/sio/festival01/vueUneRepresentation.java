package org.joliverie.sio.festival01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.joliverie.sio.festival01.R;


public class vueUneRepresentation extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vue_une_representation);

        String date = getIntent().getExtras().getString("date");
        TextView textViewDate = (TextView) findViewById(R.id.textViewDate);
        textViewDate.setText(date);

        String groupe = getIntent().getExtras().getString("groupe");
        TextView textViewGroupe = (TextView) findViewById(R.id.textViewGroupe);
        textViewGroupe.setText(groupe);

        String lieu = getIntent().getExtras().getString("lieu");
        TextView textViewLieu = (TextView) findViewById(R.id.textViewLieu);
        textViewLieu.setText(lieu);

        String heureDebut = getIntent().getExtras().getString("heureDeb");
        TextView textViewHeureDebut = (TextView) findViewById(R.id.textViewHeureDebut);
        textViewHeureDebut.setText(heureDebut);

        String heureFin = getIntent().getExtras().getString("heureFin");
        TextView textViewHeureFin = (TextView) findViewById(R.id.textViewHeureFin);
        textViewHeureFin.setText(heureFin);
    }

}