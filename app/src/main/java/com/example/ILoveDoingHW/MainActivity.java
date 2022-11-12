package com.example.ILoveDoingHW;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText A;
    private EditText B;
    private EditText C;
    private TextView X;
    private TextView X2;

    private int getIntValue(EditText editText) {
        if (editText.getText().toString().isEmpty()){
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
            return 0;
        }
        return Integer.parseInt(editText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText EditText = findViewById(R.id.a);
        EditText.getText();
        A = findViewById(R.id.a);
        B = findViewById(R.id.b);
        C = findViewById(R.id.c);
        X = findViewById(R.id.x);
        X2 = findViewById(R.id.x2);
    }

    public void click(View view){
        int a = getIntValue(A);
        if (A.getText().toString().isEmpty()){
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
            return;
        }
        int b = getIntValue(B);
        if (B.getText().toString().isEmpty()){
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
            return;
        }
        int c = getIntValue(C);
        if (C.getText().toString().isEmpty()){
            Toast.makeText(this, "ошибка", Toast.LENGTH_SHORT).show();
            return;
        }
        if (a==0){
            double x = -c/(double)b;
            X.setText("Уравненение не квадратное: "  );
            X2.setText("x=" + String.format("%.2f", x));

            return;
        }
        double d = Math.sqrt((b*b)-4*a*c);
        if (((b*b)-4*a*c)<0){
            X.setText("В целых числах решенений нет");
            X2.setText("");
            return;
        }
        double x1 = (b*(-1)+d)/(2*a);
        double x2 = (b*(-1)-d)/(2*a);
        if (x1==x2){
            X.setText("Уравненение квадратное." );
            X2.setText("x1=x2=" + String.format("%.2f", x1));
            return;
        }
        else{
            X.setText("Уравненение квадратное." );
            X2.setText("x1=" + String.format("%.2f", x1) + "; x2=" + String.format("%.2f", x2) );
        }

        //X.setText(Math.sqrt((b*b)-4*a*c)+" ");
    }


}