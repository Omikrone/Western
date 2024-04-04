package western1;
import western1.grammaire.*;

public class Personnage {
    protected String m_nom;
    Boisson m_boissonFav = new Boisson("eau", grammaire.Feminin);
    public Personnage(String nom, Boisson boissonFav) {
        m_nom = nom;
        m_boissonFav = boissonFav;
    }

    public Personnage(String nom) {
        m_nom = nom;
    }

    public String dire(String message) {
        return m_nom + " - " + message;
    }

    public String sePresenter() {
        String def = m_boissonFav.getArticleDefEtNom();
        return  m_nom + " - Bonjour, je suis " + m_nom + " et j'aime " + def;
    }

    public String boire(Boisson boisson) {
        String part_b  = boisson.getArticlePartiEtNom();
        String part_fav = m_boissonFav.getArticlePartiEtNom();

        return  " GLOUPS ! Faut vraiment avoir soif pour boire " + part_b + "! J’aurais préféré boire "+ part_fav +  "!";
    }

    public String boire() {
        String part_fav = m_boissonFav.getArticlePartiEtNom();
        return "Ah ! boire " + part_fav + " GLOUPS !";
    }
}
