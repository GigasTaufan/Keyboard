package com.example.keyboard;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKeyboardAdapter extends RecyclerView.Adapter<ListKeyboardAdapter.ListViewHolder> {
    private ArrayList<Keyboard> listKeyboard;
    private Context context;

    ListKeyboardAdapter(ArrayList<Keyboard> list, Context context){
        this.context = context;
        this.listKeyboard = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_keyboard, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Keyboard keyboard = listKeyboard.get(position);
        Glide.with(holder.itemView.getContext())
                .load(keyboard.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(keyboard.getName());
        holder.tvPrice.setText(keyboard.getPrice());
        holder.tvDetail.setText(keyboard.getDetail());
        holder.tvItemRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailPage.class);
                intent.putExtra("data", keyboard);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKeyboard.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvPrice;
        TextView tvDetail;
        RelativeLayout tvItemRow;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvItemRow = itemView.findViewById(R.id.item_row);
        }
    }
}
