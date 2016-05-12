package info.androidhive.materialdesign.activity;

/**
 * Created by Ravi on 29/07/15.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;

import info.androidhive.materialdesign.R;


public class MagazineFragment extends Fragment implements OnPageChangeListener
{

    private void display(String assetFileName, boolean jumpToFirstPage) {
        if (jumpToFirstPage)
            pageNumber = 1;
        pdfView.fromAsset(assetFileName).defaultPage(pageNumber).showMinimap(true)  .onPageChange(this).load();
    }

    public static final String THE_FILE = "full_RIVISTA_APRILE.pdf";
    String pdfName = THE_FILE;
    Integer pageNumber = 1;
    PDFView pdfView;

    public MagazineFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_magazine, container, false);


        pdfView = (PDFView)rootView.findViewById(R.id.pdfview);
        display(pdfName,true);

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
    }
}
