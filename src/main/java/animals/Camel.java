package animals;

import food.Grass;
import origins.Animal;
import origins.Herbivore;
import origins.Terrestrial;

public class Camel extends Animal implements Terrestrial, Herbivore {
    public Camel(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(getName() + " ходит");
    }

    @Override
    public void eat(Grass food) {
        System.out.println(getName() + " ест траву");
    }
}
