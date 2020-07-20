package com.deerlili.spring.cloud.weather.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author deerlili
 * @Classname Weather
 * @Description 天气数据
 * @Date 2020-07-08 09:33
 * @Version V1.0
 */

@Data
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    private Yesterday yesterday;
    private String city;
    private List<Forecast> forecast;
    private String ganmao; //感冒
    private String wendu; //温度

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }
}
