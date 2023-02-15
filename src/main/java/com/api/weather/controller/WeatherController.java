package com.api.weather.controller;


import com.api.weather.entity.daily.DailyData;
import com.api.weather.entity.dailywithparam.ForecastData;
import com.api.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/v3/weather")

public class WeatherController {
    private final WeatherService weatherService;



    @GetMapping("/current/{city}")
    public ResponseEntity<DailyData> getListData(@PathVariable String cityName){
        ResponseEntity<DailyData> response=new ResponseEntity<>(weatherService.getForecast(cityName), HttpStatus.OK);
        return response;
    }

    @GetMapping("/weekly/{city}/{day}")
    public ResponseEntity<ForecastData> getForecastWeekly(@PathVariable String cityName, @PathVariable int day){
        ResponseEntity<ForecastData> response=new ResponseEntity<>(weatherService.getForecastWeekly(cityName, day), HttpStatus.OK);
        return response;
    }
}
