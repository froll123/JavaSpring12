package com.example.seminar12;

import java.util.ArrayList;
import java.util.List;


// Этот класс демонстрирует использование нескольких шаблонов проектирования в простом приложении.
// В качестве шаблонов проектирования используются Singleton, Factory Method и Observer.

public class DesignPatternDemo {

     // Реализация одноэлементного шаблона для обеспечения единого экземпляра класса конфигурации.

    public static class Configuration {
        private static Configuration instance;
        private String configValue;

        private Configuration() {
            // Частный конструктор для предотвращения создания экземпляров
            configValue = "Default Configuration";
        }

        public static Configuration getInstance() {
            if (instance == null) {
                instance = new Configuration();
            }
            return instance;
        }

        public String getConfigValue() {
            return configValue;
        }

        public void setConfigValue(String configValue) {
            this.configValue = configValue;
        }
    }
}