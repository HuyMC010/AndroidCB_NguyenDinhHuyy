package com.example.baitap01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtX,txtY;
    TextView txtResult;
    Button btnAdd,btnSub,btnMul,btnDiv,btnlayDu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initControls();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initControls() {
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtResult = findViewById(R.id.txtResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
        btnlayDu = findViewById(R.id.btnlayDu);
        btnlayDu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layDu();
            }
        });
        btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub();
            }
        });
        btnMul = findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mul();
            }
        });
        btnDiv = findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Div();
            }
        });
    }

    private void layDu() {
        try {
            float x = Float.parseFloat(txtX.getText().toString());
            float y = Float.parseFloat(txtY.getText().toString());
            float result = x % y;
            txtResult.setText(String.valueOf("Kết quả phép dư: " + result));
        } catch (NumberFormatException e) {

            txtResult.setText("Nhập liệu không hợp lệ, vui lòng nhập số.");
        }}

    private void Div() {
        try{
            float x = Float.parseFloat(txtX.getText().toString());
            float y = Float.parseFloat(txtY.getText().toString());
            float result = x / y;
            if(y!=0) {
                txtResult.setText(String.valueOf("Kết quả phép chia: " + result));
            }
            else{
                txtResult.setText("Không thể chia cho 0,vui lòng nhập số khác 0");
            }
        } catch (NumberFormatException e) {

            txtResult.setText("Nhập liệu không hợp lệ, vui lòng nhập số.");
        }}

    private void Mul() {
        try {
            float x = Float.parseFloat(txtX.getText().toString());
            float y = Float.parseFloat(txtY.getText().toString());
            float result = x * y;
            txtResult.setText(String.valueOf("Kết quả phép nhân: " + result));
        } catch (NumberFormatException e) {

            txtResult.setText("Nhập liệu không hợp lệ, vui lòng nhập số.");
        }}

    private void Sub() {
        try {
            float x = Float.parseFloat(txtX.getText().toString());
            float y = Float.parseFloat(txtY.getText().toString());
            float result = x - y;
            txtResult.setText(String.valueOf("Kết quả phép trừ: " + result));
        } catch (NumberFormatException e) {

            txtResult.setText("Nhập liệu không hợp lệ, vui lòng nhập số.");
        }}

    private void Add() {
        try {
            float x = Float.parseFloat(txtX.getText().toString());
            float y = Float.parseFloat(txtY.getText().toString());
            float result = x + y;
            txtResult.setText(String.valueOf("Kết quả phép cộng: " + result));
        } catch (NumberFormatException e) {

            txtResult.setText("Nhập liệu không hợp lệ, vui lòng nhập số.");
        }

    }
}