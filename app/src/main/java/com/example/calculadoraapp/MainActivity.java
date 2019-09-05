package com.example.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1,num2,num3,num4,num5,num6;
    private TextView pro1,pro2,pro3,pro4;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);

        num1=findViewById(R.id.edit1);
        num2=findViewById(R.id.edit2);
        num3=findViewById(R.id.edit3);
        num4=findViewById(R.id.edit4);
        num5=findViewById(R.id.edit5);
        num6=findViewById(R.id.edit6);


        pro1=findViewById(R.id.text3);
        pro2=findViewById(R.id.text7);
        pro3=findViewById(R.id.text12);
        pro4=findViewById(R.id.text13);

        final int[] resteo = new int[1];

        Button calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());

                if (n1<n2){
                    resteo[0] =n2;
                    pro1.setText("Prom: " + resteo[0]);
                }else{
                    resteo[0] =n1;
                    pro1.setText("Prom: " + resteo[0]);
                }

                double n3=Integer.parseInt(num3.getText().toString());
                double n4=Integer.parseInt(num4.getText().toString());
                double n5=Integer.parseInt(num5.getText().toString());
                double n6=Integer.parseInt(num6.getText().toString());

                double reslab= (n3+n4+n5+n6)/4;

                pro2.setText("Prom: " + reslab);


                String item= spinner.getSelectedItem().toString();

                if(item.equals("A: 30%T + 70%L")){
                    double res1=(0.30* resteo[0])+(0.70*reslab);
                    pro3.setText(String.format("Promedio: %.2f", res1));
                    if (res1>=13){
                        pro4.setText("Aprobado");
                    }else{
                        pro4.setText("Desaprobado");
                    }
                }if (item.equals("B: 40%T + 60%L")){
                    double res1=(0.40* resteo[0])+(0.60*reslab);
                    pro3.setText(String.format("Promedio: %.2f", res1));
                    if (res1>=13){
                        pro4.setText("Aprobado");
                    }else{
                        pro4.setText("Desaprobado");
                    }
                }if (item.equals("C: 20%T + 80%L")){
                    double res1=(0.20* resteo[0])+(0.80*reslab);
                    pro3.setText(String.format("Promedio: %.2f", res1));
                    if (res1>=13){
                        pro4.setText("Aprobado");
                    }else{
                        pro4.setText("Desaprobado");
                    }
                }
            }
        });
    }
}
