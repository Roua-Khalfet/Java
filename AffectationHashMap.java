import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> map = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d); // Remplace l'ancien département s’il y en a un
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : new HashSet<>(map.values())) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(map);
    }
}
