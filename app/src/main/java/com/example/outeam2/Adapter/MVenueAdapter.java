package com.example.outeam2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.outeam2.Models.Venue;
import com.example.outeam2.R;

import java.util.List;

public class MVenueAdapter extends RecyclerView.Adapter<MVenueAdapter.ViewHolder> {
    Context context;
    List<Venue> list;

    public MVenueAdapter(Context context, List<Venue> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_venue, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);


        viewHolder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "this is spartaaaaaaa", Toast.LENGTH_SHORT).show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Venue data = list.get(position);

        holder.tvName.setText(data.getV_name());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        LinearLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.venue_name);
            layout = itemView.findViewById(R.id.layout);
        }
    }
}
