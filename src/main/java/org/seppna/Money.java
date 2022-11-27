package org.seppna;


//класс Валюта содержать два поля: количество денег и валюта, геттеры для данных полей
public class Money {
    private double count;
    private Currency currency;

    public Money(Double count, Currency currency) {
        this.count = count;
        this.currency = currency;
    }

    public double getCount() {
        return count;
    }

    public Currency getCurrency() {
        return currency;
    }
}
