package tai.nt.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSoA, editSoB ;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();

    }
    void TimWidget() {
        editSoA = (EditText)findViewById(R.id.edSoA);
        editSoB = (EditText)findViewById(R.id.edSoB);
        textViewKetQua = (TextView)findViewById(R.id.tvKetQua);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }

    //ham xu ly



    public void XulyCong(View view) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int tong = a + b;
        //chuyen tong thanh chuoi
        String chuoitong = String.valueOf(tong);
        //
        textViewKetQua.setText("KQ : " + chuoitong);
    }

    public void XulyTru(View view) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int tong = a - b;
        //chuyen tong thanh chuoi
        String chuoitru = String.valueOf(tong);
        //
        textViewKetQua.setText("KQ : " + chuoitru);
    }


    public void XulyNhan(View view) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int nhan = a * b;
        //chuyen tong thanh chuoi
        String chuoinhan = String.valueOf(nhan);
        //
        textViewKetQua.setText("KQ la : " + chuoinhan);
    }


    public void XulyChia(View view) {
        //lay du lieu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();

        //chuyen sang kieu so
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //
        int chia = a / b;
        //chuyen tong thanh chuoi
        String chuoichia = String.valueOf(chia);
        //
        textViewKetQua.setText("KQ : " + chuoichia);
    }
}