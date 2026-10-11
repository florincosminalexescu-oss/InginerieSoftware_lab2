import java.util.HashSet;
import java.util.Set;

public class Activitate {

    private String nume;
    private String profesorCoordonator;
    private Set<Elev> elevi;


    public Activitate(String nume, String profesorCoordonator) {

        this.nume = nume;
        this.profesorCoordonator = profesorCoordonator;
        this.elevi = new HashSet<>();

    }



    public void inscrieElev(Elev elev){

        this.elevi.add(elev);

    }

    public void stergeElev(Elev elev){

        this.elevi.remove(elev);


    }


    public String getNume() {
        return nume;
    }

    public String getNumeCoordonator() {
        return profesorCoordonator;
    }

    public Set<Elev> getElevi(){

        return elevi;

    }


}
