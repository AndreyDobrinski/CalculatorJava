package com.example.testinv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

//    public TextView result_txt;
//    public Button btn_0;
//    public Button btn_1;
//    public Button btn_2;
//    public Button btn_3;
//
//    public Button btn_4;
//    public Button btn_5;
//    public Button btn_6;
//    public Button btn_7;
//    public Button btn_8;
//    public Button btn_9;
//    public Button btn_plus;
//    public Button btn_minus;
//    public Button btn_equal;
//    public Button btn_div;
//    public Button btn_times;
//    public Button btn_reset;

    Double firstNum;
    String operation;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView res = findViewById(R.id.textView);

        Button btn_0 = findViewById(R.id.btn_01);
        Button btn_1 = findViewById(R.id.btn_1);
        Button btn_2 = findViewById(R.id.btn_2);
        Button btn_3 = findViewById(R.id.btn_3);
        Button btn_4 = findViewById(R.id.btn_4);
        Button btn_5 = findViewById(R.id.btn_5);
        Button btn_6 = findViewById(R.id.btn_6);
        Button btn_7 = findViewById(R.id.btn_7);
        Button btn_8 = findViewById(R.id.btn_8);
        Button btn_9 = findViewById(R.id.btn_9);

        Button btn_plus = findViewById(R.id.btn_plus);
        Button btn_minus = findViewById(R.id.btn_minus);
        Button btn_equal = findViewById(R.id.btn_equal);
        Button btn_div = findViewById(R.id.btn_div);
        Button btn_times = findViewById(R.id.btn_times);
        Button btn_reset = findViewById(R.id.btn_reset);




//        btn_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            public void onClick(View v) {
//                res.setText("1");
//            }
//        });

//        View.OnClickListener buttonClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button clickedButton = (Button) v;
//                res.setText(clickedButton.getText());
//            }
//        };




        // Reset
        btn_reset.setOnClickListener(v ->{
            res.setText("0");
        });


        // Adding "Number Buttons" to array
        ArrayList<Button> nums = new ArrayList<>();
        nums.add(btn_0);
        nums.add(btn_1);
        nums.add(btn_2);
        nums.add(btn_3);
        nums.add(btn_4);
        nums.add(btn_5);
        nums.add(btn_6);
        nums.add(btn_7);
        nums.add(btn_8);
        nums.add(btn_9);


        for (Button btn: nums){
            // On click on every btn
            btn.setOnClickListener(v ->{
                // Result becomes the text that was clicked
                res.setText(btn.getText().toString());
            });

        }


        // Adding " Operators Buttons" to array
        ArrayList<Button> operators = new ArrayList<>();
        operators.add(btn_plus);
        operators.add(btn_minus);
        operators.add(btn_div);
        operators.add(btn_times);

        for (Button btn: operators){
            // On click on every btn
            btn.setOnClickListener(v ->{
                firstNum = Double.parseDouble(res.getText().toString());
                operation = btn.getText().toString();
                res.setText(btn.getText().toString());
            });

        }


        btn_equal.setOnClickListener(v ->{
            double secondNum = Double.parseDouble(res.getText().toString());
            double result;
            switch (operation){
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "/":
                    result = firstNum / secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                default:
                    return;
            }
//            res.setText(String.valueOf(result));

            // Check if the result has a decimal part
            if (result == (int) result) {
                res.setText(String.valueOf((int) result)); // Convert to integer if no decimal part
            } else {
                res.setText(String.valueOf(result));
            }

            firstNum = result;
        });









//        btn_0.setOnClickListener(buttonClickListener);
//        btn_1.setOnClickListener(buttonClickListener);
//        btn_2.setOnClickListener(buttonClickListener);
//        btn_3.setOnClickListener(buttonClickListener);
//        btn_4.setOnClickListener(buttonClickListener);
//        btn_5.setOnClickListener(buttonClickListener);
//        btn_6.setOnClickListener(buttonClickListener);
//        btn_7.setOnClickListener(buttonClickListener);
//        btn_8.setOnClickListener(buttonClickListener);
//        btn_9.setOnClickListener(buttonClickListener);
//
//        btn_plus.setOnClickListener(buttonClickListener);
//        btn_minus.setOnClickListener(buttonClickListener);
//        btn_equal.setOnClickListener(buttonClickListener);
//        btn_div.setOnClickListener(buttonClickListener);
//        btn_times.setOnClickListener(buttonClickListener);
//        btn_reset.setOnClickListener(buttonClickListener);



    }
}