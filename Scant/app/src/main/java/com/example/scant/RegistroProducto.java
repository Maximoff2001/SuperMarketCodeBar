package com.example.scant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RegistroProducto extends AppCompatActivity {

    TextView idProducto, NombreProducto, TipoContenido, Cantidad, Precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_producto);
        idProducto=findViewById(R.id.idProducto);
        NombreProducto=findViewById(R.id.NombreProducto);
        TipoContenido=findViewById(R.id.TipoContenido);
        Cantidad=findViewById(R.id.Cantidad);
        Precio=findViewById(R.id.Preci);
    }
}