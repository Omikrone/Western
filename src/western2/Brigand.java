package western2;

import western1.Personnage;

import java.util.ArrayList;

import western1.Boisson;
import western2.Cowboy;
import western2.Dame;

public class Brigand extends Personnage{
    private Boolean estLibre;
    private String m_auteurCapture;
    private int m_recompense;
    private ArrayList<Dame> m_dameKidnapper;

    public Brigand(String nom, Boisson boissonFav){
        super(nom, boissonFav);
        estLibre = true;
        m_dameKidnapper = new ArrayList<Dame>();
        m_recompense = 100;
    }

    @Override
    public String getNom(){
        return m_nom+" le méchant";
    }

    public String sePresenter() {
        String presentation = super.sePresenter();
        presentation += " Ma tête est mise à prix " + m_recompense + "$ !";
        if (estLibre && m_dameKidnapper.size()>0) {
            presentation += " Je suis libre et en bonne compagnie avec ";
            for (int i=0; i<m_dameKidnapper.size(); i++) {
                if (i!=0) presentation += ", ";
                presentation += m_dameKidnapper.get(i).getNom();
            }
            presentation += ".";
        }
        else if (estLibre && m_dameKidnapper.size()==0) presentation += " Je suis libre.";
        else presentation += " Je suis le prisonnier de " + m_auteurCapture + ".";
        return presentation;
    }

    public String kidnapper(Dame dame){
        m_recompense += 50;
        m_dameKidnapper.add(dame);
        return dame.crier(this)+"\n"+m_nom+" - Ah ah ! "+dame.getNom()+" tu es mienne désormais.";
    }

    String estCapturer(Cowboy cowboy){
        estLibre = false;
        m_auteurCapture = cowboy.getNom();
        return  m_nom+" - Damned, je suis fait ! "+cowboy.getNom()+", tu m'as eu ! Tu n'emporteras pas les "+m_recompense+"$ au paradis.";
    }

    /*
     * permet d'avoir un copie de la liste des dames kinaper par un brigrand
     * Attention la liste du brigand est vidé par cette fonction
     */
    ArrayList<Dame> getDameKidnapper(){
        ArrayList<Dame> listDame = new ArrayList<Dame>();
        for(Dame dame : m_dameKidnapper){
            listDame.add(dame);
        }
        m_dameKidnapper.clear();
        return listDame;
    }

    String estViserPar(Cowboy cowboy){
        return m_nom+" - Tu n'es qu'un coyote, "+cowboy.getNom()+" !";
    }

    public int getRecompense(){
        return m_recompense;
    }
}
