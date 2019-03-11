package com.example.listfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

public class FragmentA extends ListFragment {
    CusArrayAdapter arrAdap;
    ArrayList<String> arr;
    String[] name = new String[]{"Jack","Jenny"};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        arr = new ArrayList<String>();
        arr.addAll(Arrays.asList(name));
        arrAdap = new CusArrayAdapter(getActivity(),R.layout.custom_layout,arr);
        setListAdapter(arrAdap);

        return view;
    }
}
