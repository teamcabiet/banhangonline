package com.example.admin.banhangonline.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.banhangonline.model.Loaisp;

import java.util.ArrayList;

/**
 * Created by Admin on 7/11/2017.
 */

public class LoaispAdapter extends BaseAdapter {
    ArrayList<Loaisp> arrayListloaisp;
    Context context;
    @Override
    public int getCount() {
        return arrayListloaisp.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayListloaisp.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
//    khi load dữ liệu lên lần đầu sẽ bắt ánh xạ để những lần sau k cần phải load lại dl mà nó sẽ gán trực tiếp giá trị vào trong layout
    public class ViewHolder{
        TextView txttenloaisp;

}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
