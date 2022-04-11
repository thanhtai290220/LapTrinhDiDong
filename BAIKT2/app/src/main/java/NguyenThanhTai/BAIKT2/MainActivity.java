package nguyenthanhtai.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EDMoney;
    RadioButton rd13,rd15,rd18;
    Button ButtonTip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
    }

    public void addView(){
        EDMoney = findViewById(R.id.edMoney);
        rd13 = findViewById(R.id.RB13);
        rd15 = findViewById(R.id.RB15);
        rd18 = findViewById(R.id.RB18);
        ButtonTip = findViewById(R.id.buttonTip);
    }


    public void Money(View v)
    {
        if(rd13.isChecked())
            Toast.makeText(MainActivity.this,String.valueOf(Float.valueOf(EDMoney.getText().toString()) * 0.13) ,Toast.LENGTH_LONG).show();
        else
        if(rd15.isChecked())
            Toast.makeText(MainActivity.this,String.valueOf(Float.valueOf(EDMoney.getText().toString()) * 0.15) ,Toast.LENGTH_LONG).show();
        else
        if (rd18.isChecked())
            Toast.makeText(MainActivity.this,String.valueOf(Float.valueOf(EDMoney.getText().toString()) * 0.18) ,Toast.LENGTH_LONG).show();
    }
}