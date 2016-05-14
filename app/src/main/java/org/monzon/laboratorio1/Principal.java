package org.monzon.laboratorio1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    private EditText txtPedir;
    private Button btnPedir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtPedir=(EditText) findViewById(R.id.txtPedir);
        btnPedir=(Button) findViewById(R.id.btnPedir);
        btnPedir.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                //Snackbar.make(v,"Click En Boton Pedido",Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(Principal.this,Factura.class);
                intent.putExtra("pedido",txtPedir.getText().toString());
                startActivity(intent);
            }
        });
    }
}
