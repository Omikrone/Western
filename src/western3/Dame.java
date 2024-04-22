package western2;

import western1.Personnage;

public class Dame extends Personnage{
    private boolean m_libre;

    public Dame (String surnom) {
        super(surnom);
        m_libre = false;
    }

    @Override
    public String getNom(){
        return "Miss "+m_nom;
    }

    String crier(Brigand brigand){
        m_libre = false;
        return m_nom+" - Hiiii ! Au secours ! "+brigand.getNom()+" m'enlève !";
    }

    String remercier(Cowboy cowboy){
        m_libre = true;
        return m_nom+" - Merci "+cowboy.getNom()+" de m'avoir libérée.";
    }


}

   