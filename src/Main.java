import java.util.*;

//1
class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Пол: " + gender);
    }

    public void increaseAge() {
        this.age++;
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}

// 2
class Worker extends Person {
    double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }
}

class Manager extends Worker {
    List<Worker> subordinates;

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Worker worker) {
        subordinates.add(worker);
    }
}

// 3
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Гав гав!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Просто мяу!");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Муу!");
    }
}

// 4
abstract class Transport {
    abstract void move();
}

class Car extends Transport {
    @Override
    void move() {
        System.out.println("Машина едет.");
    }
}

class Bike extends Transport {
    @Override
    void move() {
        System.out.println("Велосипед едет.");
    }
}

// 5
class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

class Library {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.author.equals(author)) {
                System.out.println("Найдено: " + book.title);
            }
        }
    }

    public void findBooksByYear(int year) {
        for (Book book : books) {
            if (book.year == year) {
                System.out.println("Найдено: " + book.title);
            }
        }
    }
}

// 6
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно денег.");
        }
    }

    public void printBalance() {
        System.out.println("Баланс: " + balance);
    }
}

// 7
class Counter {
    static int objectCount = 0;

    public Counter() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

// 8
abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

// 9
class AnimalMove {
    public void move() {
        System.out.println("Животное идет.");
    }
}

class Fish extends AnimalMove {
    @Override
    public void move() {
        System.out.println("Рыба плавает.");
    }
}

class Bird extends AnimalMove {
    @Override
    public void move() {
        System.out.println("Птица летает.");
    }
}

class DogMove extends AnimalMove {
    @Override
    public void move() {
        System.out.println("Собака бежит.");
    }
}

// 10
class Student {
    String name;
    String group;
    double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }
}

class University {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortByName() {
        students.sort(Comparator.comparing(s -> s.name));
    }

    public void filterByGrade(double threshold) {
        for (Student student : students) {
            if (student.grade >= threshold) {
                System.out.println("Студент: " + student.name + ", Оценка: " + student.grade);
            }
        }
    }
}

// 11
class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Store {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(p -> p.name.equals(name));
    }

    public Product findProduct(String name) {
        for (Product product : products) {
            if (product.name.equals(name)) {
                return product;
            }
        }
        return null;
    }
}

// 12
interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено банковской картой: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возвращено банковской картой: " + amount);
    }
}

class PayPal implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено пейпалом: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возвращено пейпалом: " + amount);
    }
}

// 13
class UniqueID {
    private static int idCounter = 0;
    private int id;

    public UniqueID() {
        this.id = ++idCounter;
    }

    public int getID() {
        return id;
    }
}

// 14
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle2 {
    Point topLeft, bottomRight;

    public Rectangle2(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        return Math.abs((bottomRight.x - topLeft.x) * (bottomRight.y - topLeft.y));
    }
}

// 15
class ComplexNumber {
    double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}

// 16
class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Нельзя поделить на нуль.");
            return 0;
        }
        return a / b;
    }
}

