package exam.ium.di.easybus.AdapterForList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

import exam.ium.di.easybus.R;
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
        if(convertView == null) {
            convertView = (View) LayoutInflater.from(context).inflate(R.layout.layout_row_biglietto,null);
        }

        Biglietto biglietto=new Biglietto();
        biglietto= biglietti.get(position);

        TextView trattaP=convertView.findViewById(R.id.trattaPartenza);
        TextView trattaA=convertView.findViewById(R.id.trattaArrivo);
        TextView idbiglietto=convertView.findViewById(R.id.idBiglietto);
        TextView prezzo=convertView.findViewById(R.id.prezzo);

        String s=""+biglietto.getPrezzo();

        trattaP.setText(biglietto.getPartenza());
        trattaA.setText(biglietto.getArrivo());
        idbiglietto.setText(biglietto.getFascia());
        prezzo.setText(s);

        return convertView;
    }
}
