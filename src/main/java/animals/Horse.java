package animals;

import food.Grass;
import origins.Animal;
import origins.Herbivore;
import origins.Terrestrial;

public class Horse extends Animal implements Herbivore, Terrestrial {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " ходит");
    }

    @Override
    public void eat(Grass food) {
        System.out.println(this.getName() + " ест траву");
    }
}
