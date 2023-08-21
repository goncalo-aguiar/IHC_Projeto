package com.example.myapplication.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.CriarGrupo;
import com.example.myapplication.GroupCreated;
import com.example.myapplication.GroupCreated22;
import com.example.myapplication.HomeFragment2;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.Registar;
import com.example.myapplication.databinding.FragmentDashboardBinding;
import com.example.myapplication.databinding.FragmentNotificationsBinding;
import com.example.myapplication.ui.notifications.CustomBaseAdapter;
import com.example.myapplication.ui.notifications.CustomBaseAdapter2;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;

    String medalList[] = {"Aveiro Runners","Passeios Montanha","Passeio Feliz","Goat Runners","Soft Runners","Anda connosco"};
    int imagens[] = {R.drawable.grupo,R.drawable.grupo,R.drawable.grupo,R.drawable.grupo,R.drawable.grupo,R.drawable.grupo};

    ListView listView;
    ListView listView2;

    Button criar_grupo;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        listView = (ListView)root.findViewById(R.id.lista);
        CustomBaseAdaptor3 adapter = new CustomBaseAdaptor3(getContext(),medalList,imagens);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt,
                                    long paramLong) {
                     open_Grupo();
            }
        });


        listView2 = (ListView)root.findViewById(R.id.lista3);
        CustomBaseAreaGroups adapter2 = new CustomBaseAreaGroups(getContext(),medalList,imagens);
        listView2.setAdapter(adapter2);

        criar_grupo = (Button) root.findViewById(R.id.criar);
        criar_grupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_CriarGrupo();
            }
        });


        listView2.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt,
                                    long paramLong) {
                open_Grupo2();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void open_CriarGrupo(){
        Intent intent = new Intent(getActivity(), CriarGrupo.class);
        startActivity(intent);
    }

    public void open_Grupo(){
        Intent intent = new Intent(getActivity(), GroupCreated.class);
        startActivity(intent);
    }

    public void open_Grupo2(){
        Intent intent = new Intent(getActivity(), GroupCreated22.class);
        startActivity(intent);
    }


}