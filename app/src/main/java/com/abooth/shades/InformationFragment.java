package com.abooth.shades;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by aboot on 3/7/2018.
 */

public class InformationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.information_fragment, container, false);
        return view;
    }

    public void setText (String shadeInfo) {
        TextView view = (TextView) getView().findViewById(R.id.textView1);
        view.setText(shadeInfo);
    }
}
