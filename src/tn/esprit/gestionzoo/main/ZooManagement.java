package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Zoo myZootwo = new Zoo("Belvederetwo", "Tunis"); // Vérifier si ce zoo est bien utilisé

        // Âge négatif
        Animal lion1 = new Animal("cat", "katous", -3, true);
        if (lion1.getAge() < 0) {
            System.out.println("Erreur : l'âge de l'animal ne peut pas être négatif.");
        } else {
            myZoo.addAnimal(lion1);
        }

        // Ajout et recherche d'un animal valide
        Animal lion2 = new Animal("cat", "katous", 4, true);
        myZoo.addAnimal(lion2);
        System.out.println("Recherche de Lion: " + myZoo.searchAnimal(lion2));

        // Test de duplication
        Animal lion3 = new Animal("cat", "katous", 4, true);
        if (!myZoo.addAnimal(lion3)) {  // Supposons que `addAnimal` retourne `false` en cas d'échec
            System.out.println("Erreur : Cet animal existe déjà dans le zoo.");
        }

        // Vérification si le zoo est plein
        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein");
        } else {
            System.out.println("Le zoo n'est pas plein");
        }

        // Comparaison des zoos
        Zoo zooPlusGrand = myZoo.comparerZoo(myZoo, myZootwo);
        if (zooPlusGrand != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusGrand.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

        System.out.println("----------------------");

        Aquatic genericAquatic = new Aquatic("Fish", "Nemo", 2, false, "Ocean");
        Dolphin flipper = new Dolphin("Flipper", 5, true, "Ocean", 10.5f);
        Penguin pingu = new Penguin("Pingu", 3, false, "Arctic", 20.0f);
        Terrestrial simba = new Terrestrial("Feline", "Simba", 4, true, 4);

        System.out.println(flipper);
        System.out.println(pingu);
        System.out.println(simba);

        genericAquatic.swim();
        flipper.swim();

    }
}
