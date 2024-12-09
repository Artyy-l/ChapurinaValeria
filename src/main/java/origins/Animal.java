package origins;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName == null || newName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        // меняем цвет текста по приколу (но оно так не очень читаемым становится, поэтому только тут использую)
        System.out.println("Имя экземпляра \u001B[34m" + this.getClass() + "\u001B[0m с именем \u001B[34m" + name +
                "\u001B[0m изменено на \u001B[32m" + newName + "\u001B[0m");
        this.name = newName;

    }

    public Animal(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        System.out.println("Создан экземпляр<" + this.getClass() + "> с именем: " + name);
    }
}
