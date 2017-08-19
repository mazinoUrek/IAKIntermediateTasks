package org.nui.dev.intermediatetask;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nui on 8/13/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_list, parent, false);
        return new WeatherViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private final CardView mWeatherCardView;
        private final ImageView mWeatherImageList;
        private final TextView mWeatherDateList;
        private final TextView mWeatherDesc;
        private final TextView mWeatherTemp;

        public WeatherViewHolder(View itemView) {
            super(itemView);

            mWeatherCardView = (CardView) itemView.findViewById(R.id.cv_weather_list_adapter);
            mWeatherImageList   = (ImageView)   itemView.findViewById(R.id.iv_weather_list_image);
            mWeatherDateList    = (TextView)    itemView.findViewById(R.id.tv_weather_date_list);
            mWeatherDesc        = (TextView)    itemView.findViewById(R.id.tv_main_weather_list);
            mWeatherTemp     = (TextView)    itemView.findViewById(R.id.tv_temp_list);

            mWeatherCardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(),DetailActivity.class);
            v.getContext().startActivity(intent);

        }
    }
}
