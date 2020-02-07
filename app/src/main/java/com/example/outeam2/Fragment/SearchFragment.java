package com.example.outeam2.Fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.outeam2.Adapter.MVenueAdapter;
import com.example.outeam2.Adapter.VenueAdapter;
import com.example.outeam2.Models.Venue;
import com.example.outeam2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements VenueAdapter.OnItemClickListener {
    View view;
    RecyclerView recyclerView;
    GridLayoutManager layoutManager;
//    ArrayList<Venue> list;
    VenueAdapter adapter;

    List<Venue> list;

    public SearchFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = view.findViewById(R.id.rv_venue);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new GridLayoutManager(getContext(),1);
//        recyclerView.setLayoutManager(layoutManager);
//        list = new ArrayList<>();
////        adapter = new VenueAdapter(getActivity(), list);
//        recyclerView.setAdapter(adapter);
//
//        adapter.setOnItemClickListener(this);

        getVenue();


        return view;
    }




    public void getVenue(){
//        list.clear();
//
//        Venue a,b,c,d;
//        a = new Venue("https://q-cf.bstatic.com/images/hotel/max1024x768/731/73131416.jpg","Chaimel","The best place for team building activities","Sanciangko St, Cebu City, 6000 Cebu",12.30);
//        b = new Venue("https://lh5.googleusercontent.com/proxy/ZCphCeN45-4sNIjKyCGAwi3ZaoAWx4YtrsgHOotL9cFlJO8M6sdMv778U1XMKJcX7aIfFm5lWbeSbUwblm4yIH9KxWlMLHrLduk6fxW4b-IJgiqmwb_F7V99Q4_ZecVRFWpFbghluOdzYYlLRV4DgQBruLk","Chaimel","The best place for team building activities","Sanciangko St, Cebu City, 6000 Cebu",12.30);
//        c = new Venue("https://r-cf.bstatic.com/images/hotel/max1024x768/167/167144829.jpg","Chaimel","The best place for team building activities","Sanciangko St, Cebu City, 6000 Cebu",12.30);
//        d = new Venue("https://media.cntraveler.com/photos/5c262c326b0c2057eb60d4d9/4:5/w_767,c_limit/The-Legian-Bali_LEG_Pool_Day_Shot.jpg","Chaimel","The best place for team building activities","Sanciangko St, Cebu City, 6000 Cebu",12.30);
//
//
//        list.add(a);
//        list.add(b);
//        list.add(c);
//        list.add(d);
//        adapter.notifyDataSetChanged();

        list = new ArrayList<>();

        list.add(
                new Venue("Random 1")
        );
        list.add(
                new Venue("Random 2")
        );
        list.add(
                new Venue("Random 3")
        );
        list.add(
                new Venue("Random 4")
        );
        list.add(
                new Venue("Random 5")
        );

        MVenueAdapter adapter = new MVenueAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);

    }


    @Override
    public void onItemClick(int position) {
        Toast.makeText(getActivity(),"yaadawdawdawdawdawdawdh", Toast.LENGTH_SHORT).show();
        //Toast.makeText(getActivity(), "yah", Toast.LENGTH_SHORT).show();
    }
}
