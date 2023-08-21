package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.HomeFragment2;
import com.example.myapplication.HomeFragment3;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.ui.dashboard.DashboardFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private ImageButton andar;
    private ImageButton correr;
    private Button pause;
    private Button stop;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       /* ListView listaa = (ListView) root.findViewById(R.id.lista);
        listaa.setVisibility(View.INVISIBLE);*/
        andar = (ImageButton)root.findViewById(R.id.andar);
        correr = (ImageButton)root.findViewById(R.id.correr);
       /* try{
            String x = getActivity().getIntent().getStringExtra("carregar");
            if(x.equals("ir_para_grupos")){
                *//*Fragment newFragment = new DashboardFragment();
                FragmentTransaction transaction =getChildFragmentManager().beginTransaction();
                andar = (ImageButton)root.findViewById(R.id.andar);
                andar.setVisibility(View.INVISIBLE);
                correr = (ImageButton)root.findViewById(R.id.correr);
                correr.setVisibility(View.INVISIBLE);
                TextView andar = (TextView) root.findViewById(R.id.andarrr);
                andar.setVisibility(View.INVISIBLE);
                TextView correr = (TextView) root.findViewById(R.id.correrrr);
                correr.setVisibility(View.INVISIBLE);
                transaction.replace(R.id.fl,newFragment);
                transaction.commit();
                getActivity().getIntent().removeExtra("carregar");*//*

            }
        }
        catch (Exception e){

        }*/







        andar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Fragment2();
            }
        });


        correr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Fragment2();
            }
        });

        try{
            String x = getActivity().getIntent().getStringExtra("extra");
            if(x.equals("resultados2")){
                andar.performClick();
                correr.performClick();

            }
        }
        catch (Exception e){

        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void open_Fragment2(){

        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl,new HomeFragment2());
        fragmentTransaction.commit();
    }

}