package com.api.weather.entity.daily;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wind {
    private double speed;
    private int deg;
    //please look at this line
    private double gust;
}
