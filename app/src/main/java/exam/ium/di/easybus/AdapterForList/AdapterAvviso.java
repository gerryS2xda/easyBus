package exam.ium.di.easybus.AdapterForList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import exam.ium.di.easybus.R;
import exam.ium.di.easybus.bean.Avviso;
import exam.ium.di.easybus.populate.PopulateAvviso;

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
        if(convertView == null) {
            convertView = (View) LayoutInflater.from(context).inflate(R.layout.layout_row_avviso,null);
        }

        Avviso av = new Avviso();
        av= avvisi.get(position);

        TextView titolo = (TextView) convertView.findViewById(R.id.oggetto_row_avviso);
        TextView data = (TextView) convertView.findViewById(R.id.data_row_avviso);
        TextView oggetto = (TextView) convertView.findViewById(R.id.descrizione_row_avviso);

        titolo.setText(av.getOggetto());
        data.setText(av.getDataPubblicazione());
        oggetto.setText(av.getDescrizione());

        return convertView;
    }
}
