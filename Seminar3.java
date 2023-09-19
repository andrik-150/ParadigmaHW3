package seminar_3;

import seminar_3.adapter.*;
import seminar_3.decorator.*;
import seminar_3.figures.Shape;
import seminar_3.figures.ShapeFactory;
import seminar_3.figures.ShapeType;
import seminar_3.strategy.BubleSort;
import seminar_3.strategy.SelectionSort;
import seminar_3.strategy.SortStrategy;

import java.util.Arrays;

public class Seminar3 {
    public static void main(String[] args) {

// Часть №2

// Задание №1   Фабричный метод
// Реализуйте паттерн Фабричный метод на языке Java для создания геометрических
// фигур. Создайте класс ShapeFactory, имеющий метод create_shape(), который
// возвращает объекты различных геометрических фигур.

        System.out.println("__________  Задание №1  ___________________________________");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.create_shape(ShapeType.TRIANGLE);
        shape.drawShape();
        shape = shapeFactory.create_shape(ShapeType.CIRCLE);
        shape.drawShape();
        shape = shapeFactory.create_shape(ShapeType.SQUARE);
        shape.drawShape();
        System.out.println();


// Задание №2   Адаптор
// Создайте класс ElectricSocket, который имеет метод supply_electricity(voltage).
// Реализуйте класс USPlugAdapter, который адаптирует розетку стандарта США к европейскому
// стандарту. Создайте объекты и продемонстрируйте передачу электроэнергии через адаптер.

        System.out.println("__________  Задание №2  ___________________________________");
        // создаём розетку с напряжением 110V
        iElectricitySupplier supplier = new ElectricSocket(VoltageType.V110);
        // создаём настольную лампу с напряжением 220V
        TableLamp lamp = new TableLamp();
        // пробуем включить лампу в розетку
        lamp.turnOnDevice(supplier.supply_electricity());
        // создаём адаптер
        iElectricitySupplier supplier1 = new USPlugAdapter(new ElectricSocket(VoltageType.V110));
        // пробуем включить лампу в розетку через адаптер
        lamp.turnOnDevice(supplier1.supply_electricity());
        System.out.println();

// Задание №3   Стратегия
// Реализуйте паттерн Стратегия для сортировки списка чисел. Создайте класс SortStrategy,
// имеющий метод sort(numbers), и несколько конкретных стратегий для различных методов
// сортировки (например, пузырьковая сортировка, сортировка выбором).

        System.out.println("__________  Задание №3  ___________________________________");
        int[] array = new int[]{3, 1, 8, 6, 5, 0, 9, 2, 4, 7};
        SortStrategy strategy_0 = new SortStrategy(new BubleSort());
        SortStrategy strategy_1 = new SortStrategy(new SelectionSort());
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(strategy_0.sort(array)));
        System.out.println(Arrays.toString(strategy_1.sort(array)));
        System.out.println();

// Задание №4   Декоратор:
// Создайте класс Coffee с методом cost(), возвращающим стоимость кофе. Реализуйте декораторы Sugar и Milk, которые
// добавляют сахар и молоко к кофе, соответственно. Создайте объект кофе и последовательно примените к нему декораторы,
// затем выведите общую стоимость.

        System.out.println("__________  Задание №4  ___________________________________");
        iCost coffee = new Coffee(3.15);
        System.out.println("Черный кофе:" + coffee.cost());
        coffee = new Milk(0.93, new Coffee(3.15));
        System.out.println("Кофе с молоком:" + coffee.cost());
        coffee = new Sugar(1.11, new Coffee(3.15));
        System.out.println("Кофе с сахаром:" + coffee.cost());
        coffee = new Sugar(1.11, new Milk(0.93, new Coffee(3.15)));
        System.out.println("Кофе с сахаром и молоком:" + coffee.cost());
    }
}