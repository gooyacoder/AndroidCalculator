package com.codepro.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one_btn, two_btn, three_btn, four_btn, five_btn, six_btn, seven_btn, eight_btn,
    nine_btn, zero_btn, dot_btn, equal_btn, add_btn, subtract_btn, multiply_btn, divide_btn,
    del_btn, percent_btn, sign_btn, c_btn, square_btn, power_btn, log_btn, sine_btn, cosine_btn,
    square_root_btn, power_of_e_btn, ln_btn, tan_btn, cot_btn;

    TextView display_view;

    String operand_001, operand_002, operator;
    boolean isOperand_001, isOperand_002;
    boolean operandChanged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand_001 = "";
        operand_002 = "";
        operator = "";
        isOperand_001 = true;
        isOperand_002 = false;
        operandChanged = false;

        cot_btn = findViewById(R.id.cot_btn);

        cot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cot_btn_clicked(view);
            }
        });

        tan_btn = findViewById(R.id.tan_btn);

        tan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tan_btn_clicked(view);
            }
        });

        ln_btn = findViewById(R.id.ln_btn);

        ln_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ln_btn_clicked(view);
            }
        });

        power_of_e_btn = findViewById(R.id.power_of_e_btn);

        power_of_e_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                power_of_e_btn_clicked(view);
            }
        });

        square_root_btn = findViewById(R.id.square_root_btn);

        square_root_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                square_root_btn_clicked(view);
            }
        });

        cosine_btn = findViewById(R.id.cosine_btn);

        cosine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cosine_btn_clicked(view);
            }
        });

        sine_btn = findViewById(R.id.sine_btn);

        sine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sine_btn_clicked(view);
            }
        });

        log_btn = findViewById(R.id.log_btn);

        log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log_btn_clicked(view);
            }
        });

        power_btn = findViewById(R.id.power_btn);

        power_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                power_btn_clicked(view);
            }
        });

        square_btn = findViewById(R.id.square_btn);

        square_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                square_btn_clicked(view);
            }
        });

        display_view = findViewById(R.id.calc_display);

        one_btn = findViewById(R.id.one_btn);

        one_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                one_btn_clicked(view);
            }
        });

        two_btn = findViewById(R.id.two_btn);

        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two_btn_clicked(view);
            }
        });

        three_btn = findViewById(R.id.three_btn);

        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three_btn_clicked(view);
            }
        });

        four_btn = findViewById(R.id.four_btn);

        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four_btn_clicked(view);
            }
        });

        five_btn = findViewById(R.id.five_btn);

        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                five_btn_clicked(view);
            }
        });

        six_btn = findViewById(R.id.six_btn);

        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six_btn_clicked(view);
            }
        });

        seven_btn = findViewById(R.id.seven_btn);

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven_btn_clicked(view);
            }
        });

        eight_btn = findViewById(R.id.eight_btn);

        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eight_btn_clicked(view);
            }
        });

        nine_btn = findViewById(R.id.nine_btn);

        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nine_btn_clicked(view);
            }
        });

        zero_btn = findViewById(R.id.zero_btn);

        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zero_btn_clicked(view);
            }
        });

        dot_btn = findViewById(R.id.dot_btn);

        dot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_btn_clicked(view);
            }
        });

        equal_btn = findViewById(R.id.equal_btn);

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equal_btn_clicked(view);
            }
        });

        add_btn = findViewById(R.id.addition_btn);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_btn_clicked(view);
            }
        });

        subtract_btn = findViewById(R.id.subtraction_btn);

        subtract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtract_btn_clicked(view);
            }
        });

        multiply_btn = findViewById(R.id.multiply_btn);

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiply_btn_clicked(view);
            }
        });

        divide_btn = findViewById(R.id.division_btn);

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divide_btn_clicked(view);
            }
        });

        del_btn = findViewById(R.id.del_btn);

        del_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                del_btn_clicked(view);
            }
        });

        percent_btn = findViewById(R.id.percent_btn);

        percent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                percent_btn_clicked(view);
            }
        });

        sign_btn = findViewById(R.id.sign_btn);

        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign_btn_clicked(view);
            }
        });

        c_btn = findViewById(R.id.c_btn);

        c_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_btn_clicked(view);
            }
        });
    }

    private void cot_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            try{
                value = Math.cos(Math.toRadians(value))/Math.sin(Math.toRadians(value));
                operand_001 = String.format("%.2f", value);
            }
            catch(Exception e){
                operand_001 = e.getMessage();
            }
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            try{
                value = Math.cos(Math.toRadians(value))/Math.sin(Math.toRadians(value));
                operand_002 = String.format("%.2f", value);
            }
            catch(Exception e){
                operand_002 = e.getMessage();
            }
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            try{
                value = Math.cos(Math.toRadians(value))/Math.sin(Math.toRadians(value));
                operand_001 = String.format("%.2f", value);
            }
            catch(Exception e){
                operand_001 = e.getMessage();
            }
            display_view.setText(operand_001);
        }
    }

    private void tan_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            try{
                value = Math.tan(Math.toRadians(value));
                operand_001 = String.format("%.2f", value);
            }
            catch(Exception e){
                operand_001 = e.getMessage();
            }
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            try{
                value = Math.tan(Math.toRadians(value));
                operand_002 = String.format("%.2f", value);
            }
            catch(Exception e){
                operand_002 = e.getMessage();
            }
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            try{
                value = Math.tan(Math.toRadians(value));
                operand_001 = String.format("%.2f", value);
            }
            catch(Exception e){
                operand_001 = e.getMessage();
            }
            display_view.setText(operand_001);
        }
    }

    private void ln_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            if(value > 0){
                value = Math.log(value);
                operand_001 = String.valueOf(value);
            }
            else{
                operand_001 = "Negative number!";
            }
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            if(value > 0){
                value = Math.log(value);
                operand_002 = String.valueOf(value);
            }
            else{
                operand_002 = "Negative number!";
            }
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            if(value > 0){
                value = Math.log(value);
                operand_001 = String.valueOf(value);
            }
            else{
                operand_001 = "Negative number!";
            }
            display_view.setText(operand_001);
        }
    }

    private void power_of_e_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            value = Math.pow(Math.E, value);
            operand_001 = String.valueOf(value);
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            value = Math.pow(Math.E, value);
            operand_002 = String.valueOf(value);
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            value = Math.pow(Math.E, value);
            operand_001 = String.valueOf(value);
            display_view.setText(operand_001);
        }
    }

    private void square_root_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            if(value > 0){
                value = Math.pow(value, 0.5);
                operand_001 = String.valueOf(value);
            }
            else{
                operand_001 = "Negative number!";
            }

            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            if(value > 0){
                value = Math.pow(value, 0.5);
                operand_002 = String.valueOf(value);
            }
            else{
                operand_002 = "Negative number!";
            }
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            if(value > 0){
                value = Math.pow(value, 0.5);
                operand_001 = String.valueOf(value);
            }
            else{
                operand_001 = "Negative number!";
            }
            display_view.setText(operand_001);
        }
    }

    private void cosine_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            value = Math.cos(Math.toRadians(value));
            operand_001 = String.format("%.2f", value);
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            value = Math.cos(Math.toRadians(value));
            operand_001 = String.format("%.2f", value);
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            value = Math.cos(Math.toRadians(value));
            operand_001 = String.format("%.2f", value);
            display_view.setText(operand_001);
        }
    }

    private void sine_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            value = Math.sin(Math.toRadians(value));
            operand_001 = String.format("%.2f", value);
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            value = Math.sin(Math.toRadians(value));
            operand_001 = String.format("%.2f", value);
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            value = Math.sin(Math.toRadians(value));
            operand_001 = String.format("%.2f", value);
            display_view.setText(operand_001);
        }
    }

    private void log_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            if (value > 0) {
                value = Math.log10(value);
                operand_001 = String.valueOf(value);
            }
            else{
                operand_001 = "negative number!";
            }

            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            if (value > 0) {
                value = Math.log10(value);
                operand_002 = String.valueOf(value);
            }
            else{
                operand_002 = "negative number!";
            }
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            if (value > 0) {
                value = Math.log10(value);
                operand_001 = String.valueOf(value);
            }
            else{
                operand_001 = "negative number!";
            }
            display_view.setText(operand_001);
        }
    }

    private void power_btn_clicked(View view) {
        operator = "^";
        isOperand_001 = false;
        isOperand_002 = true;
        display_view.setText("");
    }

    private void square_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            value = Math.pow(value , 2);
            operand_001 = String.valueOf(value);
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            value = Math.pow(value , 2);
            operand_002 = String.valueOf(value);
            display_view.setText(operand_002);
        }
        else{
            double value = Double.parseDouble(display_view.getText().toString());
            value = Math.pow(value, 2);
            operand_001 = String.valueOf(value);
            display_view.setText(operand_001);
        }
    }

    private void c_btn_clicked(View view) {
        operand_001 = "";
        operand_002 = "";
        operator = "";
        display_view.setText("0.0");
        isOperand_001 = true;
        isOperand_002 = false;
    }

    private void sign_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            double value = Double.parseDouble(operand_001);
            value *= -1;
            operand_001 = String.valueOf(value);
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            double value = Double.parseDouble(operand_002);
            value *= -1;
            operand_002 = String.valueOf(value);
            display_view.setText(operand_002);
        }
    }

    private void percent_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            StringBuilder newValue = new StringBuilder();
            newValue.append(operand_001);
            newValue.append('%');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            StringBuilder newValue = new StringBuilder();
            newValue.append(operand_002);
            newValue.append('%');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void del_btn_clicked(View view) {
        if(isOperand_001 && operand_001.length() > 0){
            String newValue = "";
            for(int i = 0; i < operand_001.length()-1; ++i){
                newValue += operand_001.toCharArray()[i];
            }
            operand_001 = newValue;
            display_view.setText(operand_001);
        }
        else if(isOperand_002 && operand_002.length() > 0){
            String newValue = "";
            for(int i = 0; i < operand_002.length()-1; ++i){
                newValue += operand_002.toCharArray()[i];
            }
            operand_002 = newValue;
            display_view.setText(operand_002);
        }
    }

    private void divide_btn_clicked(View view) {
        String previousOperator = operator;
        if(!operator.equals("/")){
            operandChanged = true;
        }else{
            operandChanged = false;
        }

        operator = "/";
        if(operand_002.length() == 0){
            isOperand_001 = false;
            isOperand_002 = true;
            display_view.setText("");
        }else if(operand_001.length() > 0 && operand_002.length() > 0){
            if(operandChanged){
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = 0.0;
                switch(previousOperator){
                    case "+":
                        result = op1 + op2;
                        break;
                    case "-":
                        result = op1 - op2;
                        break;
                    case "*":
                        result = op1 * op2;
                        break;
                }
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
            else{
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = op1 / op2;
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
        }
    }

    private void multiply_btn_clicked(View view) {
        String previousOperator = operator;
        if(!operator.equals("*")){
            operandChanged = true;
        }else{
            operandChanged = false;
        }

        operator = "*";
        if(operand_002.length() == 0){
            isOperand_001 = false;
            isOperand_002 = true;
            display_view.setText("");
        }else if(operand_001.length() > 0 && operand_002.length() > 0){
            if(operandChanged){
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = 0.0;
                switch(previousOperator){
                    case "+":
                        result = op1 + op2;
                        break;
                    case "-":
                        result = op1 - op2;
                        break;
                    case "/":
                        result = op1 / op2;
                        break;
                }
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
            else{
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = op1 * op2;
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
        }
    }

    private void subtract_btn_clicked(View view) {
        String previousOperator = operator;
        if(!operator.equals("-")){
            operandChanged = true;
        }else{
            operandChanged = false;
        }

        operator = "-";
        if(operand_002.length() == 0){
            isOperand_001 = false;
            isOperand_002 = true;
            display_view.setText("");
        }else if(operand_001.length() > 0 && operand_002.length() > 0){
            if(operandChanged){
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = 0.0;
                switch(previousOperator){
                    case "+":
                        result = op1 + op2;
                        break;
                    case "*":
                        result = op1 * op2;
                        break;
                    case "/":
                        result = op1 / op2;
                        break;
                }
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
            else{
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = op1 - op2;
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
        }
    }

    private void add_btn_clicked(View view) {
        String previousOperator = operator;
        if(!operator.equals("+")){
            operandChanged = true;
        }else{
            operandChanged = false;
        }
        operator = "+";
        if(operand_002.length() == 0){
            isOperand_001 = false;
            isOperand_002 = true;
            display_view.setText("");
        }else if(operand_001.length() > 0 && operand_002.length() > 0){
            if(operandChanged){
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = 0.0;
                switch(previousOperator){
                    case "-":
                        result = op1 - op2;
                        break;
                    case "*":
                        result = op1 * op2;
                        break;
                    case "/":
                        result = op1 / op2;
                        break;
                }
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
            else{
                double op1, op2;
                op1 = Double.parseDouble(operand_001);
                op2 = Double.parseDouble(operand_002);
                double result = op1 + op2;
                operand_001 = String.valueOf(result);
                operand_002 = "";
                display_view.setText(operand_001);
            }
        }
    }

    private void equal_btn_clicked(View view) {
        display_view.setText("");
        calculate();
        isOperand_001 = false;
        isOperand_002 = true;
    }

    private void calculate() {
        double op1, op2, result;
        if(operand_001.length() > 0 && operand_002.length() > 0){
            if(operand_001.contains("%")){
                StringBuilder newValue = new StringBuilder();
                newValue.append(operand_001);
                newValue.deleteCharAt(operand_001.lastIndexOf('%'));
                operand_001 = newValue.toString();
                double value = Double.parseDouble(operand_001);
                value *= 0.01;
                operand_001 = String.valueOf(value);
            }
            if(operand_002.contains("%")){
                StringBuilder newValue = new StringBuilder();
                newValue.append(operand_002);
                newValue.deleteCharAt(operand_002.lastIndexOf('%'));
                operand_002 = newValue.toString();
                double value = Double.parseDouble(operand_002);
                value *= 0.01;
                operand_002 = String.valueOf(value);
            }
            op1 = Double.parseDouble(operand_001);
            op2 = Double.parseDouble(operand_002);
        }
        else{
            op1 = 0.0;
            op2 = 0.0;
        }
        result = 0.0;
        switch(operator){
            case "+":
                result = op1 + op2;
                break;
            case "-":
                result = op1 - op2;
                break;
            case "/":
                if(op2 != 0){result = op1 / op2;}
                break;
            case "*":
                result = op1 * op2;
                break;
            case "^":
                result = Math.pow(op1, op2);
                break;
        }
        String result_string = String.valueOf(result);
        display_view.setText(result_string);
        operand_001 = result_string;
        operand_002 = "";
        operandChanged = false;
    }

    private void dot_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('.');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('.');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void zero_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('0');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('0');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void nine_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('9');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('9');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void eight_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('8');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('8');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void seven_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('7');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('7');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void six_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('6');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('6');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void five_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('5');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('5');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void four_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('4');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('4');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void three_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('3');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('3');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void two_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('2');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('2');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }

    private void one_btn_clicked(View view) {
        StringBuilder newValue = new StringBuilder();
        if(isOperand_001){
            newValue.append(operand_001);
            newValue.append('1');
            operand_001 = newValue.toString();
            display_view.setText(operand_001);
        }else{
            newValue.append(operand_002);
            newValue.append('1');
            operand_002 = newValue.toString();
            display_view.setText(operand_002);
        }
    }
}
