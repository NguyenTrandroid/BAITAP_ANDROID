package com.example.giuaki.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.giuaki.Ui.BillDetailActivity;
import com.example.giuaki.Interfaces.CallBackRemoveBill;
import com.example.giuaki.Models.Bill;
import com.example.giuaki.R;

import java.util.List;

public class BillAdapter extends RecyclerView.Adapter<BillAdapter.ViewHolder> {
    Context context;
    List<Bill> bills;
    CallBackRemoveBill callBackRemoveBill;
   public int count = 0;

    public BillAdapter(Context context, List<Bill> bills) {
        this.context = context;
        this.bills = bills;
        callBackRemoveBill = (CallBackRemoveBill) context;
    }

    @NonNull
    @Override
    public BillAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_bill, viewGroup, false);
        return new BillAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final BillAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.textView.setText(bills.get(i).getDate());
        if (bills.get(i).isCheckOn()) {
            viewHolder.iv_check.setVisibility(View.VISIBLE);
        } else {
            viewHolder.iv_check.setVisibility(View.INVISIBLE);
        }
        if (bills.get(i).isCheckRemove()) {
            viewHolder.iv_check.setImageResource(R.drawable.ic_oval_check);
        } else {
            viewHolder.iv_check.setImageResource(R.drawable.ic_oval);
        }
        viewHolder.iv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bills.get(i).isCheckRemove()) {
                    count--;
                    Log.d("AAA", count + "");
                    bills.get(i).setCheckRemove(false);
                    if (count == 0) {
                        for (int i = 0; i < bills.size(); i++) {
                            bills.get(i).setCheckOn(false);
                        }
                    }
                } else {
                    count++;
                    Log.d("AAA", count + "");
                    bills.get(i).setCheckRemove(true);


                }

                notifyDataSetChanged();
                callBackRemoveBill.RemoveBills(count);
            }
        });
        viewHolder.cardView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                for (int i = 0; i < bills.size(); i++) {
                    bills.get(i).setCheckOn(true);
                }
                notifyDataSetChanged();
                return false;
            }
        });
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BillDetailActivity.class);
                intent.putExtra("IDBill", bills.get(i).getMADDH());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bills.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        TextView textView;
        CardView cardView;
        ImageView iv_check;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_date);
            cardView = itemView.findViewById(R.id.cv_bill);
            iv_check = itemView.findViewById(R.id.iv_check);
            cardView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.add(getAdapterPosition(), 5, 0, "Chỉnh sửa");

        }
    }
}
