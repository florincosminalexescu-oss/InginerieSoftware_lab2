//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
   Elev elev1=new Elev("Cosmin",Gen.Masculin);
   Elev elev2=new Elev("Bogdan",Gen.Feminin);

   System.out.println(elev1.getNume()+" "+elev2.getGen());


   Clasa A1=new Clasa(2,NumarClasa.IV,'A');
   A1.adaugaElev(elev1);
   A1.adaugaElev(elev2);


   System.out.println(A1.getTotalElevi());

   System.out.println(A1.getLitera());

}
