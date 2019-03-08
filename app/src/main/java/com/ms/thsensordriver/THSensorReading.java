package com.ms.thsensordriver;

public class THSensorReading {
    String sensorOutput = "OUTPUT ";
    String strTemperature;
    String strHumidity;
    String strActivity;

    THSensorReading(String output, String temperature, String humidity, String activity){
        sensorOutput = sensorOutput + output + ":";
        strTemperature = temperature;
        strHumidity = humidity;
        strActivity = activity;
    }

    @Override
    public String toString() {
        return sensorOutput + "\n" +
                "Temperature: " + strTemperature + " F" + "\n" +
                "Humidity:  " + strHumidity + " %" + "\n" +
                "Activity:  " + strActivity + "\n";
    }
}