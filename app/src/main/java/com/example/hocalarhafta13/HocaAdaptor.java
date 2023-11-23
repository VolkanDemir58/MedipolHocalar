package com.example.hocalarhafta13;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class HocaAdaptor  extends RecyclerView.Adapter<HocaViewHolder> {

    ArrayList<Hoca> hocalar;
    Context context;

    public HocaAdaptor(ArrayList<Hoca> hocalar, Context context) {
        this.hocalar = hocalar;
        this.context = context;
    }


    @NonNull
    @Override
    public HocaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_hoca,parent,false);
        return new HocaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HocaViewHolder viewHolder, int position) {
        viewHolder.txtMail.setText(hocalar.get(position).getMail());
        viewHolder.txtIsim.setText(hocalar.get(position).getIsim());
        GlideUtil.resmiIndiripGoster(context,hocalar.get(position).getResimUrl(),viewHolder.imgHoca);
    }
    @Override
    public int getItemCount() {
        return hocalar.size();
    }
}
