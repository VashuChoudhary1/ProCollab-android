package com.example.vashu.sihproject;

import static com.example.vashu.sihproject.R.drawable.project_img1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public final String ARG_PARAM1 = "param1";
    public final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    public String mParam1;
    public String mParam2;

    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public  SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitializing();

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        ArrayList<project_modals> arrayList = new ArrayList<>();
        project_adapter adapter = new project_adapter(getContext(),arrayList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void dataInitializing() {
        ArrayList<project_modals> arrayList = new ArrayList<>();
        project_modals modal= new project_modals("Project 1","My Project", project_img1);

        arrayList.add(new project_modals("Project 2","My Second Project",project_img1));
        arrayList.add(new project_modals("Project 3","My third Project",project_img1));
        arrayList.add(new project_modals("Project 4","My fourth Project",project_img1));
        arrayList.add(new project_modals("Project 5","My fifth Project",project_img1));
        arrayList.add(new project_modals("Project 6","My sixth Project",project_img1));
        arrayList.add(new project_modals("Project 7","My Seventh Project",project_img1));


    }
}