package com.example.andrewlow.iheart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class homeFrag extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.homefragment, container, false);

        String[] list = {"One","Two","Three"};
        ListView l = view.findViewById(R.id.list);
        ArrayAdapter  a = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,list);
        l.setAdapter(a);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //getSupportFragmentManager().beginTransaction().replace(R.id.container,new BlankFragment()).commit();
            }
        });
        return view;
    }
}
