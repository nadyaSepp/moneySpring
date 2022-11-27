package org.seppna;

//класс Валюты Ruble имплементируют(реализует) интерфейс Currency
public class Ruble implements Currency {
    @Override
    public String getCurrencyName() {
        return "Ruble";
    }
}
