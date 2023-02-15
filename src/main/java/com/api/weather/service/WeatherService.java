package com.api.weather.service;

import com.api.weather.entity.daily.DailyData;
import com.api.weather.entity.dailywithparam.ForecastData;
import com.api.weather.exception.InvalidDay;
import com.api.weather.exception.NotFoundException;
import org.springframework.web.client.RestTemplate;

public class WeatherService {
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DailyData getForecast(String cityName){
        DailyData listData =restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + "487ad996be4da2f1090d8837e3e40466", DailyData.class);
        if (cityName==null){
            throw new NotFoundException("City Name");
        }
        return listData;

    }
    public ForecastData getForecastWeekly(String cityName, int day){
        ForecastData forecastData=restTemplate.getForObject("http://api.weatherapi.com/v1/forecast.json?key="+"89325f081c74e25a23e86b0b811d5314"+"&q=" + cityName + "&days=" + day + "&aqi=no&alerts=no", ForecastData.class);
        if (cityName==null){
            throw new NotFoundException("City Name");
        } else if (day<0 || day >7) {
            throw  new InvalidDay();

        }
        return forecastData;
    }
}
