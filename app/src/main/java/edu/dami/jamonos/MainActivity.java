package edu.dami.jamonos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_name = null;
    EditText et_app = null;
    EditText et_corr = null;
    EditText et_contra = null;
    EditText et_repcontra = null;
    Button btn_reg = null;
    Button btn_duda = null;
    TextView txtvw = null;
    TextView txtversion = null;
    ImageView img = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurarVistas();
    }


    private void configurarVistas() {
        this.txtvw = findViewById(R.id.tv_bienvenida);
        this.img = findViewById(R.id.img);
        this.et_name =findViewById(R.id.et_nombres);
        this.et_app =findViewById(R.id.et_apellidos);
        this.et_corr =findViewById(R.id.et_correo);
        this.et_contra =findViewById(R.id.et_contra);
        this.et_repcontra =findViewById(R.id.et_repcontra);
        this.btn_reg =findViewById(R.id.btn_registrar);
        this.btn_duda =findViewById(R.id.btn_duda);
        this.txtversion = findViewById(R.id.tv_version);


        String valor_version = String.format("N° Versión: %s",getVersionName());
        txtversion.setText(valor_version);

        this.btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saludar();
            }
        });

    }

    private void saludar(){
        Intent intent = new Intent(this, Campos.class);
        intent.putExtra("variable_nombres",  et_name.getText().toString());
        intent.putExtra("variable_apellidos",et_app.getText().toString());
        intent.putExtra("variable_correo",et_corr.getText().toString());
        intent.putExtra("variable_contra",et_contra.getText().toString());
        intent.putExtra("variable_repcontra",et_contra.getText().toString());
        startActivity(intent);
        String nombreIngresado = this.et_name.getText().toString();
        Toast.makeText(this, String.format("Bienvenido  %s !",nombreIngresado), Toast.LENGTH_LONG).show();

    }

    public String getVersionName(){
        return BuildConfig.VERSION_NAME;
    }
}