package com.example.scant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class inicial extends AppCompatActivity {

    Button btnScan, inProducto, RegistroProducto;
    EditText TXTresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btnScan = findViewById(R.id.btnScan);
        inProducto=findViewById(R.id.inProducto);
        TXTresultado = findViewById(R.id.TXTresultado);
        RegistroProducto = findViewById(R.id.RegistroProducto);
        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator intergrador= new IntentIntegrator(inicial.this);
                intergrador.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
                intergrador.setPrompt("Codigo de barras");
                intergrador.setCameraId(0);
                intergrador.setBeepEnabled(true);
                intergrador.setBarcodeImageEnabled(true);
                intergrador.initiateScan();
            }
        });
        inProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inicial.this, infoProducto.class));
            }
        });
        RegistroProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inicial.this, RegistroProducto.class));
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null){
            if (result.getContents() == null){
                Toast.makeText(this, "Lectura cancelada", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                TXTresultado.setText(result.getContents());
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}