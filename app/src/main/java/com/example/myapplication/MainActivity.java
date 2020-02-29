package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    CheckBox jamPertama, jamKedua, jamKetiga;
    String pertama="", kedua="", ketiga="";

    private TextView pilihan1, pilihan2, pilihan3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnSubmit);
        jamPertama = findViewById(R.id.jamPertama);
        jamKedua = findViewById(R.id.jamKedua);
        jamKetiga = findViewById(R.id.jamKetiga);

        pilihan1 = findViewById(R.id.pilihan_satu);
        pilihan2 = findViewById(R.id.pilihan_dua);
        pilihan3 = findViewById(R.id.pilihan_tiga);
        //String pertama = "", Kedua =" " , Ketiga = " ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pilihan1.setText("Pilihan 1: ");
                pilihan2.setText("Pilihan 2: ");
                pilihan3.setText("Pilihan 3: ");

                if(jamPertama.isChecked()){
                    pertama = "09:30 AM ";
                   // Toast.makeText(getApplicationContext(),"ini jam ke "+ pertama, Toast.LENGTH_LONG).show();

                } else if (!jamPertama.isChecked()){
                    pertama = " ";

                }

                if(jamKedua.isChecked()){
                    kedua = "10:30 AM ";
                  //  Toast.makeText(getApplicationContext(),"ini jam ke "+ pertama, Toast.LENGTH_LONG).show();

                } else if (!jamKedua.isChecked()){
                    kedua = " ";

                }

                if(jamKetiga.isChecked()){
                    ketiga = "11:30 AM ";
                    //Toast.makeText(getApplicationContext(),"ini jam ke "+ pertama, Toast.LENGTH_LONG).show();

                } else if (!jamKetiga.isChecked()){
                    ketiga = " ";
                }
            if (!jamPertama.isChecked() && !jamKedua.isChecked() &&!jamKetiga.isChecked()){
                Toast.makeText(getApplicationContext(),"tidak ada yang terCek", Toast.LENGTH_LONG).show();
            } else {
                pilihan1.setText("Pilihan 1: "+pertama);
                pilihan2.setText("Pilihan 2: "+kedua);
                pilihan3.setText("Pilihan 3: "+ketiga);

            }

            }
        });

    }
}
