package com.ninzen.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,
            btnNine, btnEight, btnZero,btnClear, btnMultiply,btnDivide,btnAdd,btnSub,btnEquals;
    private String numberone;
    private String command;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber= findViewById(R.id.etNumber);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        btnClear=findViewById(R.id.btnClear);
        btnAdd=findViewById(R.id.btnPlus);
        btnSub=findViewById(R.id.btnSub);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnEquals=findViewById(R.id.btnEqual);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="1";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="2";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="3";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="4";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="5";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="6";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="7";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="8";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="9";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one="0";
                Operation operation= new Operation(etNumber.getText().toString());
                String result = operation.Print(one);
                etNumber.setText(result);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               numberone="";
               command="";
               etNumber.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Operation operation= new Operation(number,"add");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Operation operation= new Operation(number,"sub");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Operation operation= new Operation(number,"divide");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number =etNumber.getText().toString();
                Operation operation= new Operation(number,"multiply");
                String[] iteams= operation.Math();
                command =iteams[0];
                numberone=iteams[1];
                etNumber.setText("");
            }

        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberTwo =Integer.parseInt(etNumber.getText().toString());
                Operation operation= new Operation(Integer.parseInt(numberone),numberTwo);
                int result=operation.Equlas(command);
                etNumber.setText(result+"");
            }
        });
    }

}
