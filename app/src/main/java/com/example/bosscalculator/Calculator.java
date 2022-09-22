package com.example.bosscalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link Calculator#newInstance} factory method to
// * create an instance of this fragment.
// */
public class Calculator extends Fragment {

    View view;

    private EditText calc, result;
    private String present_str, result_str;
    private boolean dot_init, operator_init;
    Button Calculator, Converter, Settings;

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnadd, btnsub, btnmulti, btndiv, btnexp, btnmod, btnequal, btndot, btnac, btnbackspace;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    public Calculator() {
        // Required empty public constructor
    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment Calculator.
//     */
    // TODO: Rename and change types and number of parameters
//    public static Calculator newInstance(String param1, String param2) {
//        Calculator fragment = new Calculator();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_calculator, container, false);

        calc = (EditText) view.findViewById(R.id.calc);
        result = (EditText) view.findViewById(R.id.result);

        present_str = "";
        result_str = "";
        dot_init = false;
        operator_init = false;

        btn0 = (Button) view.findViewById(R.id.btn0);
        btn1 = (Button) view.findViewById(R.id.btn1);
        btn2 = (Button) view.findViewById(R.id.btn2);
        btn3 = (Button) view.findViewById(R.id.btn3);
        btn4 = (Button) view.findViewById(R.id.btn4);
        btn5 = (Button) view.findViewById(R.id.btn5);
        btn6 = (Button) view.findViewById(R.id.btn6);
        btn7 = (Button) view.findViewById(R.id.btn7);
        btn8 = (Button) view.findViewById(R.id.btn8);
        btn9 = (Button) view.findViewById(R.id.btn9);
        btnadd = (Button) view.findViewById(R.id.btnadd);
        btnsub = (Button) view.findViewById(R.id.btnsub);
        btnmulti = (Button) view.findViewById(R.id.btnmulti);
        btndiv = (Button) view.findViewById(R.id.btndiv);
        btnexp = (Button) view.findViewById(R.id.btnexp);
        btnmod = (Button) view.findViewById(R.id.btnmod);
        btnequal = (Button) view.findViewById(R.id.btnequal);
        btndot = (Button) view.findViewById(R.id.btndot);
        btnbackspace = (Button) view.findViewById(R.id.btnbackspace);
        btnac = (Button) view.findViewById(R.id.btnac);

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
        return view;
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