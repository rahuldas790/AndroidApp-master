package com.sweedelight.ganesh.sweedelight.Activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sweedelight.ganesh.sweedelight.R;



public class Description extends Fragment{
String  name;
    @SuppressLint("ValidFragment")
    public Description(String name){
        this.name= name;
    }
    public Description ()
    {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_description, container, false);
        TextView t_name= (TextView) rootView.findViewById(R.id.DescModelValue);
        t_name.setText(name);
        return rootView;

    }


}
