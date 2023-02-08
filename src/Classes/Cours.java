package Classes;

import java.util.Objects;

public class Cours {
    private int id;
    private String matiere, description;

    public Cours(int id, String matiere, String description) {
        this.id = id;
        this.matiere = matiere;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cours cours = (Cours) o;
        return id == cours.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
