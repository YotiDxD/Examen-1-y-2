package cr.ac.unadeca.todobrian.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cr.ac.unadeca.todobrian.R;
import cr.ac.unadeca.todobrian.database.models.TodoTable;

public class FormularioActivity extends AppCompatActivity {

    private TextView lblNombre;
    private TextView lblActividad;
    private EditText txtNombre;
    private EditText txtActividad;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        lblNombre = findViewById(R.id.lblnombre);
        lblActividad = findViewById(R.id.lblactividad);
        txtNombre = findViewById(R.id.txtnombre);
        txtActividad = findViewById(R.id.txtactividad);
        btnGuardar = findViewById(R.id.btnguardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardar();
            }
        });

    }

    private boolean validacion(){
        boolean send = true;
        if(txtNombre.getText().toString().isEmpty()){
            send = false;
        }
        if(txtActividad.getText().toString().isEmpty()) {
            send = false;
        }
        return send;
    }

    private void guardar(){
        if(validacion()){
            TodoTable registro = new TodoTable();
            registro.nombre = txtNombre.getText().toString();
            registro.actividad = txtActividad.getText().toString();
            registro.save();
            finish();
        }else{
            Toast.makeText(this,
                    getResources().getString(R.string.error_valid),
                    Toast.LENGTH_LONG).show();
        }
    }

}
