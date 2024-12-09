package animals;

import food.Meat;
import origins.*;

public class Tiger extends Animal implements Carnivore, Terrestrial {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat(Meat food) {
        if (!"Говядина".equals(food.getType())) {
            throw new IllegalArgumentException("Тигры едят только \"Говядина\"");
        }
        System.out.println(getName() + " ест говядину");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " ходит");
    }
}
