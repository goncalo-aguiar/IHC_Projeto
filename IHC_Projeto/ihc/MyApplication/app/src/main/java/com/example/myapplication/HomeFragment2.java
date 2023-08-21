package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import com.example.myapplication.ui.home.HomeFragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button pause;
    private Button play;
    private Button stop;
    private TextView frase1;
    private TextView frase2;
    private TextView frase3;
    private TextView frase4;
    private TextView frase5;
    private TextView frase6;
    private TextView frase7;
    private TextView frase8;
    private TextView frase9;

    public HomeFragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment2 newInstance(String param1, String param2) {
        HomeFragment2 fragment = new HomeFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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
        View view = inflater.inflate(R.layout.fragment_home2, container, false);

        pause = view.findViewById(R.id.pause);
        play = view.findViewById(R.id.play);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause.setVisibility(view.INVISIBLE);
                play.setVisibility(view.VISIBLE);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause.setVisibility(view.VISIBLE);
                play.setVisibility(view.INVISIBLE);
            }
        });

        stop = (Button)view.findViewById(R.id.stop);
         frase1 = (TextView) view.findViewById(R.id.aux1);
         frase2= (TextView) view.findViewById(R.id.aux2);
         frase3= (TextView) view.findViewById(R.id.aux3);
         frase4= (TextView) view.findViewById(R.id.aux4);
         frase5= (TextView) view.findViewById(R.id.aux5);
         frase6= (TextView) view.findViewById(R.id.aux6);
         frase7= (TextView) view.findViewById(R.id.aux7);
         frase8= (TextView) view.findViewById(R.id.aux8);
         frase9= (TextView) view.findViewById(R.id.aux9);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play.setVisibility(view.INVISIBLE);
                pause.setVisibility(view.INVISIBLE);
                stop.setVisibility(view.INVISIBLE);
                frase1.setVisibility(view.INVISIBLE);
                frase2.setVisibility(view.INVISIBLE);
                frase3.setVisibility(view.INVISIBLE);
                frase4.setVisibility(view.INVISIBLE);
                frase5.setVisibility(view.INVISIBLE);
                frase6.setVisibility(view.INVISIBLE);
                frase7.setVisibility(view.INVISIBLE);
                frase8.setVisibility(view.INVISIBLE);
                frase9.setVisibility(view.INVISIBLE);
                open_HomeFragment();
            }
        });
        Button info = (Button)view.findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultados();
            }
        });

        return view;


    }

    public void resultados(){
        Intent intent = new Intent(getActivity(),Resultados2.class);
        startActivity(intent);
    }

    public void open_HomeFragment3(){
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        /*FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();*/
        fragmentTransaction.replace(R.id.fl2,new HomeFragment3());
        fragmentTransaction.commit();
    }

    public void open_HomeFragment(){
        /*FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();*/
        /*FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl2,new HomeFragment());
        fragmentTransaction.commit();*/
        Intent intent = new Intent(getActivity(), Resultados.class);
        startActivity(intent);

    }


}