package org.seppna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//класс Wallet (Кошелёк), который содержит List объектов класса Money.
//Кошелёк должен содержать метод showBalance(), который печатает на экран количество каждой валюты в кошельке

@Component //Показываем,что это должно быть экземпляром компонента для Spring
public class Wallet {
    @Autowired //ищет во всех наших классах приложения подходящий bean, кот. может тут внедрить
    private List<Money> wallet;

    //метод,который печатает на экран количество каждой валюты в кошельке
    public void showBalance(){
        for(Money money : wallet) {
            System.out.printf("Count: %f; Currency: %s\n", money.getCount(), money.getCurrency().getCurrencyName());
        }
    }
}