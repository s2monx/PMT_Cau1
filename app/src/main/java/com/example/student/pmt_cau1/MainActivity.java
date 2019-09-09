package com.example.student.pmt_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDangNhap;
    CheckBox chkLuuThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDangNhap = (Button)findViewById(R.id.btnDangNhap);
        chkLuuThongTin = (CheckBox)findViewById(R.id.chkLuuThongTin);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkLuuThongTin.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu!", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
