package host.msr.baidumapaction1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.baidu.mapapi.search.core.PoiInfo;

import java.util.List;

/**
 * Created by Ymmmsick on 2016/4/26.
 */
public class MyAdapter extends BaseAdapter {

    Context context;
    List<PoiInfo> lists;
    LayoutInflater inflater ;

    public MyAdapter(Context context,List<PoiInfo> lists){
        this.context = context;
        this.lists = lists;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item,null);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.item_tv);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if (lists.get(position).name.contains("ATM") || lists.get(position).name.contains("自助银行")){
            viewHolder.textView.setText("ATM取款机");
        }else {
            viewHolder.textView.setText("银行营业厅");
        }
        return convertView;
    }

    class ViewHolder {
        TextView textView;
    }
}
