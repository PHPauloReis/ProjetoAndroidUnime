package br.com.othonbatista.jogodeperguntas;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new JogarFragment())
                .commit();
    }

    // Botões do Fragmento Jogar
    public void buttonCadastrarJogarFragment(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new CadastrarFragment())
                .commit();
    }

    // Botões do Fragmento Cadastrar
    public void buttonJogarCadastrarFragment(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new JogarFragment())
                .commit();
    }

}