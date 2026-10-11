import java.util.HashMap;
import java.util.Map;

public class Scoala {

    private Map<String, Clasa> clase;
    private Map<String,Activitate> activitati;

    public void adaugaClasa(String numeClasa, Clasa clasa) {

        this.clase.put(numeClasa,clasa);
    }

    public void adaugaActivitate(Activitate activitate){

        this.activitati.put(activitate.getNume(),activitate);
    }

    public void eliminaActivitate(String numeActivitate){

      this.activitati.remove(numeActivitate);

    }


    public void eliminaClasa(String numeClasa) {

        this.clase.remove(numeClasa);
    }



    public void adaugaElevInClasa(String numeClasa, Elev elev) {

        this.clase.get(numeClasa).adaugaElev(elev);
    }



    public void eliminaElevDupaNume(String numeElev) {

        for(Clasa clasa: this.clase.values())
        {
            clasa.getElevi().removeIf(elev -> elev.getNume().equalsIgnoreCase(numeElev));

        }

    }



    public int getNumarClase() {
        return this.clase.size();
    }



    public int getTotalElevi() {
        int total=0;

        for(Clasa c : this.clase.values()){
            total+=c.getTotalElevi();
        }

        return total;
    }

   public Scoala (){

        this.clase=new HashMap<>();
        this.activitati=new HashMap<>();
    }



}
