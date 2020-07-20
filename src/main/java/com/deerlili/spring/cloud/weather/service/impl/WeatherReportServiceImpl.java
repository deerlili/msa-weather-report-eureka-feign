package com.deerlili.spring.cloud.weather.service.impl;

import com.deerlili.spring.cloud.weather.entity.Weather;
import com.deerlili.spring.cloud.weather.entity.WeatherResponse;
import com.deerlili.spring.cloud.weather.service.WeatherDataClient;
import com.deerlili.spring.cloud.weather.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author deerlili
 * @Classname WeatherReportServiceImpl
 * @Description 天气预报接口实现
 * @Date 2020-07-09 10:20
 * @Version V1.0
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataClient weatherDataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        // 由天气数据API微服务来提供
        WeatherResponse resp = weatherDataClient.getDataByCityId(cityId);
        Weather data = resp.getData();
        return data;
    }
}
