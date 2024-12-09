package animals;

import food.Meat;
import origins.Animal;
import origins.*;

public class Dolphin extends Animal implements Aquatic, Carnivore {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает");
    }

    @Override
    public void eat(Meat food) {
        if (!"Рыба".equals(food.getType())) {
            throw new IllegalArgumentException(getName() + " ест только \"Рыба\"");
        }
        System.out.println(getName() + " ест рыбу");
    }
}
