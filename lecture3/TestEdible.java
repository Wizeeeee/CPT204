interface Edible {
    public abstract String howToEat(); /** Describe how to eat */
    }
    abstract class Animal { }
    class Chicken extends Animal implements Edible {
    public String howToEat() {
    return "Chicken: Fry it";
    }
    }
    class Tiger extends Animal {  
   }/** Does not extend Edible */
    abstract class Fruit implements Edible { }
    class Apple extends Fruit {
    public String howToEat() {
    return "Apple: Make apple cider";
    }
    }
    class Orange extends Fruit {
    public String howToEat() {
    return "Orange: Make orange juice";
    }
    }
    public class TestEdible {
    public static void main(String[] args) {
    Object[] objects = {new Tiger(), new Chicken(), new Apple()};
    for (int i = 0; i < objects.length; i++)
    if (objects[i] instanceof Edible)
    System.out.println(((Edible)objects[i]).howToEat());
    }
    }
   
