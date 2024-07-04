package LaptopsOOP;
// 📌 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и

import java.util.ArrayList;

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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import LaptopsOOP.Laptop;

public class LaptopMain {
    public void main(String[] args) {

        Laptop laptop1 = new Laptop("Rome", 4, "Red", "Linux");
        Laptop laptop2 = new Laptop("Paris", 32, "Blue", "Windows");
        Laptop laptop3 = new Laptop("California", 64, "Red", "Linux");
        Laptop laptop4 = new Laptop("Minsk", 16, "Blue", "MacOS");
        Laptop laptop5 = new Laptop("London", 8, "Black", "Windows");
        Laptop laptop6 = new Laptop("Minsk32", 32, "Blue", "MacOS");
        Laptop laptop7 = new Laptop("Rome8", 8, "Red", "Linux");

        Set<Laptop> laptops = new HashSet<>(
                Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7));
        // for (Laptop laptop : laptops) {
        // String model = laptop.getModel();
        // if (model.contains("Rome")) {
        // System.out.println(laptop);
        // }
        // }

        while (true) {
            System.out.println("Введите 1 чтобы показать все ноутбуки:");
            System.out.println("Введите 2 чтобы выбрать параметры для фильтрации:");
            System.out.println("Введите q чтобы выйти:");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")) {
                for (Laptop laptop : laptops) {
                    System.out.println(laptop);
                }
            }
            if (input.equals("2")) {
                while (true) {
                    System.out.println("Введите 1 чтобы фильтровать по модели");
                    System.out.println("Введите 2 чтобы фильтровать по цвету");
                    System.out.println("Введите 3 чтобы фильтровать по операционной системе:");
                    System.out.println("Введите 4 чтобы фильтровать по минимуму оперативной памяти:");
                    System.out.println("Введите q чтобы вернуться назад:");
                    input = sc.nextLine();

                    if (input.equals("q"))
                        break;

                    if (input.equals("1")) {
                        while (true) {
                            System.out.println("Введите название по образцу или q чтобы выйти");
                            System.out.println("В наличии следующие модели: Rome, Paris, California, London, Minsk");
                            input = sc.nextLine();
                            for (Laptop laptop : laptops) {
                                String model = laptop.getModel();
                                if (model.contains(input)) {
                                    System.out.println(laptop);
                                }
                            }
                            if (input.equals("q"))
                                break;
                        }
                    }
                    if (input.equals("2")) {
                        while (true) {
                            System.out.println("Введите название по образцу или q чтобы выйти");
                            System.out.println("В наличии следующие цвета: Red, Blue, Black");
                            input = sc.nextLine();
                            for (Laptop laptop : laptops) {
                                String model = laptop.getColor();
                                if (model.contains(input)) {
                                    System.out.println(laptop);
                                }
                            }
                            if (input.equals("q"))
                                break;
                        }
                    }
                    if (input.equals("3")) {
                        while (true) {
                            System.out.println("Введите название по образцу или q чтобы выйти");
                            System.out.println("В наличии следующие операционный системы: Linux, Windows, MacOS");
                            input = sc.nextLine();
                            for (Laptop laptop : laptops) {
                                String model = laptop.getOS();
                                if (model.contains(input)) {
                                    System.out.println(laptop);
                                }
                            }
                            if (input.equals("q"))
                                break;
                        }
                    }
                    if (input.equals("4")) {
                        while (true) {
                            System.out.println("Введите название по образцу минимальное количество ОЗУ или q чтобы выйти");
                            input = sc.nextLine();
                            int count = Integer.parseInt(input);
                            for (Laptop laptop : laptops) {
                                int model = laptop.getRAM();
                                if (model >= count) {
                                    System.out.println(laptop);
                                }
                            }
                            if (input.equals("q"))
                                break;
                        }

                    }
                }
            }
            if (input.equals("q"))
                break;
        }
    }
}