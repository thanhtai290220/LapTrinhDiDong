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
        ConVat cran = new ConVat("Gà", R.drawable.chicken, "Nuôi lấy thịt và trứng");
        ConVat cheo = new ConVat("Heo", R.drawable.pig, "Nuôi lấy thịt");
        ConVat cmuc = new ConVat("Ong", R.drawable.bee, "Nuôi lấy mật");
        ConVat ctho = new ConVat("Thỏ", R.drawable.rabbit, "Nuôi lấy thịt và lông");
        ConVat ccuu = new ConVat("Chó", R.drawable.dog, "Giúp canh nhà");
        ConVat cnhen = new ConVat("Rùa", R.drawable.turtle,"Nuôi làm cảnh");
        final boolean add = list.add(cran);
        list.add(cheo);
        list.add(cmuc);
        list.add(ctho);
        list.add(ccuu);
        list.add(cnhen);
        final ListView listView = (ListView) findViewById(R.id.listViewQG);
        listView.setAdapter(new myCustomListAdapter(list, this));
        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         //   @Override
         //   public void onItemClick(AdapterView<?> a, View v, int position, long id) {
          //      Object o = listView.getItemAtPosition(position);
         //       ConVat animal = (ConVat) o;
         //       Toast.makeText(MainActivity.this, "Selected :" + " " + animal, Toast.LENGTH_SHORT).show();
          //  }
       // });
    }
}