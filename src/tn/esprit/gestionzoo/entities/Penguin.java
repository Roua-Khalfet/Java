package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    float swimmingDepth;

    public Penguin(String name, int age, float swimmingDepth) {
        super(name, "Penguin", age, false, "Cold Waters");
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");

    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
