package com.example.giuaki.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.giuaki.Models.BillDetail;
import com.example.giuaki.Models.Car;
import com.example.giuaki.R;

import java.util.List;

public class BillDetailAdapter extends RecyclerView.Adapter<BillDetailAdapter.ViewHolder> {
    List<BillDetail> billDetails;
    Context context;

    public BillDetailAdapter(List<BillDetail> billDetails, Context context) {
        this.billDetails = billDetails;
        this.context = context;
    }

    @NonNull
    @Override
    public BillDetailAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_car, viewGroup, false);
        return new BillDetailAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BillDetailAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tvName.setText(billDetails.get(i).getTenXe());
        viewHolder.tvDt.setText("Mã xe: " + billDetails.get(i).getMaXe());
        viewHolder.tvPrice.setText("Số lượng: " + billDetails.get(i).getSoLuong());

    }

    @Override
    public int getItemCount() {
        return billDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        TextView tvName, tvDt, tvPrice;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDt = itemView.findViewById(R.id.tv_dt);
            tvPrice = itemView.findViewById(R.id.tv_price);
            cardView = itemView.findViewById(R.id.cv_car);
            cardView.setOnCreateContextMenuListener(this);
        }


        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.add(getAdapterPosition(), 7, 0, "Chỉnh sửa");
            menu.add(getAdapterPosition(), 8, 1, "Xóa");
        }
    }
}
