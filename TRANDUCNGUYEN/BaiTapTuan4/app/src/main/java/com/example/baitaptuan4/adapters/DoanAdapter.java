package com.example.baitaptuan4.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.baitaptuan4.R;
import com.example.baitaptuan4.models.DoAn;
import com.example.baitaptuan4.ui.Main2Activity;
import com.example.baitaptuan4.ui.ThuAnActivity;

import java.util.ArrayList;

public class DoanAdapter extends RecyclerView.Adapter<DoanAdapter.ViewHolder> {
    Context context;
    ArrayList<DoAn> doAns;

    public DoanAdapter(Context context, ArrayList<DoAn> doAns) {
        this.context = context;
        this.doAns = doAns;
    }

    @NonNull
    @Override
    public DoanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.doan_item, viewGroup, false);
        return new DoanAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoanAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.imageView.setImageResource(doAns.get(i).getIvDoan());
        viewHolder.textView.setText(doAns.get(i).getName());
        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main2Activity.doan="";
                Main2Activity.doan=doAns.get(i).getName();
                ((ThuAnActivity)context).finish();

            }
        });

    }

    @Override
    public int getItemCount() {
        return doAns.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_name);
            imageView = itemView.findViewById(R.id.iv_doan);
            linearLayout = itemView.findViewById(R.id.ln_click);

        }
    }
}
