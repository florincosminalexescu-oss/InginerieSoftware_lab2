import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


    public void inscrieElevLaActivitate(Elev elev,String numeActivitate){

        Activitate activitate=this.activitati.get(numeActivitate);

        if(activitate!=null && elev!=null){

            activitate.inscrieElev(elev);
            elev.adaugaActivitate(numeActivitate);

        }


    }


    public void retrageElevDinActivitate(Elev elev, String numeActivitate) {
        Activitate activitate = this.activitati.get(numeActivitate);

        if (activitate != null && elev != null) {
            activitate.stergeElev(elev);

            elev.eliminaActivitate(numeActivitate);
        }
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


    public void afiseazaTopActivitati(){

        List<Activitate> listaActivitati = new ArrayList<>(this.activitati.values());
        listaActivitati.sort((a1,a2)->Integer.compare(a2.getElevi().size(),a2.getElevi().size()));


        System.out.println("--- TOP ---");
        for (Activitate activitate : listaActivitati) {
            System.out.println(activitate.getNume() + " - " + activitate.getElevi().size() + " elevi");
        }
    }


    public int getNumarEleviCuActivitati() {
        int numarElevi = 0;

        for (Clasa clasa : this.clase.values()) {
            for (Elev elev : clasa.getElevi()) {
                if (!elev.getActivitati().isEmpty()) {
                    numarElevi++;
                }
            }
        }

        return numarElevi;
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
