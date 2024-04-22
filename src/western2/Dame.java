package western2;

import western1.Personnage;

public class Dame extends Personnage{
    private boolean m_libre;
    private Brigand loic; // c'est le méchant de l'histoire
    private Cowboy sauveur;

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

    String crier(Brigand brigand){
        m_libre = false;
        loic = brigand;
        return m_nom+" - Hiiii ! Au secours ! "+brigand.getNom()+" m'enlève !";
    }

    String remercier(Cowboy cowboy){
        m_libre = true;
        sauveur = cowboy;
        return m_nom+" - Merci "+cowboy.getNom()+" de m'avoir libérée.";
    }


}

   