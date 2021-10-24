package com.example.lesson34;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements FragmentAdapter.OnClick {
    private RecyclerView recyclerView;
    private ArrayList<Model> list = new ArrayList<>();
    private FragmentAdapter fragmentAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CreateList();
        initFrag(view);
    }

    private void initFrag(@NotNull View view) {
        recyclerView = view.findViewById(R.id.Recycler);
        fragmentAdapter = new FragmentAdapter();
        fragmentAdapter.setSongs(CreateList(),this);
        recyclerView.setAdapter(fragmentAdapter);
    }
    private ArrayList<Model> CreateList() {
        list = new ArrayList<>();
        list.add(new Model(1, "London", "xcho", "3:10" ));
        list.add(new Model(2, "Патрон", "MiyaGi", "2:44" ));
        list.add(new Model(3, "Аллея", "Jony", "3:21" ));
        list.add(new Model(4, "In love", "MiyaGi", "4:09" ));
        list.add(new Model(5, "Romprasso", "Ignis", "3:18" ));
        list.add(new Model(6, "Lonely", "Plazma", "4:10" ));
        list.add(new Model(7, "Mask Off", "Future", "2:13" ));
        list.add(new Model(8, "Моряк", "Feduk", "3:11" ));
        list.add(new Model(9, "Домофон", "Terry", "4:19" ));
        list.add(new Model(10, "Твои глаза", "Loboda", "3:45" ));
        return list;
    }


    @Override
    public void onItemClick(Model model) {
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        intent.putExtra("key", model.getBlankSpace());
        startActivity(intent);
    }
}