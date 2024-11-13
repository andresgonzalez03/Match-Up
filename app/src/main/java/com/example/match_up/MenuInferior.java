package com.example.match_up;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuInferior#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuInferior extends Fragment {

    //creamos los ImageButton
    private ImageButton likes;
    private ImageButton scroll;
    private ImageButton chats;
    private ImageButton profile;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // asociamos los botones a los del fragment

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fg_menu_inf, container, false);
    }
}