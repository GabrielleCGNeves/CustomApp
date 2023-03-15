package br.com.etecia.customapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Tudo em Todo Lugar",
                        "Uma imigrante chinesa parte rumo a uma aventura onde, sozinha, precisará salvar o mundo, explorando outros universos e outras vidas que poderia ter vivido.",
                        "Comédia",
                        R.drawable.tudoaomesmotempo));
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

    }
}