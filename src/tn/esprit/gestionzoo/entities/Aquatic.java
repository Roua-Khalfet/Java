package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String name, String family, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(name, family, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();
    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    // Dans votre classe Aquatic
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic aquatic = (Aquatic) obj;
        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge() &&
                this.habitat.equals(aquatic.habitat);
    }
}