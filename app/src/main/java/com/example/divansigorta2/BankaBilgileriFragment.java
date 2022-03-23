package com.example.divansigorta2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BankaBilgileriFragment extends Fragment {

    private TextView textViewBilgi, textViewIs, textViewVakifKatilim,textViewSirketAdi, textViewKuveyt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_banka_bilgileri, container, false);

        setHasOptionsMenu(true);
        textViewSirketAdi = view.findViewById(R.id.textViewSirketAdi);
        textViewIs = view.findViewById(R.id.textViewIs);
        textViewKuveyt = view.findViewById(R.id.textViewKuveyt);
        textViewVakifKatilim = view.findViewById(R.id.textViewVakifKatilim);
        textViewBilgi = view.findViewById(R.id.textViewBilgi);

        textViewIs.setText("İş Bankası – Kayseri Şube\n" +
                "\n" +
                "TR17 0006 4000 0015 3003 9747 56");
        textViewKuveyt.setText("Kuveyt Türk Katılım Bankası – Kayseri Şube\n" +
                "\n" +
                "TR85 0020 5000 0952 0193 0000 01");
        textViewVakifKatilim.setText("Vakıf Katılım Katılım Bankası – Kayseri Şube\n" +
                "\n" +
                "TR97 0021 0000 0003 2415 4000 01");
        textViewBilgi.setText("Banka Bilgilerimiz");
        textViewSirketAdi.setText("Divan Sigorta Aracılık Hizmetleri Ltd. Şti.");


        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }
}