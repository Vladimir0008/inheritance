package lesson3.homework.task5;

public class Main {
    public static void main(String[] args) {
        Animal dog  = new Dog();
        Animal cat  = new Cat();
        dog.run(500);
        dog.run(-1000);
        dog.run(1000);
        dog.swim(10);
        dog.swim(100);
        dog.swim(-10);

        cat.run(1000);
        cat.run(100);
        cat.run(-100);

        cat.swim(100);

        Cat cat2 = new Cat();
        Animal cat3 = new Cat();
        Cat cat4 = new Cat();

        Animal dog2 = new Dog();
        Dog dog3 = new Dog();
        System.out.println("We created " + Cat.getCatCount() + " cats.");
        System.out.println("We created " + Dog.getDogCount() + " dogs");
    }
}
