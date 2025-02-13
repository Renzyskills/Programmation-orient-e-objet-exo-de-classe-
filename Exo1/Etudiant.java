
public class Etudiant{
private String nom;
private String prenom;
private String classe;

public Etudiant (String pnom, String pprenom, String pclasse){
    this.nom=pnom;
     this.prenom=pprenom;
      this.classe=pclasse;
}
public String getNom(){
    return nom;

}
public String getPrenom(){
    return prenom;
}
public String getClasse(){
    return classe;
}
@Override
public String toString() {
    return "Etudiant{" +
            "nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", classe='" + classe + '\'' +
            '}';
}
}  
