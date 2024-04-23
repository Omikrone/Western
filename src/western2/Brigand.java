package western2;

import western1.Personnage;
import western1.grammaire.Feminin;

import java.util.ArrayList;

import western1.Boisson;

public class Brigand extends Personnage{
    private Boolean m_estLibre;
    private String m_auteurCapture;
    private int m_recompense;
    private ArrayList<Dame> m_dameKidnapper;
    private static Boisson m_boissonDef = new Boisson("eau", new Feminin());

    public Brigand(String nom, Boisson boissonFav){
        super(nom, boissonFav);
        m_estLibre = true;
        m_dameKidnapper = new ArrayList<Dame>();
        m_recompense = 100;
    }

    public Brigand(String nom){
        super(nom, m_boissonDef);
        m_estLibre = true;
        m_dameKidnapper = new ArrayList<Dame>();
        m_recompense = 100;
    }

    @Override
    public String getNom(){
        return m_nom+" le méchant";
    }

    String getNameDame(){ 
        String listeDame = "";
        for(Dame dame : m_dameKidnapper){
            listeDame += dame.getNom()+", ";
        }
        return listeDame;
    }

    String getRemerciment(String nomCoboy){
        String remerciment = "";
        for(Dame dame : m_dameKidnapper){
            remerciment += dame.remercier(nomCoboy);
        }
        return remerciment;
    }

    public String sePresenter() {
        String presentation = super.sePresenter();
        presentation += " Ma tête est mise à prix " + m_recompense + "$ !";

        if (m_dameKidnapper.size()>0) {
            presentation += " Je suis libre et en bonne compagnie avec ";
            presentation += getNameDame();
            presentation = presentation.substring(0,presentation.length()-2) + ".";
        }
        else if (m_estLibre){
            presentation += " Je suis libre.";
        }
        else{
            presentation += " Je suis le prisonnier de " + m_auteurCapture + ".";
        }
        return presentation;
    }

    public String kidnapper(Dame dame){
        m_recompense += 50;
        m_dameKidnapper.add(dame);
        return dame.crier(this.getNom())+"\n"+m_nom+" - Ah ah ! "+dame.getNom()+" tu es mienne désormais.";
    }

    String estCapturer(String cowboy){
        m_estLibre = false;
        m_auteurCapture = cowboy;
        m_dameKidnapper.clear();
        return  m_nom+" - Damned, je suis fait ! "+cowboy+", tu m'as eu ! Tu n'emporteras pas les "+m_recompense+"$ au paradis.";
    }

    String estViserPar(String cowboy){
        return m_nom+" - Tu n'es qu'un coyote, "+cowboy+" !";
    }

    public int getRecompense(){
        return m_recompense;
    }

    public static void setBoissonDef(Boisson boisson){
        m_boissonDef = boisson;
    }
}
