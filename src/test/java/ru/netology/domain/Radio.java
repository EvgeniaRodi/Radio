package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10,100);

    @Test
    public void shouldGetCurrentStation() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldMakeGetCurrentStation() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldMakeGetCurrentStationWithMinus() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
        radio.setCurrentStation(-8);
        assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevStation() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
    public void shouldGetCurrentVolume() {
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(60);
        assertEquals(60, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMoreCurrentVolume() {
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetLessCurrentVolume() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-10);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMaxVolume() {
        radio.setCurrentVolume(60);
        assertEquals(60, radio.getCurrentVolume());
        radio.getMaxVolume();
        assertEquals(61, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetOverMaxVolume() {
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
        radio.getMaxVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldGetMinVolume() {
        radio.setCurrentVolume(70);
        assertEquals(70, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(69, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetUnderMinVolume() {
        assertEquals(0, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}