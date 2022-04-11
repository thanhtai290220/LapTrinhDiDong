package NguyenThanhTai.BAIKT1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtPass;
    TextView txtAttempt;
    Button btnLogin;
    int dem = 0;
    public void addView(){
        edtTen = findViewById(R.id.ETusername);
        edtPass = findViewById(R.id.EDpass);
        txtAttempt = findViewById(R.id.txtAttempt);
        btnLogin = findViewById(R.id.btnLogin);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
    }

    public void DangNhap(View v)
    {
        dem = dem + 1;

        if(edtTen.getText().toString().compareTo("maicuongtho") == 0  && edtPass.getText().toString().compareTo("Cntt60ntu!") == 0)
            Toast.makeText(MainActivity.this, "User and Password is correct!!", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
        txtAttempt.setText(String.valueOf(dem));
    }
}