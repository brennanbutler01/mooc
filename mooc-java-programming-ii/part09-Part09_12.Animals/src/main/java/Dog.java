public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public Dog() {
        super("Dog");
        this.name = "Dog";
    }

    public void bark () {
        System.out.println(this.name + " barks");
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }
}
