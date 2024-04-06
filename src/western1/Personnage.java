package western1;
import western1.grammaire.*;

public class Personnage {
    protected String m_nom;
    private Boisson m_boissonFav = new Boisson("eau", new Feminin());
    
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
        String def = m_boissonFav.getNomAvecArticleDefini();
        return  m_nom + " - Bonjour, je suis " + this.getNom() + " et j'aime " + def + '.';
    }

    public String boire() {
        //String part_b  = m_boissonFav.getNomAvecArticlePartitif();
        String part_fav = m_boissonFav.getNomAvecArticlePartitif();

        return  m_nom + " - Ah ! boire " + part_fav + " ! GLOUPS !";
    }

    public String boire(Boisson boisson) {
        String part_fav = m_boissonFav.getNomAvecArticlePartitif();
        String part_b = boisson.getNomAvecArticlePartitif();
        if (boisson.equals(m_boissonFav)) {
            return m_nom + " - " + "Ah ! boire " + part_fav + " ! GLOUPS !";
        }
        else return m_nom + " - " + "GLOUPS ! Faut vraiment avoir soif pour boire " + part_b + " ! j'aurais préféré boire "+ part_fav +  ".";
    }

    public String getNom(){
        return m_nom;
    }
}
