package com.example.patrickjmartin.android_fragments_basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.patrickjmartin.android_fragments_basics.PokemonAPI.Pokemon;

public class MainActivity extends AppCompatActivity implements PokemonFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(Pokemon item) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
