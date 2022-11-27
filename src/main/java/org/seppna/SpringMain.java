//Домашнее задание:
//1.	Реализуйте интерфейс Currency (валюта). Этот интерфейс должен иметь метод getCurrencyName, который возвращает полное название данной валюты.
//2.	Опишите 4 класса, которые имплементируют интерфейс Currency.
//        •	Dollar
//        •	Euro
//        •	Ruble
//        •	Peso
//3.	Опишите класс Money, который должен содержать два поля: количество денег и валюта.(Currency).
// Написать геттеры для данных полей.
//4.	Опишите класс Wallet, который содержит List объектов класса Money.
// Кошелёк должен содержать метод showBalance(), который печатает на экран количество каждой валюты в кошельке.
//5.	Создайте спринг конфиг с помощью джава класса.
//6.	Создайте файл money.properties в папке resources и укажите @PropertySource в конфиге спринга.
//7.	Опишите в файле money.properties количество каждой валюты:
//        •	dollars=
//        •	euros=
//        •	rubles=
//        •	pesos=
//8.	С помошью аннотации @Bean в конфиге опишите бин dollars который является объектом класса Money. Численное значение внедрите из файла properties (${money.dollars}.
//
//9.	Проделайте те же самые действия для бинов euros, rubles, pesos.
//10.	 С помощью аннотации @Bean в конфиге опишите бин List<Money>,  который является ArrayList-ом выше перечисленных бинов
//11.	 Внедрите бин из пункта 10 в бин класса Wallet с помощью аннотации @Autowired
//12.	 Протестируйте выше проделанные действия получением бина wallet из контекста и вызовом у него метода showBalance


package org.seppna;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//точка входа
public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        Wallet wallet = context.getBean("wallet", Wallet.class);
        wallet.showBalance();

        context.close();


    }


}
