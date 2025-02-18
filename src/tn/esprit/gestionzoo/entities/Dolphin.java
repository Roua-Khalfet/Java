package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super("Dolphin", name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Swimming Speed: " + swimmingSpeed + " m/s");
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed + " km/h";
    }

}

