package com.example.vankien.cong2so;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    TextView txtKetQua;
    EditText txtSoA,txtSoB;
    Button btnTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(txtSoA.getText().toString());
                int soB = Integer.parseInt(txtSoB.getText().toString());
                int tong = soA+soB;
                txtKetQua.setText(""+tong);
            }
        });
    }

    private void addControls() {
        txtKetQua = findViewById(R.id.txtKetQua);
        btnTong = findViewById(R.id.btnTong);
        txtSoA = findViewById(R.id.txtSoA);
        txtSoB = findViewById(R.id.txtSoB);
    }

//    @Override
//    public void onClick(View v) {
//        if(v == btnTong){
//            int soA = Integer.parseInt(txtSoA.getText().toString());
//            int soB = Integer.parseInt(txtSoB.getText().toString());
//            int tong = soA+soB;
//            txtKetQua.setText(""+tong);
//        }
//    }


    
//    public void tong2So(View v){
//        addControls();
//        int soA = Integer.parseInt(txtSoA.getText().toString());
//        int soB = Integer.parseInt(txtSoB.getText().toString());
//        int tong = soA+soB;
//        txtKetQua.setText(""+tong);
//    }


}
