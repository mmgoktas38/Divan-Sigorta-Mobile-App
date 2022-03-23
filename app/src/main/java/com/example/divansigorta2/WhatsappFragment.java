package com.example.divansigorta2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class WhatsappFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_whatsapp, container,false);

        Intent intentWhatsapp = new Intent(Intent.ACTION_VIEW);
        intentWhatsapp.setData(Uri.parse("http://api.whatsapp.com/send?phone=+9005377781010&&text=Merhaba"));
        startActivity(intentWhatsapp);


        return view;
    }
}