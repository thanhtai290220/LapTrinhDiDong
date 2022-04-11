package NguyenThanhTai.BAIKT2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText edTien;
    RadioButton RB13,RB15,RB18;
    Button buttonTip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addView(){
        edTien = findViewById(R.id.edTien);
        RB13 = findViewById(R.id.RB13);
        RB13 = findViewById(R.id.RB15);
        RB13 = findViewById(R.id.RB18);





    }
}