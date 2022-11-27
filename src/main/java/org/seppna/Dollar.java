package org.seppna;

//класс  Валюты Dollar имплементируют интерфейс Currency
public class Dollar implements Currency{
    @Override
    public String getCurrencyName() {
        return "Dollar";
    }
}
