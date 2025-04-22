import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println("Departement ajouté !");
        } else {
            System.out.println("Departement déjà existant !");
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Departement supprimé !");
        } else {
            System.out.println("Departement introuvable !");
        }
    }

    @Override
    public void displayDepartement() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted = new TreeSet<>(Comparator.comparingInt(Departement::getId));
        sorted.addAll(departements);
        return sorted;
    }
}