// 17
class MyQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        return queue.pollFirst();
    }

    public T peek() {
        return queue.peekFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

// 18
class MyStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    public void push(T item) {
        stack.addFirst(item);
    }

    public T pop() {
        return stack.pollFirst();
    }

    public T peek() {
        return stack.peekFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

// 19
class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void addSeconds(int sec) {
        this.seconds += sec;
        this.minutes += this.seconds / 60;
        this.seconds %= 60;
        this.hours += this.minutes / 60;
        this.minutes %= 60;
        this.hours %= 24;
    }

    public void printTime() {
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}

// 20
class NumberSorter {
    public void sort(int[] numbers) {
        Arrays.sort(numbers);
    }

    public void printNumbers(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер задачи (1-20):");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                Person person = new Person("джо", 25, "мэн");
                person.printInfo();
                person.increaseAge();
                person.printInfo();
                person.changeName("майк");
                person.printInfo();
                break;
            case 2:
                Worker worker = new Worker("алиса", 30, "вумэн", 50000);
                worker.printInfo();
                Manager manager = new Manager("боб", 40, "мэн", 80000);
                manager.addSubordinate(worker);
                break;
            case 3:
                Animal[] animals = {new Dog(), new Cat(), new Cow()};
                for (Animal animal : animals) {
                    animal.makeSound();
                }
                break;
            case 4:
                Transport car = new Car();
                Transport bike = new Bike();
                car.move();
                bike.move();
                break;
            case 5:
                Library library = new Library();
                library.addBook(new Book("2011", "григорий", 1949));
                library.addBook(new Book("ферма ", "григорий", 1945));
                library.findBooksByAuthor("григорий");
                library.findBooksByYear(2011);
                break;
            case 6:
                BankAccount account = new BankAccount("123", 1000);
                account.deposit(500);
                account.printBalance();
                account.withdraw(300);
                account.printBalance();
                break;
            case 7:
                Counter c1 = new Counter();
                Counter c2 = new Counter();
                System.out.println("Созданные объекты: " + Counter.getObjectCount());
                break;
            case 8:
                Shape circle = new Circle(5);
                Shape rectangle = new Rectangle(4, 6);
                System.out.println("Круг: " + circle.getArea());
                System.out.println("Прямоугольник: " + rectangle.getArea());
                break;
            case 9:
                AnimalMove fish = new Fish();
                AnimalMove bird = new Bird();
                AnimalMove dog = new DogMove();
                fish.move();
                bird.move();
                dog.move();
                break;
            case 10:
                University university = new University();
                university.addStudent(new Student("алиса", "информатика", 4.5));
                university.addStudent(new Student("бо", "математика", 3.8));
                university.sortByName();
                university.filterByGrade(4.0);
                break;
            case 11:
                Store store = new Store();
                store.addProduct(new Product("Яблоко", 1.2, 10));
                store.addProduct(new Product("Банан", 0.8, 20));
                Product product = store.findProduct("Яблоко");
                if (product != null) {
                    System.out.println("Продуктов набрано: " + product.name + ", Цена: " + product.price);
                }
                store.removeProduct("Банан");
                break;
            case 12:
                PaymentSystem card = new CreditCard();
                PaymentSystem paypal = new PayPal();
                card.pay(100);
                paypal.pay(200);
                card.refund(50);
                break;
            case 13:
                UniqueID id1 = new UniqueID();
                UniqueID id2 = new UniqueID();
                System.out.println("айди 1: " + id1.getID());
                System.out.println("айди 2: " + id2.getID());
                break;
            case 14:
                Point p1 = new Point(0, 0);
                Point p2 = new Point(5, 5);
                Rectangle2 rect = new Rectangle2(p1, p2);
                System.out.println("Прямоугольник: " + rect.getArea());
                break;
            case 15:
                ComplexNumber num1 = new ComplexNumber(3, 2);
                ComplexNumber num2 = new ComplexNumber(1, 7);
                ComplexNumber sum = num1.add(num2);
                System.out.println("Сумма: " + sum.real + " + " + sum.imaginary + "i");
                break;
            case 16:
                Calculator calc = new Calculator();
                System.out.println("Сумма: " + calc.add(5, 3));
                System.out.println("Разделение: " + calc.divide(10, 2));
                break;
            case 17:
                MyQueue<Integer> queue = new MyQueue<>();
                queue.enqueue(1);
                queue.enqueue(2);
                System.out.println("Первый элемент: " + queue.dequeue());
                break;
            case 18:
                MyStack<String> stack = new MyStack<>();
                stack.push("привет");
                stack.push("пока");
                System.out.println("Топ стека: " + stack.pop());
                break;
            case 19:
                Time time = new Time(10, 45, 30);
                time.addSeconds(5000);
                time.printTime();
                break;
            case 20:
                NumberSorter sorter = new NumberSorter();
                int[] numbers = {5, 3, 8, 1, 2};
                sorter.sort(numbers);
                sorter.printNumbers(numbers);
                break;
            default:
                System.out.println("Неправильный выбор задачи.");
                break;
        }
    }
}
