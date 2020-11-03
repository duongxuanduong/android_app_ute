package com.example.foody.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foody.R;
import com.example.foody.model.Store;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<Store> mData;

    public RecyclerViewAdapter(Context mContext, List<Store> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.grid_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_store_name.setText(mData.get(position).getName());
        holder.img_store_thumbnail.setImageResource(mData.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_store_name;
        ImageView img_store_thumbnail;
        TextView tv_store_address;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_store_name = (TextView) itemView.findViewById(R.id.store_name);
            tv_store_address = (TextView)  itemView.findViewById(R.id.description);
            img_store_thumbnail = (ImageView) itemView.findViewById(R.id.store_img);
        }
    }
}
