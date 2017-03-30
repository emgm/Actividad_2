package app.actividad_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    Button btnChangeText, btnChangeImage;
    TextView tvLabel;
    ImageView imgSO;
    RadioGroup rgOpciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnChangeText = (Button) findViewById(R.id.btnChangeText);
        btnChangeImage = (Button) findViewById(R.id.btnChangeImage);

        tvLabel = (TextView) findViewById(R.id.tvLabel);

        imgSO = (ImageView) findViewById(R.id.imgSO);

        rgOpciones = (RadioGroup) findViewById(R.id.rgOpciones);

        btnChangeText.setOnClickListener(this);
        btnChangeImage.setOnClickListener(this);

        rgOpciones.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnChangeText:

                tvLabel.setText("Hola, buenas noches!");

                break;

            case R.id.btnChangeImage:

                imgSO.setImageResource(R.drawable.linux);

                break;

        }
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if (checkedId == R.id.radio_opc_1){

            final String text = "Opción 1 seleccionado";
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        }else if (checkedId == R.id.radio_opc_2){

            final String text = "Opción 2 seleccionado";
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        }else if (checkedId == R.id.radio_opc_3){

            final String text = "Opción 3 seleccionado";
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        }

    }
}

