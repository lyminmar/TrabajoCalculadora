package com.example.trabajocalculadora;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public EditText intro;
    public double num1, num2, res;
    String ope;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void cero(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "0");

    }

    public void uno(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "1");

    }

    public void dos(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "2");

    }

    public void tres(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "3");

    }

    public void cuat(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "4");

    }

    public void cinc(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "5");

    }

    public void seis(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "6");

    }

    public void siet(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "7");

    }

    public void oc(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "8");

    }

    public void nue(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + "9");

    }

    public void punt(View view) {
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(intro.getText() + ".");

    }

    public void OnclickCapturanum1(View view) {

        intro = (EditText) findViewById(R.id.texto);
        num1 = Double.parseDouble(intro.getText().toString());
        intro.setText(" ");
    }

    public void suma(View view) {
        ope = "+";
        OnclickCapturanum1(view);
    }

    public void resta(View view) {
        ope = "-";
        OnclickCapturanum1(view);
    }

    public void Multi(View view) {
        ope = "X";
        OnclickCapturanum1(view);
    }

    public void divi(View view) {
        ope = "÷";
        OnclickCapturanum1(view);
    }


    public void porcentaje(View view) {
        ope = "%";
        OnclickCapturanum1(view);
    }

    public void pot(View view) {
        ope = "exp";
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            intro.setText("");
        } catch (NumberFormatException nfe) {
        }
    }

    public void igual(View view) {

        intro = (EditText) findViewById(R.id.texto);
        num2 = Double.parseDouble(intro.getText().toString());
        if (ope.equals("+")) {
            res = num1 + num2;

        } else if (ope.equals("-")) {
            res = num1 - num2;
        } else if (ope.equals("X")) {
            res = num1 * num2;
        } else if (ope.equals("÷")) {
            res = num1 / num2;
            if (num2 == 0) {
                intro.setText("Error");
            }

        } else if (ope.equals("exp")) {
            intro = (EditText) findViewById(R.id.texto);
            num2 = Double.parseDouble(intro.getText().toString());
            intro.setText(" ");
            res = Math.pow(num1, num2);
        }else if(ope.equals("%")){
            res = (num1*num2) /   100;
        }

        intro.setText(" " + res);

    }

    public void raiz(View view) {
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            res = Math.sqrt(num1);
            intro.setText(String.valueOf(res));

        } catch (NumberFormatException nfe) {
        }
    }

    public void Cuadrado(View view) {
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            res = Math.pow(num1, 2);
            intro.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {
        }
    }

    public void Cubo(View view) {
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            res = Math.pow(num1, 3);
            intro.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {
        }
    }

    public void sen(View view) {
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            double rad = Math.toRadians(num1);
            res = Math.sin(rad);
            intro.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {
        }
    }

    public void cos(View view) {
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            double rad = Math.toRadians(num1);
            res = Math.cos(rad);
            intro.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {
        }
    }

    public void tan(View view) {
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            double rad = Math.toRadians(num1);
            res = Math.tan(rad);
            intro.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {
        }
    }

    public void log(View view) {
        intro = (EditText) findViewById(R.id.texto);
        try {
            num1 = Double.parseDouble(intro.getText().toString());
            double rad = Math.toRadians(num1);
            res = Math.log10(num1);
            intro.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {
        }
    }


    public void fact(View view) {

        res = 1;
        for (double i = num1; i >= 1; i--) {
            res = res * i;


            intro.setText(" " + res);
        }
    }

    public void del(View view) {
        if (!intro.getText().toString().equals(" ")) {
            intro.setText(intro.getText().subSequence(0, intro.getText().length() - 1) + " ");
        }
    }
    public void AC (View view){
        num1 = 0.0;
        num2 = 0.0;
        intro = (EditText) findViewById(R.id.texto);
        intro.setText(" ");
    }

}
