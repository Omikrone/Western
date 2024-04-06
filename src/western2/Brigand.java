package western2;

import western1.Personnage;

import java.util.ArrayList;

import western1.Boisson;

public class Brigand extends Personnage{
    
    private int m_recompense;
    private ArrayList<Dame> m_dameKidnapper;

    public Brigand(String nom, Boisson boissonFav){
        super(nom, boissonFav);
        m_dameKidnapper = new ArrayList<Dame>();
        m_recompense = 100;
    }

    @Override
    public String getNom(){
        return m_nom+" le méchant";
    }

    public String kidnapper(Dame dame){
        m_recompense += 50;
        m_dameKidnapper.add(dame);
        return dame.crier(this)+"\n"+m_nom+" - Ah, ah ! "+dame.getNom()+" , tu es mienne désormais !\n";
    }

    protected String estCapturer(Cowboy cowboy){
        return  m_nom+" - Damned, je suis fait ! Tu m'as eu, "+cowboy.getNom()+" ! Mais tu n'emporteras pas les "+m_recompense+" $ au paradis.";
    }

    /*
     * permet d'avoir un copie de la liste des dames kinaper par un brigrand
     * Attention la liste du brigand est vidé par cette fonction
     */
    protected ArrayList<Dame> getDameKidnapper(){
        ArrayList<Dame> listDame = new ArrayList<Dame>();
        for(Dame dame : m_dameKidnapper){
            listDame.add(dame);
        }
        m_dameKidnapper.clear();
        return listDame;
    }

    protected String estViserPar(Cowboy cowboy){
        return m_nom+" - Tu n’es qu’un coyote, "+cowboy.getNom()+" !";
    }

    public int getRecompense(){
        return m_recompense;
    }
}
