package mx.edu.tesoem.isc.p67s2120222vba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class opciones extends AppCompatActivity {

    Button btnsuma,btnresta,btnmulti,btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suma = new Intent(opciones.this,suma.class);
                startActivity(suma);
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resta = new Intent(opciones.this, resta.class);
                startActivity(resta);
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent multi = new Intent(opciones.this, multiplicacion.class);
                startActivity(multi);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent div = new Intent(opciones.this, division.class);
                startActivity(div);
            }
        });

    }
}