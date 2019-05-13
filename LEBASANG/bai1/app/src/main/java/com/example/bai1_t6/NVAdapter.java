package com.example.bai1_t6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.ArrayList;
import java.util.List;

public class NVAdapter extends BaseAdapter {
    Context context;
    ArrayList<NhanVien> nhanVienList;
    int layoutID;

    public NVAdapter(Context context, ArrayList<NhanVien> nhanVienList, int layoutID) {
        this.context = context;
        this.nhanVienList = nhanVienList;
        this.layoutID = layoutID;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }


//    public NVAdapter(Context context, List<NhanVien> nhanVienList) {
//        this.context = context;
//        this.nhanVienList = nhanVienList;
//        checkDel = (CheckDel) context;
//    }
//
//    @NonNull
//    @Override
//    public NVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
//        View view = inflater.inflate(R.layout.item_nv, viewGroup, false);
//        return new NVAdapter.ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull NVAdapter.ViewHolder viewHolder, final int i) {
//        if (nhanVienList.get(i).gioiTinh.equals("Nam")) {
//            viewHolder.imageView.setImageResource(R.drawable.ic_boy);
//        } else {
//            viewHolder.imageView.setImageResource(R.drawable.ic_girl);
//
//        }
//        viewHolder.textView.setText(nhanVienList.get(i).maNV + " - " + nhanVienList.get(i).tenNV);
//        viewHolder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    checkDel.checkDel(true,i);
//                }else {
//                    checkDel.checkDel(false,i);
//                }
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return nhanVienList.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView imageView;
//        TextView textView;
//        CheckBox checkBox;
//        ArrayAdapter<String> arrAdap = new ArrayAdapter<String>();
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            imageView = itemView.findViewById(R.id.iv_ava);
//            textView = itemView.findViewById(R.id.tv_info);
//            checkBox=itemView.findViewById(R.id.cb_del);
//        }
//    }
}
