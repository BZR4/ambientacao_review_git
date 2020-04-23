package br.com.trajanocamargo.e024_acolhimento_layout_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void minhFuncao(View view) {
        Log.d("MainActivity", " - Click!");
    }

    public void outraFuncao(View view) {
        Log.d("MainActivity", " - Click!");
    }
}

