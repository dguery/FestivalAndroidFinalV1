package org.joliverie.sio.festival01;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.joliverie.sio.festival01.metier.Groupe;
import org.joliverie.sio.festival01.metier.Representation;
import org.joliverie.sio.festival01.metier.Lieu;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {

    public void listeRepre(View view)
    {
        startActivity(new Intent(this, listeRepresentations.class));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}