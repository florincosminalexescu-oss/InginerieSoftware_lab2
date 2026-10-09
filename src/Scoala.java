import java.util.HashMap;
import java.util.Map;

public class Scoala {

    private Map<String,Clasa> clase=new HashMap<>();

   public void adaugaClasa(String numeCLasa,Clasa clasa){};
    public void eliminaClasa(String numeClasa) {};
    public void adaugaElevInClasa(String numeElev, Elev elev){};
    public void  eliminaElevDupaNume(String numeElev){};
    public int getNumarClase(){};
    public int getTotalElevi(){};
}
