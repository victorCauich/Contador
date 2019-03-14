package com.victormanuel.android.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mcontador;
    private Button mcontar;
    private Button mreiniciar;
    private double conteoActual =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Recuperacion de las variables
         * */
        mcontador=findViewById(R.id.contador);
        mcontar=findViewById(R.id.contar);
        mcontar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoActual = conteoActual + 1;
                mcontador.setText(Double.toString(conteoActual));
            }
        });

        mreiniciar=findViewById(R.id.reiniciar);
        mreiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteoActual = 0.0;
                mcontador.setText(Double.toString(conteoActual));
            }
        });
        mreiniciar=findViewById(R.id.reiniciar);
        mcontador=findViewById(R.id.contador);
    }


}
