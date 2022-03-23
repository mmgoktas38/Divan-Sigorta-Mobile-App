package com.example.divansigorta2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class BasarilarFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_basarilar, container, false);
        Toast.makeText(getActivity(), "Sayfamız yapım aşamasındadır. En kısa sürede hizmete girecektir.", Toast.LENGTH_LONG).show();

        return view;
    }
}