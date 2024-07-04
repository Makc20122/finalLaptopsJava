package LaptopsOOP;

// 📌 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// 📌 Создать множество ноутбуков.
// 📌 Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// 📌 Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// 📌 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.
import java.util.Objects;

import CatOOP.Cat;

public class Laptop {
    // Fields:
    private String model;
    private int ram;
    private String color;
    private String os;

    // Contructor:
    public Laptop(String model, int ram, String color, String os) {
        this.model = model;
        this.ram = ram;
        this.color = color;
        this.os = os;
    }
    // Getters/Setters:

    public String getModel() {
        return model;
    }

    public int getRAM() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public String getOS() {
        return os;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOS(String os) {
        this.os = os;
    }

        @Override
    public String toString() {
        String result = "Модель: " + model + System.lineSeparator() + "ОЗУ: " + ram + System.lineSeparator()
                + "Цвет: " + color + System.lineSeparator() + "ОС: " + os + System.lineSeparator();

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

            Laptop laptop = (Laptop) obj;

        return model.equals(laptop.model) && ram == laptop.ram && color.equals(laptop.color) 
        && os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, ram, color, os);    
    }
}
