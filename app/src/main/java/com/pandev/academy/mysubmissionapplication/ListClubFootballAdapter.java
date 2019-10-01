package com.pandev.academy.mysubmissionapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListClubFootballAdapter extends RecyclerView.Adapter<ListClubFootballAdapter.ListViewHolder> {

    //implementasi onclic

    private OnClickCallBack onClickCallBack;

    public void setOnClickCallBack(OnClickCallBack onClickCallBack){
        this.onClickCallBack = onClickCallBack;
    }

    //implementasi onclic ^^^^

    private ArrayList<ClubFootball> listClubFootball;

    public ListClubFootballAdapter(ArrayList<ClubFootball> list){
        this.listClubFootball = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_footballclub, viewGroup, false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {

        ClubFootball clubFootball = listClubFootball.get(position);

        Glide.with(holder.itemView.getContext())
                .load(clubFootball.getClubPhoto())
                .into(holder.imgClubPhoto);

        holder.tvClubName.setText(clubFootball.getClubName());
        //holder.tvClubNickName.setText(clubFootball.getClubNickName());
        //holder.tvClubSince.setText(clubFootball.getClubSince());
        //holder.tvClubStadium.setText(clubFootball.getClubStadium());
        //holder.tvClubManager.setText(clubFootball.getClubManager());
        holder.tvClubLeague.setText(clubFootball.getClubLeague());
        //holder.tvClubAbout.setText(clubFootball.getClubAbout());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), listClubFootball.get(holder.getAdapterPosition()).getClubName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickCallBack.onItemClicked(listClubFootball.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {

        return listClubFootball.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgClubPhoto;
        TextView tvClubName, tvClubNickName, tvClubSince, tvClubStadium, tvClubManager, tvClubLeague, tvClubAbout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgClubPhoto = itemView.findViewById(R.id.img_item_logoClub);
            tvClubName = itemView.findViewById(R.id.tv_club_name);
            tvClubLeague = itemView.findViewById(R.id.tv_club_league);
        }
    }

    public interface OnClickCallBack {
        void onItemClicked(ClubFootball data);
    }
}
