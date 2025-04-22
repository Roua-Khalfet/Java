public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 30);
        Departement d2 = new Departement(2, "Finance", 20);
        Departement d3 = new Departement(3, "RH", 15);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        System.out.println("\nAffichage des départements :");
        gestion.displayDepartement();

        System.out.println("\nRecherche 'Finance' : " + gestion.rechercherDepartement("Finance"));

        System.out.println("\nTri par ID :");
        for (Departement d : gestion.trierDepartementById()) {
            System.out.println(d);
        }
    }
}
