import java.util.HashSet;
import java.util.Set;

public class Elev {

    private String nume;
    private Gen gen;
    private Set<String> activitati;


   public Elev (String nume,Gen gen){
        this.nume=nume;
        this.gen=gen;
        this.activitati=new HashSet<>();
    }

    public String getNume(){

       return this.nume;
    }

    public Gen getGen()
    {
       return this.gen;
    }

   public void adaugaActivitate (String numeActivitate){

       this.activitati.add(numeActivitate);

   }

    public void eliminaActivitate (String numeActivitate){

        this.activitati.remove(numeActivitate);

    }


    public Set<String> getActivitati(){

       return activitati;
    }
}
