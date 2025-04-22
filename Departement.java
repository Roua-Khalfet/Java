import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nbEmployes;

    // Constructeur par défaut
    public Departement() {}

    // Constructeur avec paramètres
    public Departement(int id, String nom, int nbEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbEmployes = nbEmployes;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    // equals : id et nom
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && nom.equals(that.nom);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    // toString
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }
}
