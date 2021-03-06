package com.example.giuaki.Viewpager;


import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.example.giuaki.R;

import java.util.Arrays;
import java.util.List;

public class PagerAdapter extends android.support.v4.view.PagerAdapter {
    OnPageSelect onPageSelect;

    private static final List<ItemPage> pages =
            Arrays.asList(new ItemPage(R.drawable.ic_car, "Kho Xe", "Tổng quan các xe trong kho"),
                    new ItemPage(R.drawable.ic_receipt, "Hóa Đơn", "Quản lý các hóa đơn mua, bán"));


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View item = LayoutInflater.from(container.getContext()).inflate(R.layout.layout_page, container, false);
        ImageView ivLogo = item.findViewById(R.id.iv_logo);
        TextView tvName = item.findViewById(R.id.tv_name);
        TextView tvContent = item.findViewById(R.id.tv_content);
        RelativeLayout rlPage = item.findViewById(R.id.rl_page);
        onPageSelect = (OnPageSelect) container.getContext();
        ivLogo.setBackground(
                ContextCompat.getDrawable(container.getContext(), (pages.get(position).getDrawbale())));
        tvName.setText(pages.get(position).getTxtName());
        tvContent.setText(pages.get(position).getContent());
        rlPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPageSelect.sendPageSelect(position);

            }
        });


        container.addView(item);
        return item;
    }


    @Override
    public int getCount() {
        return pages.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
