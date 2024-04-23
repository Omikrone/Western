package western2;

import western1.Boisson;
import western1.Personnage;

public class Dame extends Personnage{
    private boolean m_libre;
    private String m_loic; // c'est le méchant de l'histoire
    private String m_sauveur;

    public Dame (String surnom) {
        super(surnom);
        m_libre = true;
        loic = null;
        sauveur = null;
    }

    @Override
    public String sePresenter(){
        if(!m_libre){
            return super.sePresenter()+" Je suis captive de cet escroc de "+loic.getNom()+".";
        }
        else if(sauveur!=null){
            return super.sePresenter()+" Je suis libre grace à "+sauveur.getNom()+".";
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
}

   