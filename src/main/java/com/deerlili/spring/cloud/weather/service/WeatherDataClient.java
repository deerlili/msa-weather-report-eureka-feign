package com.deerlili.spring.cloud.weather.service;

import com.deerlili.spring.cloud.weather.entity.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("msa-weather-data-eureka") // 服务地址
public interface WeatherDataClient {

    @GetMapping("/weather/cityId/{cityId}") //申明资源的位置
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
