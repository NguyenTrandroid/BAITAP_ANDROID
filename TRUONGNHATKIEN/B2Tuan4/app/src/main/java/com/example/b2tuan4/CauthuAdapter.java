package com.example.b2tuan4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

public class CauthuAdapter extends RecyclerView.Adapter<CauthuAdapter.ViewHolder> {
    Context context;
    ArrayList<Cauthu> cauthus;

    public CauthuAdapter(Context context, ArrayList<Cauthu> cauthus) {
        this.context = context;
        this.cauthus = cauthus;
    }

    @NonNull
    @Override
    public CauthuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.cauthu_item, viewGroup, false);
        return new CauthuAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CauthuAdapter.ViewHolder viewHolder, int i) {
        viewHolder.ivCauthua.setImageResource(cauthus.get(i).getImgCauthu());
        viewHolder.ivFlag.setImageResource(cauthus.get(i).getImgFflag());
        viewHolder.tvName.setText(cauthus.get(i).getName());
        viewHolder.tvBirthday.setText(cauthus.get(i).getBirthday());

    }

    @Override
    public int getItemCount() {
        return cauthus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCauthua, ivFlag;
        TextView tvName, tvBirthday;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCauthua = itemView.findViewById(R.id.iv_cauthu);
            ivFlag = itemView.findViewById(R.id.iv_flag);
            tvName = itemView.findViewById(R.id.tv_name);
            tvBirthday = itemView.findViewById(R.id.tv_birhtday);
        }

    }
}
