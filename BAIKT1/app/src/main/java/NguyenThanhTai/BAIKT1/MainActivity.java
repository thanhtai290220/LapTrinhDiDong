package nguyenthanhtai.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Edits;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ChieuCao= (EditText)findViewById(R.id.edChieuCao);
        final EditText CanhDayDai= (EditText)findViewById(R.id.edCanhDayDai);
        final EditText ChieuDayNgan= (EditText)findViewById(R.id.edCanhDayNgan);
        final EditText KetQua= (EditText)findViewById(R.id.KQ);
        Button CV = (Button)findViewById(R.id.button3);
        Button DT = (Button)findViewById(R.id.button4);
        CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(CanhDayDai.getText().toString());
                double b = Double.parseDouble(ChieuDayNgan.getText().toString());
                double chuvi = (a + b )*2;
                KetQua.setText(String.valueOf(chuvi));
            }


        });
        DT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(CanhDayDai.getText().toString());
                double c = Double.parseDouble(ChieuCao.getText().toString());
                double DienTich = a * c ;
                KetQua.setText(String.valueOf(DienTich));

            }
        });

    }
}