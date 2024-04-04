package western1;

import western1.grammaire.Genre;

/**
 * class en charge de la gestion d'un personnage
 * @members m_nom : le nom du personnage
 * @members m_boissons : le nom de sa boisson pref
 */
public class Personnage{
    private String m_nom;
    private Boisson m_boisson;

    public Personnage(String nom){
        m_nom = nom;
    }

    public Personnage(String nom, Boisson boisson){
        m_nom = nom;
        m_boisson = boisson;
    }

}
