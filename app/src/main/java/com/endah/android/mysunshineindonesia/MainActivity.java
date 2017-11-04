package com.endah.android.mysunshineindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.weather_day_title)
    TextView weatherDayTitle;

    @BindView(R.id.img_weather)
    ImageView imgWeather;

    @BindView(R.id.weather_dsc)
    TextView weatherDesc;

    @BindView(R.id.weather_temperature)
    TextView weatherTemperature;

    @BindView(R.id.weather_list)
    RecyclerView weatherList;

    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        weatherDayTitle = (TextView) findViewById(R.id.weather_day_title);
        imgWeather = (ImageView) findViewById(R.id.img_weather);
        weatherDesc = (TextView) findViewById(R.id.weather_dsc);
        weatherTemperature = (TextView) findViewById(R.id.weather_temperature);

        weatherDayTitle.setText("Hari Minggu");
        weatherDesc.setText("Hari Terang Benderang");
        weatherTemperature.setText("30 Derajat");

        imgWeather.setImageResource(R.drawable.icon_weather);

        weatherList.setLayoutManager(
                new LinearLayoutManager(
                        this, LinearLayoutManager.VERTICAL, false));

        weatherAdapter = new WeatherAdapter();
        weatherList.setAdapter(weatherAdapter);
    }
}
