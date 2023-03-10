package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Local {
    private int id;
    private String sigle;
    private int places;

    private List<SessionCours> session = new ArrayList<>();

    public Local(int id, String sigle, int places) {
        this.id = id;
        this.sigle = sigle;
        this.places = places;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public List<SessionCours> getSession() {
        return session;
    }

    public void setSession(List<SessionCours> session) {
        this.session = session;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return id == local.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
