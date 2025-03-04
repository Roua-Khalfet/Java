package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Création d'un zoo
        Zoo myZoo = new Zoo("Tunis tn.esprit.gestionzoo.entities.Zoo", "Tunis");
/*
        // Création de quelques animaux
        Dolphin dolphin = new Dolphin("aaa", 5, 20);
        Penguin penguin = new Penguin("bbbb", 3, 10);



        Animal lion = new Animal("Simba", "Lion", 5, true);
        Animal tiger = new Animal("Raja", "Tiger", 3, true);
        Animal elephant = new Animal("Dumbo", "Elephant", 10, true);
        Animal lionCopy = new Animal("Simba", "Lion", 5, true);

        // Test d'ajout d'animaux
        System.out.println("Ajout du dauphin: " + myZoo.addAnimal(dolphin));
        System.out.println("Ajout du penguin: " + myZoo.addAnimal(penguin));

        System.out.println("Ajout du lion: " + myZoo.addAnimal(lion));
        System.out.println("Ajout du tigre: " + myZoo.addAnimal(tiger));
        System.out.println("Ajout de l'éléphant: " + myZoo.addAnimal(elephant));

        // Test d'ajout d'un animal avec le même nom
        System.out.println("Tentative d'ajout d'un lion avec le même nom: " + myZoo.addAnimal(lionCopy));

        // Affichage des animaux
        myZoo.displayAnimals();*/
/*
        // Test de recherche
        System.out.println("Recherche de Simba: " + myZoo.searchAnimal(lion));
        System.out.println("Recherche de Raja: " + myZoo.searchAnimal(tiger));

        // Test de suppression
        System.out.println("Suppression de Simba: " + myZoo.removeAnimal(lion));

        // Affichage après suppression
        myZoo.displayAnimals();

        // Test de comparaison de zoos
        Zoo secondZoo = new Zoo("Safari", "Ariana");
        secondZoo.addAnimal(elephant);
        Zoo plusGrandZoo = Zoo.comparerZoo(myZoo, secondZoo);
        System.out.println("Le plus grand zoo est: " + plusGrandZoo);
*/
//        Dolphin dolphin1 = new Dolphin("aaa", 5, 20);
//        Dolphin dolphin2 = new Dolphin("bbb", 7, 25);
//        Penguin penguin1 = new Penguin("ccc", 3, 10);
//        Penguin penguin2 = new Penguin("ddd", 2, 15);
//
//        myZoo.addAquaticAnimal(dolphin1);
//        myZoo.addAquaticAnimal(dolphin2);
//        myZoo.addAquaticAnimal(penguin1);
//        myZoo.addAquaticAnimal(penguin2);


//        myZoo.addAnimal(dolphin1);
//        myZoo.addAnimal(dolphin2);
//        myZoo.addAnimal(penguin1);
//        myZoo.addAnimal(penguin2);

//        myZoo.displayAnimals();
//
//
//        System.out.println("\nAnimaux aquatiques en train de nager:");
//        myZoo.displayAquaticAnimalsSwimming();
//
//        System.out.println("\nProfondeur maximale des pinguins: " + myZoo.maxPenguinSwimmingDepth() + " mètres");
//
//        System.out.println("\nNombre d'animaux aquatiques par type:");
//        myZoo.displayNumberOfAquaticsByType();
//
//        // Test de la méthode equals (Instruction 31)
//        Dolphin dolphin3 = new Dolphin("Flipper", 5, 22);
//        dolphin3.setHabitat(dolphin1.getHabitat());
//        System.out.println("\nTest equals:");
//        System.out.println("dolphin1 equals dolphin3: " + dolphin1.equals(dolphin3));

//exceptions

                Zoo zoo = new Zoo("Zoo de Tunis", "Tunis");

                try {
                    Animal lion = new Animal("Simba", "Lion", 5, true);
                    Animal tiger = new Animal("Raja", "Tiger", -3, true);
                    Animal elephant = new Animal("Dumbo", "Elephant", 10, true);
                    Animal giraffe = new Animal("Giraffidae", "Gigi", 5, true); // Fixed variable name

                    try {
                        zoo.addAnimal(lion);
                        zoo.addAnimal(tiger);
                        zoo.addAnimal(elephant);
                        zoo.addAnimal(giraffe); // Should trigger ZooFullException if the zoo is full
                    } catch (ZooFullException e) {
                        System.out.println("Erreur : " + e.getMessage());
                    }

                    zoo.displayAnimals();
                } catch (InvalidAgeException e) {
                    System.out.println("Erreur : " + e.getMessage());
                }
            }
        }
