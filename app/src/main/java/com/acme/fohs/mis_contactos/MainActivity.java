package com.acme.fohs.mis_contactos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.acme.fohs.mis_contactos.util.TextChangedListener;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre , txtTelefono, txtCorreo, txtDireccion;
    private  Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        txtNombre = (EditText) findViewById(R.id.idname);
        txtTelefono = (EditText) findViewById(R.id.idphone);
        txtCorreo = (EditText) findViewById(R.id.idemail);
        txtDireccion = (EditText) findViewById(R.id.iddirecion);
        txtNombre.addTextChangedListener(new TextChangedListener() {
            @Override
            public void onTextChanged(CharSequence seq, int start, int before, int count) {
                btnAgregar = (Button) findViewById(R.id.idbtnAgregar);
                btnAgregar.setEnabled(!seq.toString().trim().isEmpty());
            }
        });
}
    public void onClick(View view) {

   String mensg = String.format("%s ha sido agregado a la lista",txtNombre.getText());
        Toast.makeText(this,mensg,Toast.LENGTH_LONG).show();
        btnAgregar.setEnabled(false);
        limpiarCampos();

    }

    private void limpiarCampos() {

        txtNombre.getText().clear();
        txtTelefono.getText().clear();
        txtCorreo.getText().clear();
        txtDireccion.getText().clear();
        txtNombre.requestFocus();

    }
}
