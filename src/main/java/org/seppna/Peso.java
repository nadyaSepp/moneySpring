package org.seppna;

//класс Валюты Peso имплементируют интерфейс Currency
public class Peso implements Currency {
    @Override
    public String getCurrencyName() {
        return "Peso";
    }
}
