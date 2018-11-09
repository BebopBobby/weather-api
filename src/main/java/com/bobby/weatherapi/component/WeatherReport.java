package com.bobby.weatherapi.component;

import com.bobby.weatherapi.pojos.Query;

public class WeatherReport {
    private Query query;

    public WeatherReport(Query query) {
        this.query = query;
    }

    public WeatherReport() {
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "WeatherReport{" +
                "query=" + query +
                '}';
    }
}
