import java.util.ArrayList;
import java.util.List;

public class Clasa {

    private int capacitate;
    private NumarClasa numar;
    private char litera;
    private List<Elev> elevi;

    public void adaugaElev(Elev elev) {
        this.elevi.add(elev);
    }

    public void eliminaElev(Elev elev){
        this.elevi.remove(elev);
    }

    public  int getTotalElevi(){ return elevi.size();
    }

    public Clasa (int capacitate,NumarClasa numar,char litera){
        this.capacitate=capacitate;
        this.numar=numar;
        this.litera=litera;
        this.elevi=new ArrayList<>();

    }
    public int getCapacitate() {
        return capacitate;
    }

    public NumarClasa getNumar() {
        return numar;
    }

    public char getLitera() {
        return litera;
    }

    public List<Elev> getElevi() {
        return elevi;
    }

}
