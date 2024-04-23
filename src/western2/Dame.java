package western2;

import western1.Boisson;
import western1.Personnage;
import western1.grammaire.Feminin;
import western1.grammaire.Masculin;

public class Dame extends Personnage{
    private boolean m_libre;
    private String m_loic; // c'est le méchant de l'histoire
    private String m_sauveur;
    private static Boisson m_boissonDef = new Boisson("eau", new Feminin());

    public Dame (String nom) {
        super(nom, m_boissonDef);
        m_libre = true;
        m_loic = null;
        m_sauveur = null;
    }

    public Dame (String nom, Boisson boissonFav){
        super(nom, boissonFav);
        m_libre = true;
        m_loic = "";
        m_sauveur = "";
    }

    @Override
    public String sePresenter(){
        if(!m_libre){
            return super.sePresenter()+" Je suis captive de cet escroc de "+m_loic+".";
        }
        else if(m_sauveur!=null){
            return super.sePresenter()+" Je suis libre grace à "+m_sauveur+".";
        }
        else{
            return super.sePresenter()+" Je suis libre.";
        }
    }
    @Override
    public String getNom(){
        return "Miss "+m_nom;
    }

    String crier(String brigand){
        m_libre = false;
        m_loic = brigand;
        return m_nom+" - Hiiii ! Au secours ! "+brigand+" m'enlève !";
    }

    String remercier(String cowboy){
        m_libre = true;
        m_sauveur = cowboy;
        return m_nom+" - Merci "+cowboy+" de m'avoir libérée.";
    }

    public static void setBoissonDef(Boisson boisson){
        m_boissonDef = boisson;
    }
}

   