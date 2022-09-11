package com.example.bosscalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private EditText calc, result;
    private String present_str, result_str;
    private boolean dot_init, operator_init;

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnadd, btnsub, btnmulti, btndiv, btnexp, btnmod, btnequal, btndot, btnac, btnbackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout mainView = findViewById(R.id.mainView);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mainView.setBackgroundColor(Color.parseColor("#000000"));
                }else{
                    mainView.setBackgroundColor(Color.parseColor("#FFFFFF"));

                }
            }
        });

        calc = (EditText) findViewById(R.id.calc);
        result = (EditText) findViewById(R.id.result);

        present_str = "";
        result_str = "";
        dot_init = false;
        operator_init = false;

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnexp = (Button) findViewById(R.id.btnexp);
        btnmod = (Button) findViewById(R.id.btnmod);
        btnequal = (Button) findViewById(R.id.btnequal);
        btndot = (Button) findViewById(R.id.btndot);
        btnbackspace = (Button) findViewById(R.id.btnbackspace);
        btnac = (Button) findViewById(R.id.btnac);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "0";
                showEqn();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "1";
                showEqn();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "2";
                showEqn();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "3";
                showEqn();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "4";
                showEqn();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "5";
                showEqn();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "6";
                showEqn();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "7";
                showEqn();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "8";
                showEqn();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                present_str = present_str + "9";
                showEqn();
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(present_str.isEmpty()){
                    present_str = "0.";
                    dot_init = true;
                }
                if(dot_init == false){
                    present_str = present_str + ".";
                    dot_init = true;
                }
                showEqn();
            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                showEqn();
                showResult();
            }
        });
        btnbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
                showEqn();
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_init = false;
                if(!present_str.isEmpty()){
                    if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                        backspace();
                    }
                    if(operator_init == false){
                        present_str = present_str + " + ";
                        operator_init = true;
                    }
                }
                showEqn();
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_init = false;
                if(!present_str.isEmpty()){
                    if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                        backspace();
                    }
                    if(operator_init == false){
                        present_str = present_str + " - ";
                        operator_init = true;
                    }
                }
                showEqn();
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_init = false;
                if(!present_str.isEmpty()){
                    if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                        backspace();
                    }
                    if(operator_init == false){
                        present_str = present_str + " * ";
                        operator_init = true;
                    }
                }
                showEqn();
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_init = false;
                if(!present_str.isEmpty()){
                    if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                        backspace();
                    }
                    if(operator_init == false){
                        present_str = present_str + " / ";
                        operator_init = true;
                    }
                }
                showEqn();
            }
        });

        btnexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_init = false;
                if(!present_str.isEmpty()){
                    if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                        backspace();
                    }
                    if(operator_init == false){
                        present_str = present_str + " ^ ";
                        operator_init = true;
                    }
                }
                showEqn();
            }
        });

        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_init = false;
                if(!present_str.isEmpty()){
                    if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                        backspace();
                    }
                    if(operator_init == false){
                        present_str = present_str + " % ";
                        operator_init = true;
                    }
                }
                showEqn();
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_init = false;
                if(!present_str.isEmpty()){
                    if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                        backspace();
                    }
                    if(operator_init == false){
                        present_str = present_str + " % ";
                        operator_init = true;
                    }
                }
                showEqn();
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operator_init == true && !present_str.substring(present_str.length()-1, present_str.length()).equals(" ")){
                    String [] tokens = present_str.split(" ");

                    switch (tokens[1].charAt(0)){

                        case '+':
                            result_str = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            result_str = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case '*':
                            result_str = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '/':
                            result_str = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                        case '%':
                            result_str = Double.toString(Double.parseDouble(tokens[0]) % Double.parseDouble(tokens[2]));
                            break;
                        case '^':
                            result_str = Double.toString(1.0);
                            for(int i=1; i<=Double.parseDouble(tokens[2]); i++){
                                result_str = Double.toString( Double.parseDouble(result_str) * Double.parseDouble(tokens[0]));
                            }
                            break;
                    }
                    showResult();
                }
            }
        });

    }
    public void showEqn(){
        calc.setText(present_str);
    }
    public void showResult(){
        result.setText(result_str);
    }
    public void clear(){
        present_str = "";
        result_str = "";
        dot_init = false;
        operator_init = false;
    }
    public void backspace(){
        if(!present_str.isEmpty()){
            if(present_str.substring(present_str.length()-1, present_str.length()).equals(".")){
                dot_init = false;
            }
            if(present_str.substring(present_str.length()-1, present_str.length()).equals(" ")){
                present_str = present_str.substring(0, present_str.length()-3);
                operator_init = false;
            }else{
                present_str = present_str.substring(0, present_str.length()-1);
            }

        }
    }
}