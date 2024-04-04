package western1;
import western1.grammaire.*;

/**
 * classe en charge de la gestion d'une boisson
 */
public class Boisson {
    private String m_nom;
    private Genre m_genre;

    public Boisson(String nom, Genre genre){
        m_nom = nom;
        m_genre = genre;
    }

    public String getArticleDefEtNom(){
        if(estVoyelle(m_nom.charAt(0)))
            return "l'"+m_nom;
        else
            return m_genre.getArticleDef()+" "+m_nom;
    }

    public String getArticleIndefEtNom(){
        return m_genre.getArticleIndef()+" "+m_nom;
    }

    public String getArticlePartiEtNom(){
        if(estVoyelle(m_nom.charAt(0)))
            return "de l'"+m_nom;
        else
            return m_genre.getArticleParti()+" "+m_nom;
    }

    private boolean estVoyelle(char lettre){
        switch (lettre) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            case 'y':
                return true;
            default:
                return false;
        }
    }
}
