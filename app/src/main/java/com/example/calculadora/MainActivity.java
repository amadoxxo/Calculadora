package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numOne;
    private EditText numTwo;
    private TextView calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOne = (EditText) findViewById(R.id.etPrimerNumero);
        numTwo = (EditText) findViewById(R.id.etSegundoNumero);
        calcular = (TextView) findViewById(R.id.tvResultado);

    }


    public void sumar(View view) {
        double numUno = 0;
        double numDos = 0;
        double res = 0;

        numUno = Double.parseDouble(numOne.getText().toString());
        numDos = Double.parseDouble(numTwo.getText().toString());

        Resultado resultado = new Resultado(numUno, numDos, res);


        calcular.setText("El resultado es: " +  resultado.sumar(numUno, numDos));

    }

    public void restar(View view) {
        double numUno = 0;
        double numDos = 0;
        double res = 0;

        numUno = Double.parseDouble(numOne.getText().toString());
        numDos = Double.parseDouble(numTwo.getText().toString());

        Resultado resultado = new Resultado(numUno, numDos, res);

        calcular.setText("El resultado es: " + resultado.restar(numUno, numDos));
    }

    public void multiplicar(View view) {
        double numUno = 0;
        double numDos = 0;
        double res = 0;

        numUno = Double.parseDouble(numOne.getText().toString());
        numDos = Double.parseDouble(numTwo.getText().toString());

        Resultado resultado = new Resultado(numUno, numDos, res);

        calcular.setText("El resultado es: " + resultado.multiplicar(numUno, numDos));
    }

    public void dividir(View view) {
        double numUno = 0;
        double numDos = 0;
        double res = 0;

        numUno = Double.parseDouble(numOne.getText().toString());
        numDos = Double.parseDouble(numTwo.getText().toString());

        Resultado resultado = new Resultado(numUno, numDos, res);

        calcular.setText("El resultado es: " + resultado.dividir(numUno, numDos));
    }

}