package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
    WeatherClient weatherClient1 = Mockito.mock(WeatherClient.class);
    WeatherClient weatherClient2 = Mockito.mock(WeatherClient.class);
    WeatherLocation weatherLocation = Mockito.mock(WeatherLocation.class);
    WeatherLocation weatherLocation1 = Mockito.mock(WeatherLocation.class);
    WeatherLocation weatherLocation2 = Mockito.mock(WeatherLocation.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @Test
    public void clientSubscribedToOneLocationShouldGetNotification() {
        weatherNotificationService.addLocation(weatherLocation);
        weatherNotificationService.addClient(weatherLocation, weatherClient);
        weatherNotificationService.sendNotificationInLocation(weatherLocation, weatherNotification);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);

    }

    @Test
    public void clientAfterCancelingTheSubscriptionShouldNotGetNotificationFromThisLocation() {
        weatherNotificationService.addLocation(weatherLocation);
        weatherNotificationService.addClient(weatherLocation, weatherClient);
        weatherNotificationService.removeClientFromLocation(weatherLocation, weatherClient);
        weatherNotificationService.sendNotificationInLocation(weatherLocation, weatherNotification);
        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
//        System.out.println(weatherNotificationService.getSizeOfMap());
    }

    @Test
    public void clientAfterCancelingAllSubscriptionsShouldGetNoneNotifications() {
        weatherNotificationService.addLocation(weatherLocation);
        weatherNotificationService.addLocation(weatherLocation1);
        weatherNotificationService.addLocation(weatherLocation2);
        weatherNotificationService.addClient(weatherLocation, weatherClient);
        weatherNotificationService.addClient(weatherLocation1, weatherClient);
        weatherNotificationService.addClient(weatherLocation2, weatherClient);
        weatherNotificationService.removeClientFromAllLocations(weatherClient);
        weatherNotificationService.sendNotificationInLocation(weatherLocation, weatherNotification);
        weatherNotificationService.sendNotificationInLocation(weatherLocation1, weatherNotification);
        weatherNotificationService.sendNotificationInLocation(weatherLocation2, weatherNotification);
        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
        System.out.println(weatherNotificationService.getSizeOfMap());
    }

    @Test
    public void notificationFromTheParticularLocationShouldBeSendToParticularClients() {
        weatherNotificationService.addLocation(weatherLocation);
        weatherNotificationService.addLocation(weatherLocation1);
        weatherNotificationService.addClient(weatherLocation, weatherClient);
        weatherNotificationService.addClient(weatherLocation, weatherClient1);
        weatherNotificationService.addClient(weatherLocation1, weatherClient2);
        weatherNotificationService.sendNotificationInLocation(weatherLocation, weatherNotification);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient1, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient2, Mockito.never()).receive(weatherNotification);
        System.out.println(weatherNotificationService.getSizeOfMap());
    }

    @Test
    public void someNotificationsShouldBeSendToAllOfClients() {
        weatherNotificationService.addLocation(weatherLocation);
        weatherNotificationService.addLocation(weatherLocation1);
        weatherNotificationService.addClient(weatherLocation, weatherClient);
        weatherNotificationService.addClient(weatherLocation, weatherClient1);
        weatherNotificationService.addClient(weatherLocation1, weatherClient2);
        weatherNotificationService.sendNotificationToAll(weatherNotification);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient1, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient2, Mockito.times(1)).receive(weatherNotification);
        System.out.println(weatherNotificationService.getSizeOfMap());
    }

    @Test
    public void locationCanBeRemovedFromTheList() {
        weatherNotificationService.addLocation(weatherLocation);
        weatherNotificationService.addLocation(weatherLocation1);
        weatherNotificationService.addClient(weatherLocation, weatherClient);
        weatherNotificationService.addClient(weatherLocation, weatherClient1);
        weatherNotificationService.addClient(weatherLocation1, weatherClient2);
        weatherNotificationService.removeLocationFromTheList(weatherLocation);
        weatherNotificationService.sendNotificationInLocation(weatherLocation, weatherNotification);
        weatherNotificationService.sendNotificationInLocation(weatherLocation1, weatherNotification);
        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
        Mockito.verify(weatherClient1, Mockito.never()).receive(weatherNotification);
        Mockito.verify(weatherClient2, Mockito.times(1)).receive(weatherNotification);
        System.out.println(weatherNotificationService.getSizeOfMap());
    }
}