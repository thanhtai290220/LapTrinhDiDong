package nguyenthanhtai.baikt4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ConVat> list = new ArrayList<ConVat>();
        ConVat cran = new ConVat("Ga", R.drawable.chicken, " Nuoi lay thit và trung");
        ConVat cheo = new ConVat("Pig", R.drawable.pig, "Delicious in rolls");
        ConVat cmuc = new ConVat("Mực", R.drawable.muc, "8 tentacled monster");
        ConVat ctho = new ConVat("Thỏ", R.drawable.tho, "nice in a stew");
        ConVat ccuu = new ConVat("Cừu", R.drawable.cuu, "great for jumber");
        ConVat cnhen = new ConVat("Nhện", R.drawable.nhen, "great for jumber");
        final boolean add = list.add(cran);
        list.add(cheo);
        list.add(cmuc);
        list.add(ctho);
        list.add(ccuu);
        list.add(cnhen);
        final ListView listView = (ListView) findViewById(R.id.listViewQG);
        listView.setAdapter(new myCustomListAdapter(list, this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                ConVat animal = (ConVat) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + animal, Toast.LENGTH_SHORT).show();
            }
        });
    }
}