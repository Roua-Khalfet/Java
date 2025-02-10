package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int cpt = 0;

    public Zoo(String name, String city) {
        setName(name); // Validation du nom via setter
        this.city = city;
        animals = new Animal[this.nbrCages];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide. Valeur inchangée.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est déjà plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                cpt++;
                System.out.println(animal.getName() + " a été ajouté au zoo.");
                return true;
            }
        }
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                cpt--;
                System.out.println(animal.getName() + " a été supprimé du zoo.");
                return true;
            }
        }
        System.out.println("L'animal " + animal.getName() + " n'a pas été trouvé dans le zoo.");
        return false;
    }

    public boolean isZooFull() {
        return cpt == nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.cpt > z2.cpt) {
            return z1;
        } else if (z1.cpt < z2.cpt) {
            return z2;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
