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
    public void shouldMakeGetCurrentStationWithMinus() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
        radio.setCurrentStation(-8);
        assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(10, radio.getCurrentStation());
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
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetMoreCurrentVolume() {
        radio.setCurrentVolume(15);
        assertEquals(15, radio.getCurrentVolume());
        radio.setCurrentVolume(15);
        assertEquals(15, radio.getCurrentVolume());
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
        assertEquals(0, radio.getCurrentVolume());
        radio.getMaxVolume();
        assertEquals(1, radio.getCurrentVolume());
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
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetUnderMinVolume() {
        assertEquals(0, radio.getCurrentVolume());
        radio.getMinVolume();
        assertEquals(0, radio.getCurrentVolume());
    }







}