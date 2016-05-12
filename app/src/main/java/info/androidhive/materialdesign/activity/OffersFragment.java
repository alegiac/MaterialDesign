package info.androidhive.materialdesign.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.materialdesign.R;
import info.androidhive.materialdesign.RowData;
import info.androidhive.materialdesign.RowListAdapter;

/**
 * Created by Ravi on 29/07/15.
 */
public class OffersFragment extends ListFragment {

    public static final String[] titles = new String[] {
            "NAPROSYN GEL",
            "BENAGOL",
            "RINAZINA",
            "EUMILL",
            "REKORD B12",
            "MINERAL PLUS",
            "MINERAL PLUS",
            "SOMATOLINE USE&GO",
            "GUM SOFT PICKS ADVANCED",
            "SFIGMO OMROM M6"
    };

    public static final String[] subtitle = new String[] {
            "Tubo da 50g. Mialgie, lombalgie, torcicollo, fibromiositi, borsiti, tendiniti, tenosinoviti, periartriti, contusioni...",
            "16 pastiglie. Azione antisettica di lunga durata su gola irritata e con bruciore. Allevia il mal di gola.",
            "Spray nasale 15 ml. Uno spruzzo predosato può bastare per aiutarti ad aprire velocemente il naso.",
            "10 flaconcini. Gocce rinfrescanti e lenitive per alleviare affaticamento ed arrossamento agli occhi.",
            "10 flaconcini da 10 ml. Una soluzione per contrastare la stanchezza cronica e sovraffaticamento.",
            "Gusto limone e arancia da 450g. Prodotto salino isotonico per sportivi.",
            "Gusto limone e arancia, da 30g. Prodotto salino isotonico per sportivi.",
            "Spray 200 ml. Efficacia snellente su girovita, cosce e fianchi in 4 settimane e facile da usare.",
            "Lo scovolino di ultima generazione. Per la massima efficacia nella pulizia interdentale.",
            "Misuratore di pressione."
    };
    public static final Integer[] images = {
            R.drawable.naprosyn_gel,
            R.drawable.benagol,
            R.drawable.rinazina,
            R.drawable.eumill,
            R.drawable.rekord_b12,
            R.drawable.mineral_plus_1,
            R.drawable.mineral_plus_2,
            R.drawable.somatoline_use_go,
            R.drawable.gum_soft_picks_advanced,
            R.drawable.sfigmo_omrom_m6
    };
    public static final String[] oldprices = new String[] {
            "€ 9,80", "€ 6,40", "€ 11,90", "€ 9,20", "€ 12,70", "€ 8,90", "€ 1,20", "€ 39,00", "€ 5,80", "€ 144,00"
    };
    public static final String[] newprices = new String[] {
            "€ 6,90", "€ 4,80", "€ 9,50", "€ 6,50", "€ 7,65", "€ 6,90", "€ 0,45", "€ 30,90", "€ 4,30", "€ 109,00"
    };

    private ListView listView;
    private List<RowData> rowData;
    private RowListAdapter adapter;

    public OffersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_offers, container, false);
        listView = (ListView) rootView.findViewById(android.R.id.list);
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rowData =new ArrayList<RowData>();

        for(int i=0;i<titles.length;i++){
            RowData data =new RowData();
            data.setImageId(images[i]);
            data.setSubtitle(subtitle[i]);
            data.setTitle(titles[i]);
            data.setNewprice(newprices[i]);
            data.setOldprice(oldprices[i]);
            rowData.add(data);
        }

        adapter = new RowListAdapter(getActivity(), rowData);
        listView.setAdapter(adapter);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
