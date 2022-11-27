package org.seppna;

//класс Валюты Euro имплементируют интерфейс Currency
public class Euro implements Currency {
    @Override
    public String getCurrencyName() {
        return "Euro";
    }
}
