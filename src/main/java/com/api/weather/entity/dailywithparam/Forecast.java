package com.api.weather.entity.dailywithparam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forecast {
    private ArrayList<Forecastday> forecastday;
}