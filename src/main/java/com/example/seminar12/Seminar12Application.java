package com.example.seminar12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Основной метод демонстрации использования шаблонов проектирования.

@SpringBootApplication
public class Seminar12Application {

	public static void main(String[] args) {
		// Демонстрация одноэлементного шаблона
		DesignPatternDemo.Configuration config = DesignPatternDemo.Configuration.getInstance();
		System.out.println("Initial Config Value: " + config.getConfigValue());
		config.setConfigValue("Updated Configuration");
		System.out.println("Updated Config Value: " + config.getConfigValue());

		// Демонстрация шаблона заводского метода
		Shape circle = ShapeFactory.createShape("CIRCLE");
		circle.draw();
		Shape square = ShapeFactory.createShape("SQUARE");
		square.draw();

		// Демонстрирующий паттерн наблюдателя
		Subject subject = new Subject();
		ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
		ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

		subject.attach(observer1);
		subject.attach(observer2);

		subject.notifyObservers("First Update!");
		subject.detach(observer1);
		subject.notifyObservers("Second Update after detaching Observer 1!");
	}

}
