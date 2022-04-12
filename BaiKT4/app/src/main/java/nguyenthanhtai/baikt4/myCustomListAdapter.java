package nguyenthanhtai.baikt4;

import android.widget.ListAdapter;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import static nguyenthanhtai.baikt4.R.layout.my_list_item;

public class myCustomListAdapter extends BaseAdapter {
    private List<ConVat> listData;
    private LayoutInflater layoutInflater;
    private Context context;
    private Object String;

    public myCustomListAdapter(List<ConVat> listData, Context aContext) {
        this.listData = listData;
        this.context = context;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listData.size();
    }
    @Override
    public Object getItem(int i) {
        return listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyCustomItemListView row;
        if (view==null) {
            view = layoutInflater.inflate(my_list_item, (ViewGroup) String);
            row = new MyCustomItemListView();
            row.imageViewTenConVat =(ImageView)view.findViewById(R.id.imConVat);
            row.textViewConVat = (TextView)view.findViewById(R.id.tvTenConVat);
            row.textViewdacdiem = (TextView)view.findViewById(R.id.tvDacdiem);
            view.setTag(row);
        }
        else   {
            row = (MyCustomItemListView)view.getTag();
        }
        ConVat conVat = this.listData.get(i);
        row.textViewConVat.setText("" + conVat.getTenConVat());
        row.textViewdacdiem.setText("" + conVat.getdacDiem());
        row.imageViewTenConVat.setImageResource(conVat.getIDconvat());
        return  view;
    }
    static class MyCustomItemListView {
        public TextView textViewdacdiem;
        ImageView imageViewTenConVat;
        TextView textViewConVat;
    }
}
