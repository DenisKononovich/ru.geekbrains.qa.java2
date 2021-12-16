package ru.geekbrains.qa.java2.lesson7_project.project;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "weatherResponse")
public class WeatherResponse {

    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonProperty("Temperature")
    private Temperature temperature;

    @JsonGetter("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }

    @JsonSetter("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Температура = " + temperature +
                ", Описание погоды = " + weatherText;
    }
}