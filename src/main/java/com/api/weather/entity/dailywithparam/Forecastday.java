package com.api.weather.entity.dailywithparam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forecastday {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;
    private int date_epoch;
    private Day day;
    private Astro astro;
    private ArrayList<Hour> hour;
}