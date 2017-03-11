package edu.cecyt9.ipn.practica1_calculadora;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.math.*;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    Double numero1,numero2,resultado;
    String operador;

    public void onClickButtonUno(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickButtonDos(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickButtonTres(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickButtonCuatro(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickButtonCinco(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickButtonSeis(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickButtonSiete(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickButtonOcho(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickButtonNueve(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickButtonCero(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "0");
    }

    public void onClickButtonPunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickCuadrado(View miView)
    {
        operador="^2";
        onClickOperacionCapturaNumero1(miView);

    }
    public void onClickCubo(View miView)
    {
        operador="^3";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickRaiz(View miView)
    {
        operador="√";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickLn(View miView)
    {
        operador="Ln";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickLog(View miView)
    {
        operador="Log";
        onClickOperacionCapturaNumero1(miView);
    }


    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;


        try {

            if (operador.equals("+")) {
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 + numero2;
            } else if (operador.equals("-")) {
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 - numero2;
            } else if (operador.equals("*")) {
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 * numero2;
            } else if (operador.equals("/")) {
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 / numero2;
            } else if (operador.equals("^2")){
                resultado = Math.pow(numero1,2);
            } else if (operador.equals("^3")){
                resultado = Math.pow(numero1,3);
            } else if (operador.equals("√")){
                resultado = Math.sqrt(numero1);
            } else if (operador.equals("Ln")){
                resultado =  Math.log1p(numero1);
            } else if (operador.equals("Log")){
                resultado = Math.log(numero1);
            }
            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }
    }

    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText("");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
