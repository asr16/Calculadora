package com.example.angel.calculadoraandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, bsumar, brestar, bdividir, bigual, bmultipl, bpunto, bresetear, blimpiar, bborrar, bmasmenos, bporcentaje;
    TextView etProceso, etconcatenar;
    double numero1, numero2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bresetear = (Button)findViewById(R.id.bresetear);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        bpunto = (Button)findViewById(R.id.bpunto);
        bigual = (Button)findViewById(R.id.bigual);
        bsumar = (Button)findViewById(R.id.bsumar);
        brestar = (Button)findViewById(R.id.brestar);
        bmultipl = (Button)findViewById(R.id.bmultipl);
        bdividir = (Button)findViewById(R.id.bdividir);
        bborrar = (Button)findViewById(R.id.bborrar);
        blimpiar = (Button)findViewById(R.id.blimpiar);
        bmasmenos = (Button)findViewById(R.id.bmasmenos);
        etProceso = (TextView)findViewById(R.id.textView);
        bporcentaje = (Button)findViewById(R.id.bporcentaje);

        numero1=0;
        numero2=0;

        button0.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener()  { //
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });
        bpunto.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.textView);
                if (etProceso.getText().length()!=0 && etProceso.getText().toString().charAt(etProceso.getText().length()-1)!='.')
                    etProceso.append(".");
            }
        });
        bigual.setOnClickListener(new View.OnClickListener()    {
            public void onClick(View v) {
                try {
                    etconcatenar = (TextView) findViewById(R.id.textView);
                    numero2 = Double.parseDouble(etconcatenar.getText().toString());
                    if (operador.equals("+")) {
                        etProceso.setText("");
                        resultado = numero1 + numero2;
                    }
                    if (operador.equals("-")) {
                        etProceso.setText("");
                        resultado = numero1 - numero2;
                    }
                    if (operador.equals("×")) {
                        etProceso.setText("");
                        resultado = numero1 * numero2;
                    }
                    if (operador.equals("%"))   {
                        etProceso.setText("");
                        resultado = numero1 / 100;
                    }
                    if (operador.equals("÷")) {
                        etProceso.setText("");
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            etProceso.setText("Infinito");
                        }
                    }
                    etProceso.setText(String.valueOf(resultado));
                }catch (NumberFormatException e){
                    System.out.println(e);
                }
            }
        });
        bsumar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    operador = "+";
                    etconcatenar = (TextView)findViewById(R.id.textView);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }catch (NumberFormatException e){}
            }
        });
        brestar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    operador = "-";
                    etconcatenar = (TextView) findViewById(R.id.textView);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }catch (NumberFormatException e){}
            }
        });
        bmultipl.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                try {
                    operador = "×";
                    etconcatenar = (TextView)findViewById(R.id.textView);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }catch (NumberFormatException e){}
            }
        });
        bdividir.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View v) {
                try {
                    operador = "÷";
                    etconcatenar = (TextView)findViewById(R.id.textView);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }catch (NumberFormatException e){}
            }
        });
        bresetear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
        bborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etProceso.getText().toString().length()>1)
                    etProceso.setText(etProceso.getText().toString().substring(0,etProceso.length()-1));
                if (etProceso.getText().toString().length()==1)
                    etProceso.setText("");
            }
        });
        blimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etProceso.setText("");
            }
        });
        bmasmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    etProceso.setText(String.valueOf(Double.valueOf(etProceso.getText().toString()) * -1));
                }catch (NumberFormatException e){}
            }
        });
    }

    public void porciento (View v)  {
        try {
            numero1 = Double.parseDouble(etconcatenar.getText().toString());
            resultado = numero1 / 100;
            etProceso.setText(String.valueOf(resultado));
        }catch (NullPointerException e){}
    }
    public void seno (View v)   {
        try {
            numero1 = Double.parseDouble(etconcatenar.getText().toString());
            resultado = Math.sin(numero1);
            etProceso.setText(String.valueOf(resultado));
        }catch (NullPointerException e){}
    }
    public void coseno (View v) {
        try {
            numero1 = Double.parseDouble(etconcatenar.getText().toString());
            resultado = Math.cos(numero1);
            etProceso.setText(String.valueOf(resultado));
        }catch (NullPointerException e){}
    }
    public void tangente (View v)   {
        try {
            numero1 = Double.parseDouble(etconcatenar.getText().toString());
            resultado = Math.tan(numero1);
            etProceso.setText(String.valueOf(resultado));
        }catch (NullPointerException e){}
    }
    public void raiz (View v)   {
        try {
            numero1 = Double.parseDouble(etconcatenar.getText().toString());
            resultado = Math.sqrt(numero1);
            etProceso.setText(String.valueOf(resultado));
        }catch (NullPointerException e){}
    }
}
