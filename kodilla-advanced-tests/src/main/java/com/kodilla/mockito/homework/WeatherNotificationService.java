package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherNotificationService {
    private Map<WeatherLocation, List<WeatherClient>> weatherLocations = new HashMap<>();

    public void addLocation(WeatherLocation weatherLocation) {
        this.weatherLocations.put(weatherLocation, new ArrayList<>());
    }

    public void addClient(WeatherLocation weatherLocation, WeatherClient weatherClient) {
        weatherLocations.get(weatherLocation).add(weatherClient);
    }

    public void sendNotificationInLocation(WeatherLocation weatherLocation, WeatherNotification weatherNotification) {
        for (Map.Entry<WeatherLocation, List<WeatherClient>> entry :
                this.weatherLocations.entrySet()) {
            if (entry.getKey().equals(weatherLocation)) {
                entry.getValue().forEach(weatherClient -> weatherClient.receive(weatherNotification));
            }
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        for (Map.Entry<WeatherLocation, List<WeatherClient>> entry :
                this.weatherLocations.entrySet()) {
            entry.getValue().forEach(weatherClient -> weatherClient.receive(weatherNotification));
        }
    }

    public void removeClientFromLocation(WeatherLocation weatherLocation, WeatherClient weatherClient) {
        for (Map.Entry<WeatherLocation, List<WeatherClient>> entry :
                weatherLocations.entrySet()) {
            if (entry.getKey().equals(weatherLocation)) {
                entry.getValue().removeIf(weatherClient1 -> weatherClient1 == weatherClient);
            }
        }
    }

    public void removeClientFromAllLocations(WeatherClient weatherClient) {
        for (Map.Entry<WeatherLocation, List<WeatherClient>> entry :
                this.weatherLocations.entrySet()) {
            entry.getValue().removeIf(weatherClient1 -> weatherClient1 == weatherClient);
        }
    }

    public void removeLocationFromTheList(WeatherLocation weatherLocation) {
        weatherLocations.remove(weatherLocation);
    }


    public int getSizeOfMap() {
        return weatherLocations.size();
    }
}
