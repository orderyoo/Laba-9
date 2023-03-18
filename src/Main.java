public class Main {
    public static void main(String[] args) {
    Cat musa = new Cat("fish", "home", "meow");
    musa.makeNoise();
    musa.eat();
    Veterinarian.treatAnimal(musa);

    Dog scharik = new Dog("meat", "yard", "gav");
    scharik.makeNoise();
    scharik.eat();
    Veterinarian.treatAnimal(scharik);

    Horse mustang = new Horse("hay", "farm", "igogo");
    mustang.makeNoise();
    mustang.eat();
    Veterinarian.treatAnimal(mustang);
    }
}
class Animal{
    private static String food, location;
    Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public static String getFood() {
        return food;
    }
    public static String getLocation(){
        return location;
    }
    public void makeNoise() {
        System.out.println("Animal makes a sound");
    }
    public void eat() {
        System.out.println("Animal is eating now");
    }
    public void sleep() {
        System.out.println("Animal is sleeping now");
    }
}
class Cat extends Animal {
    private String noise;
    Cat(String food, String location, String noise){
        super(food, location);
        this.noise = noise;
    }
    @Override
    public void makeNoise() {
        System.out.println("Cat " + this.noise);
    }
    @Override
    public void eat() {
        System.out.println("Cat eats " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping now");
    }
}
class Dog extends Animal {
    private String noise;
    Dog(String food, String location, String noise){
        super(food, location);
        this.noise = noise;
    }
    @Override
    public void makeNoise() {
        System.out.println("Dog " + this.noise);
    }
    @Override
    public void eat() {
        System.out.println("Dog eats " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping now");
    }
}
class Horse extends Animal {
    private String noise;
    Horse(String food, String location, String noise){
        super(food, location);
        this.noise = noise;
    }
    @Override
    public void makeNoise() {
        System.out.println("Horse " + this.noise);
    }
    @Override
    public void eat() {
        System.out.println("Horse eats " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping now");
    }
}
class Veterinarian {
    public static void treatAnimal(Animal animal) {
        System.out.println("Animal is eating " + animal.getFood() + " and is located in " + animal.getLocation());
    }
}