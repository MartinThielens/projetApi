package Classes;

import java.util.Objects;

public class SessionCours {
    private int id, nbrInscrit;
    private String DateDebut, DateFin;

    public SessionCours(int id, int nbrInscrit, String dateDebut, String dateFin) {
        this.id = id;
        this.nbrInscrit = nbrInscrit;
        DateDebut = dateDebut;
        DateFin = dateFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrInscrit() {
        return nbrInscrit;
    }

    public void setNbrInscrit(int nbrInscrit) {
        this.nbrInscrit = nbrInscrit;
    }

    public String getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(String dateDebut) {
        DateDebut = dateDebut;
    }

    public String getDateFin() {
        return DateFin;
    }

    public void setDateFin(String dateFin) {
        DateFin = dateFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SessionCours that = (SessionCours) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
