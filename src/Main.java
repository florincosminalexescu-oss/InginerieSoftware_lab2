public class Main {
   public static void main(String[] args) {
      Scoala scoala = new Scoala();

      Profesor profPopescu = new Profesor("Popescu Ion");
      Profesor profIonescu = new Profesor("Ionescu Maria");
      Profesor profVasilescu = new Profesor("Vasilescu Dan");

      Activitate programare = new Activitate("Programare", profIonescu);
      Activitate fotbal = new Activitate("Fotbal", profPopescu);
      Activitate cor = new Activitate("Cor", profVasilescu);

      scoala.adaugaActivitate(programare);
      scoala.adaugaActivitate(fotbal);
      scoala.adaugaActivitate(cor);

      Clasa clasa1A = new Clasa(1, NumarClasa.I, 'A');
      Clasa clasa2B = new Clasa(2, NumarClasa.II, 'B');

      Elev cosmin = new Elev("Cosmin", Gen.Masculin);
      Elev maria = new Elev("Maria", Gen.Feminin);
      Elev andrei = new Elev("Andrei", Gen.Masculin);
      Elev elena = new Elev("Elena", Gen.Feminin);

      clasa1A.adaugaElev(cosmin);
      clasa1A.adaugaElev(maria);
      clasa2B.adaugaElev(andrei);
      clasa2B.adaugaElev(elena);

      scoala.adaugaClasa("I A", clasa1A);
      scoala.adaugaClasa("II B", clasa2B);

      scoala.inscrieElevLaActivitate(cosmin, "Programare");
      scoala.inscrieElevLaActivitate(maria, "Programare");
      scoala.inscrieElevLaActivitate(andrei, "Programare");

      scoala.inscrieElevLaActivitate(cosmin, "Fotbal");
      scoala.inscrieElevLaActivitate(andrei, "Fotbal");

      scoala.inscrieElevLaActivitate(maria, "Cor");

      System.out.println("=== TOP ACTIVITĂȚI ===");
      scoala.afiseazaTopActivitati();

      System.out.println("\n=== STATISTICI ELEVI ===");
      System.out.println("Elevi înscriși în cel puțin o activitate: "
              + scoala.getNumarEleviCuActivitati() + " (din 4 elevi în total)");

      System.out.println("\n=== RETRAGERE ELEV ===");
      System.out.println("Retragere Cosmin din Programare...");
      scoala.retrageElevDinActivitate(cosmin, "Programare");

      System.out.println("\n=== TOP ACTIVITĂȚI DUPĂ RETRAGERE ===");
      scoala.afiseazaTopActivitati();
   }
}