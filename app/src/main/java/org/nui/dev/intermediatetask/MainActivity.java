package org.nui.dev.intermediatetask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMainDays;
    private ImageView mWeatherImage;
    private TextView mWeatherName;
    private TextView mMainTemperatur;
    private RecyclerView mMainWeatherList;
    private LinearLayoutManager layoutManager;
    private WeatherAdapter mWeatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initviewBaru();
    }

    private void initviewBaru() {
        mMainDays = (TextView) findViewById(R.id.tv_main_days);
        mWeatherImage = (ImageView) findViewById(R.id.iv_weather_main_image);
        mWeatherName = (TextView) findViewById(R.id.tv_weather_main_name);
        mMainTemperatur = (TextView) findViewById(R.id.tv_temperatur);
        mMainWeatherList = (RecyclerView) findViewById(R.id.rv_weather_list);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mMainWeatherList.setLayoutManager(layoutManager);
        mMainWeatherList.setHasFixedSize(true);

        mWeatherAdapter = new WeatherAdapter();
        mMainWeatherList.setAdapter(mWeatherAdapter);

    }
}
