package exam.ium.di.easybus.AdapterForList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import exam.ium.di.easybus.R;
import exam.ium.di.easybus.bean.Avviso;

public class AdapterAvviso extends BaseAdapter {

    private Context context;
    private List<Avviso> avvisi;

    public AdapterAvviso(Context context, List<Avviso> list) {
        this.context = context;
        this.avvisi = list;
    }

    @Override
    public int getCount() {
        return avvisi.size();
    }

    @Override
    public Object getItem(int position) {
        return avvisi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return avvisi.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }
}
