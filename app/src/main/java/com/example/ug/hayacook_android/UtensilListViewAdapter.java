package com.example.ug.hayacook_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by UG on 2016-01-15.
 */
public class UtensilListViewAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<String> utensil;     // 다량의 데이터
    LayoutInflater inf;

    public UtensilListViewAdapter(Context context, int layout, ArrayList<String> utensil) {
        this.context = context;
        this.layout = layout;
        this.utensil = utensil;
        this.inf = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() { // 총 데이터의 개수를 리턴
        return utensil.size();
    }
    @Override
    public Object getItem(int position) { // 해당번째의 데이터 값
        return utensil.get(position);
    }
    @Override
    public long getItemId(int position) { // 해당번째의 고유한 id 값
        return position;
    }
    @Override // 해당번째의 행에 내용을 셋팅(데이터와 레이아웃의 연결관계 정의)
    public View getView(int position, View convertView, ViewGroup parent) {
        //해당행 순서,   해당행 레이아웃,          리스트뷰
        // 한행의 화면을 셋팅하는 메서드 (가장 중요)
        if (convertView == null)
            convertView = inf.inflate(layout, null);
        //xml파일로 레이아웃객체 생성

        TextView textView1 = (TextView)convertView.findViewById(R.id.textView1);
        textView1.setText(utensil.get(position));

        return convertView;
    }

}
