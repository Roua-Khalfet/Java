package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super("Penguin", name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Swimming Depth: " + swimmingDepth + " m");
    }
    @Override
    public String toString() {
        return super.toString() + " Swimming Depth: " + swimmingDepth + " meters";
    }

}

