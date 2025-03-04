package tn.esprit.gestionzoo.entities;


public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 3;
    private Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals = 0;
    private int nbrAnimals = 0;

    public Zoo(String name, String city) {
        setName(name);
        setCity(city);
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    // Setters avec valeurs par défaut en cas d'entrée invalide
    public void setName(String name) {
        if (name == null) {
            this.name = "tn.esprit.gestionzoo.entities.Zoo Inconnu";
        } else {
            this.name = name;
        }
    }

    public void setCity(String city) {
        this.city = city;

    }

//    public boolean addAnimal(Animal animal) {
//        if (animal == null || isZooFull() || searchAnimal(animal) != -1) {
//            return false;
//        }
//        animals[nbrAnimals++] = animal;
//        return true;
//    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (animal == null) {
            throw new IllegalArgumentException("L'animal ne peut pas être null !");
        }
        if (searchAnimal(animal) != -1) {
            throw new IllegalStateException("L'animal existe déjà dans le zoo !");
        }
        if (nbrAnimals >= nbrCages) { // Vérification du nombre de cages (zoo plein)
            throw new ZooFullException("Impossible d'ajouter l'animal : le zoo est plein !");
        }

        animals[nbrAnimals++] = animal; // Ajout de l'animal
        System.out.println("Animal ajouté avec succès. Nombre d'animaux : " + nbrAnimals);
    }



    public void displayAnimals() {
        System.out.println("Les animaux du zoo " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        if (animal == null) return -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--nbrAnimals] = null;
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1 == null) return z2;
        if (z2 == null) return z1;
        return z1.nbrAnimals > z2.nbrAnimals ? z1 : z2;
    }

    public void displayZoo() {
        System.out.println(" Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Number of Animals: " + nbrAnimals);
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic != null && nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals++] = aquatic;
        }
    }
    public void displayAquaticAnimalsSwimming() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.swimmingDepth > maxDepth) {
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0;
        int penguins = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguins++;
            }
        }
        System.out.println("Nombre de dauphins: " + dolphins);
        System.out.println("Nombre de pingouins: " + penguins);
    }


    @Override
    public String toString() {
        return "name='" + name + "', city='" + city + "', nombre d'animaux=" + nbrAnimals ;
    }
}
