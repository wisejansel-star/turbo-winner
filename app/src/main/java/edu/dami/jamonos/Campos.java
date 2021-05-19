package edu.dami.jamonos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Campos extends AppCompatActivity {

    TextView et_name_welcome = null;
    TextView et_app_welcome = null;
    TextView et_corr_welcome = null;
    TextView et_contra_welcome = null;
    TextView et_repcontra_welcome = null;
    TextView txtvw_welcome = null;
    ImageView img_welcome = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campos);

        setup();
    }

    private void  setup(){
        this.txtvw_welcome = findViewById(R.id.tv_welcome);
        this.img_welcome = findViewById(R.id.img_welcomw);
        this.et_name_welcome =findViewById(R.id.et_nombres_welcome);
        this.et_app_welcome =findViewById(R.id.et_apellidos_welcome);
        this.et_corr_welcome =findViewById(R.id.et_correo_welcome);
        this.et_contra_welcome =findViewById(R.id.et_contra_welcome);
        this.et_repcontra_welcome =findViewById(R.id.et_repcontra_welcome);


        String recuperamos_variable_string_nombres = getIntent().getStringExtra("variable_nombres");
        String recuperamos_variable_string_apellidos = getIntent().getStringExtra("variable_apellidos");
        String recuperamos_variable_string_correo = getIntent().getStringExtra("variable_correo");
        String recuperamos_variable_string_contra = getIntent().getStringExtra("variable_contra");
        String recuperamos_variable_string_repcontra = getIntent().getStringExtra("variable_repcontra");

        String valorPresentar = String.format("Nombres: %s",recuperamos_variable_string_nombres);
        et_name_welcome.setText(valorPresentar);

        String presentarApp = String.format("Apellidos: %s",recuperamos_variable_string_apellidos);
        et_app_welcome.setText(presentarApp);

        String presentarCorr = String.format("Correo: %s",recuperamos_variable_string_correo);
        et_corr_welcome.setText(presentarCorr);

        String presentarCont = String.format( "Contraseña: %s",recuperamos_variable_string_contra);
        et_contra_welcome.setText(presentarCont);

        String presentarRepCont = String.format("Contraseña: %s",recuperamos_variable_string_repcontra);
        et_repcontra_welcome.setText(presentarRepCont);



    }
}