package com.deerlili.spring.cloud.weather.service;

import com.deerlili.spring.cloud.weather.entity.City;
import com.deerlili.spring.cloud.weather.entity.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("msa-weather-city-eureka") // 服务地址
public interface CityClient {
    @GetMapping("cities") //申明资源的位置
    List<City> cityList() throws Exception;
}
