package com.tayfuncesur.databinding.adapter;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.tayfuncesur.databinding.BR;
import com.tayfuncesur.databinding.R;
import com.tayfuncesur.databinding.model.MyHandler;
import com.tayfuncesur.databinding.model.places;

import java.util.List;

/**
 * Created by TayfunCesur on 23/04/17.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.Row>{

    private Context mContext;
    private List<places> mDataSource;

    public MainAdapter(Context context, List<places> mDataSource) {
        this.mContext = context;
        this.mDataSource = mDataSource;

    }


    @Override
    public Row onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Row(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false));
    }

    @Override
    public void onBindViewHolder(Row holder, int position) {
        holder.update(position);
    }

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView imageView, String url) {
        Picasso.with(imageView.getContext()).load(url).into(imageView);
    }

    @Override
    public int getItemCount() {
        return mDataSource.size();
    }

    public class Row extends RecyclerView.ViewHolder implements MyHandler{

        private ViewDataBinding viewDataBinding;

        public Row(View itemView) {
            super(itemView);
            this.viewDataBinding = DataBindingUtil.bind(itemView);

        }

        protected void update(int pos) {
            mDataSource.get(pos).setPosition(pos + 1);
            viewDataBinding.setVariable(BR.place, mDataSource.get(pos));
            viewDataBinding.setVariable(BR.handler,this);
            viewDataBinding.executePendingBindings();
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(mContext,"onClick",Toast.LENGTH_SHORT).show();
        }
    }
}
