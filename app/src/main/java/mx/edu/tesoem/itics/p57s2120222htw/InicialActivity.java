package mx.edu.tesoem.itics.p57s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class InicialActivity extends AppCompatActivity {

    Handler manejador=new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        manejador.postDelayed(autocambiar,5000);
    }

    Runnable autocambiar=new Runnable() {
        @Override
        public void run() {
            Intent intent= new Intent(InicialActivity.this,principalActivity.class);
            startActivity(intent);
            finish();
        }
    };
}
