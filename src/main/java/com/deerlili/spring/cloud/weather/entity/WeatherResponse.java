package com.deerlili.spring.cloud.weather.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author deerlili
 * @Classname WeatherResponse
 * @Description 天气响应数据
 * @Date 2020-07-08 09:35
 * @Version V1.0
 */
@Data
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Weather data;
    private Integer status;
    private String desc;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
