package br.unigran.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    PrimeiroFragment primeiro;
    SegundoFragment segundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primeiro = new PrimeiroFragment();
        segundo = new SegundoFragment();
        getSupportFragmentManager().beginTransaction().add(primeiro,"primeiro").commit();
        getSupportFragmentManager().beginTransaction().add(segundo,"segundo").commit();
    }
    public void primeiro(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.idPrimeiro,primeiro).commit();
    }
    public void segundo(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.idPrimeiro,segundo).commit();
    }
}