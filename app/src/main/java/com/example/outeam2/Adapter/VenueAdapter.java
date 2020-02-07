package com.example.outeam2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.outeam2.Models.Venue;
import com.example.outeam2.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.example.outeam2.IP.IpAddress.getIP;

public class VenueAdapter extends RecyclerView.Adapter<VenueAdapter.VenueViewHolder> {
    private Context mcontext;
    private ArrayList<Venue> venue;
    LayoutInflater inflater;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;

    }


    public VenueAdapter(Context mcontext, ArrayList<Venue> venue){
        this.mcontext = mcontext;
        this.venue = venue;
        this.inflater = LayoutInflater.from(mcontext);

    }

    @Override
    public VenueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_venue,parent,false);
        return new VenueViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VenueViewHolder holder, int position) {
        Venue v = venue.get(position);
        String image = v.getV_img();
        String name = v.getV_name();
        String description = v.getV_description();
        String address = v.getV_address();
        double price = v.getV_rph();

        holder.bind(image,name,description,address,price);

    }

    @Override
    public int getItemCount() {
        return venue.size();
    }


    public class VenueViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView venuename,venuedescription,venueaddress,venueprice;
        public VenueViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.venue_img);
            venuename = itemView.findViewById(R.id.venue_name);
            venuedescription = itemView.findViewById(R.id.venue_desc);
            venueaddress = itemView.findViewById(R.id.venue_address);
            venueprice = itemView.findViewById(R.id.venue_price);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mListener!=null){
                        int position = getAdapterPosition();
                        if(position!= RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
            });



        }
        private void bind(String img, String name,String description, String address,double price){
            Picasso.get().load(img).into(image);
            venuename.setText(name);
            venuedescription.setText(description);
            venueaddress.setText(address);
            venueprice.setText(String.valueOf(price));



        }
    }
}

