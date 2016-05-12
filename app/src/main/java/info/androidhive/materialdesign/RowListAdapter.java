package info.androidhive.materialdesign;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alessandro on 09/05/16.
 */
public class RowListAdapter extends BaseAdapter
{
    Context context;
    List<RowData> rowData;
    public RowListAdapter(Context context, List<RowData> items)
    {
        this.context = context;
        this.rowData = items;
    }
    /*private view holder class*/
    private class ViewHolder
    {
        ImageView imageView;
        TextView txtTitle;
        TextView txtDesc;
        TextView txtOldPrice;
        TextView txtNewPrice;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.offers_list_item, null);
            holder = new ViewHolder();
            holder.txtDesc = (TextView) convertView.findViewById(R.id.subtitle);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.title);
            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            holder.txtOldPrice = (TextView) convertView.findViewById(R.id.oldprice);
            holder.txtNewPrice = (TextView) convertView.findViewById(R.id.newprice);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        RowData rowItem = (RowData) getItem(position);
        holder.txtDesc.setText(rowItem.getSubtitle());
        holder.txtTitle.setText(rowItem.getTitle());
        holder.imageView.setImageResource(rowItem.getImageId());
        holder.txtOldPrice.setText(rowItem.getOldprice());
        holder.txtNewPrice.setText(rowItem.getNewprice());
        return convertView;
    }
    @Override
    public int getCount() {
        return rowData.size();
    }
    @Override
    public Object getItem(int position) {
        return rowData.get(position);
    }
    @Override
    public long getItemId(int position) {
        return rowData.indexOf(getItem(position));
    }
}