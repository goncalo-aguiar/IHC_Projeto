package com.example.myapplication.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.Notificacoes;
import com.example.myapplication.ProfileOther;
import com.example.myapplication.R;
import com.example.myapplication.Resultados;
import com.example.myapplication.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentNotificationsBinding binding;
    String medalList[] = {"I've walked 20 Km","I've walked 3 days in a row","I've runned 30 Km"};
    int imagens[] = {R.drawable.daa,R.drawable.daa,R.drawable.daa};

    String atividades[] = {"Running Activity","Walking Activity","Running Activity"};
    int atividades_imagens[] = {R.drawable.correr,R.drawable.andar,R.drawable.correr};

    ListView listView;
    ListView listView2;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        listView = (ListView)root.findViewById(R.id.lista);
        CustomBaseAdapter adapter = new CustomBaseAdapter(getContext(),medalList,imagens);
        listView.setAdapter(adapter);


        listView2 = (ListView)root.findViewById(R.id.lista2);
        CustomBaseAdapter2 adapter2 = new CustomBaseAdapter2(getContext(),atividades,atividades_imagens);
        listView2.setAdapter(adapter2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt,
                                    long paramLong) {
                open_Resultados();
            }
        });

        Button nots = (Button)root.findViewById(R.id.nots);
        nots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_nots();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void open_Resultados(){
        Intent intent = new Intent(getActivity(), Resultados.class);
        startActivity(intent);
    }

    public void open_nots(){
        Intent intent = new Intent(getActivity(), Notificacoes.class);
        startActivity(intent);
    }


}