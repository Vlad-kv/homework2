package ru.ifmo.droid2016.tmdb.utils;

import android.view.View;
import ru.ifmo.droid2016.tmdb.TmdbDemoApplication;

public class MyRecyclerAdapterLand extends MyRecyclerAdapter {

    public MyRecyclerAdapterLand() {
        super();
    }

    @Override
    protected void setNormalItem(MyRecyclerAdapter.ViewHolder holder) {
        holder.progressBar.setVisibility(View.INVISIBLE);
        holder.mSimpleDraweeView.setVisibility(View.VISIBLE);
        holder.localizedTitle.setVisibility(View.VISIBLE);
        holder.overviewText.setVisibility(View.VISIBLE);

        holder.mSimpleDraweeView.getLayoutParams().width = (int)(TmdbDemoApplication.displayHeight / (1.4142));
        holder.mSimpleDraweeView.getLayoutParams().height = TmdbDemoApplication.displayHeight;
        holder.mSimpleDraweeView.requestLayout();
    }

    @Override
    protected void setItemInDownload(MyRecyclerAdapter.ViewHolder holder) {
        holder.progressBar.setVisibility(View.VISIBLE);
        holder.mSimpleDraweeView.setVisibility(View.INVISIBLE);
        holder.localizedTitle.setVisibility(View.INVISIBLE);
        holder.overviewText.setVisibility(View.INVISIBLE);

        holder.mSimpleDraweeView.getLayoutParams().width = 100;
        holder.mSimpleDraweeView.getLayoutParams().height = 100;
        holder.mSimpleDraweeView.requestLayout();
    }
}
