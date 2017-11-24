package com.veryworks.iyeongjun.hkapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.veryworks.iyeongjun.hkapp.R;

/**
 * Created by iyeongjun on 2017. 11. 25..
 */

public class TypeAdapter extends RecyclerView.Adapter<TypeAdapter.ViewHolder>{
    int[] images = {
            R.drawable.type_food,
            R.drawable.type_park,
            R.drawable.type_repo,
            R.drawable.type_tour,
            R.drawable.type_shop,
            R.drawable.type_inn,
            R.drawable.type_his
    };
    int[] clickImages = {
            R.drawable.type_c_food,
            R.drawable.type_c_park,
            R.drawable.type_c_repo,
            R.drawable.type_c_tour,
            R.drawable.type_c_shop,
            R.drawable.type_c_inn,
            R.drawable.type_c_his
    };

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
