package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;

public class Lab7 {
    public static void main (String [] args) {
        JFrame testWindow = new Panel();
        testWindow.setVisible(true);
//        text1.setText(printCollection("Оригинал", list));
        
        List<MyClass> list = new ArrayList<MyClass>();

        list.add(new MyClass("Nike", "кроссовки", "синий", 20));
        list.add(new MyClass("Adidas", "шлёпки", "красный", 12));
        list.add(new MyClass("Marko", "сапоги", "белый", 47));
        list.add(new MyClass("Megatop", "ботинки", "чёрный", 15));
        list.add(new MyClass("Fila", "кеды", "коричневый", 9));
        list.add(new MyClass("NewB", "тапки", "зелёный", 55));

        printCollection("Оригинал", list);

        // Смешивание
        Collections.shuffle(list);
        printCollection("Смешивание", list);

        // Обратный порядок
        Collections.reverse(list);
        printCollection("Обратный порядок", list);

        // "Проворачивание" на определенное количество
        Collections.rotate(list, 2); // Число может быть отрицательным - тогда порядок будет обратный
        printCollection("Проворачивание", list);

        // Обмен элементов
        Collections.swap(list, 0, list.size()-1);
        printCollection("Обмен элементов", list);

        // Замена
        Collections.replaceAll(list, new MyClass("Adidas", "шлёпки", "красный", 12), new MyClass("Gucci", "туфли", "чёрный", 15));
        printCollection("Замена", list);

        // Копирование - здесь обязательно надо иметь нужные размеры
        List<MyClass> list2 = new ArrayList<MyClass>(list.size());
        // Поэтому заполняем список. Хоть чем-нибудь.
        for(MyClass mc : list) {
            list2.add(null);
        }
        // Компируем из правого аргумента в левый
        Collections.copy(list2, list);
        printCollection("Копирование", list2);

        // Полная замена
        Collections.fill(list2, new MyClass("Lacoste", "полукеды", "серый", 8));
        printCollection("Полная замена", list2);

    
}
    private static void printCollection(String title, List<MyClass> list) {
        System.out.println(title);
        for(MyClass mc : list) {
            System.out.println(mc);
        }
        System.out.println();
    }
}
