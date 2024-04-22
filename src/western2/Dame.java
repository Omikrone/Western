package western2;

import western1.Personnage;

public class Dame extends Personnage{
    private boolean m_libre;
    private String m_auteurLiberation;

    public Dame (String surnom) {
        super(surnom);
        m_libre = false;
        m_auteurLiberation = "";
    }

    public String sePresenter () {
        String presentation = super.sePresenter();
        if (m_libre && m_auteurLiberation.length()==0) presentation += " Je suis libre.";
        else if (m_libre && m_auteurLiberation.length()>0) {
            presentation += " Je suis libre grâce à mon sauveur " + m_auteurLiberation;
        }
        else 
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
        m_auteurLiberation = cowboy.getNom();
        return m_nom+" - Merci "+cowboy.getNom()+" de m'avoir libérée.";
    }


}

   