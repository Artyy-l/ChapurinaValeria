package animals;

import food.Meat;
import origins.Animal;
import origins.Carnivore;
import origins.Flying;

public class Eagle extends Animal implements Flying, Carnivore {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " летает");
    }

    @Override
    public void eat(Meat food) {
        System.out.println(getName() + " ест " + food.getType());
    }
}
