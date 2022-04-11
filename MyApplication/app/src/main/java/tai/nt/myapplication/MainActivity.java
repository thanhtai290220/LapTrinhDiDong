package tai.nt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

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
        buttonTip = findViewById(R.id.buttonTip);
    }

    public void TinhTien(View v)
    {
        if(RB13.isChecked())
            Toast.makeText(MainActivity.this,String.valueOf(Float.valueOf(edTien.getText().toString()) * 0.13) ,Toast.LENGTH_LONG).show();
        else
        if(RB15.isChecked())
            Toast.makeText(MainActivity.this,String.valueOf(Float.valueOf(edTien.getText().toString()) * 0.15) ,Toast.LENGTH_LONG).show();
        else
        if (RB18.isChecked())
            Toast.makeText(MainActivity.this,String.valueOf(Float.valueOf(edTien.getText().toString()) * 0.18) ,Toast.LENGTH_LONG).show();
    }
}