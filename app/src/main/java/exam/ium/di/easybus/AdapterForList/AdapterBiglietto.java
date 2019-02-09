package exam.ium.di.easybus.AdapterForList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import exam.ium.di.easybus.bean.Biglietto;

public class AdapterBiglietto extends BaseAdapter {

    private List<Biglietto> biglietti;
    private Context context;
//costruttori
    public AdapterBiglietto(List<Biglietto> b, Context context)
    {
        this.biglietti=b;
        this.context=context;
    }



// metodi
    @Override
    public int getCount() {
        return biglietti.size();
    }

    @Override
    public Object getItem(int position) {
        return biglietti.get(position);
    }

    @Override
    public long getItemId(int position) {
        return biglietti.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
