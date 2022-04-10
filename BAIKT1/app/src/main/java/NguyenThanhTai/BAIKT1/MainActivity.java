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

    
}