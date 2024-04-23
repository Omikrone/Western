package western2;

import java.util.ArrayList;
import western1.Personnage;
import western1.grammaire.Feminin;
import western1.grammaire.Masculin;
import western1.Boisson;

public class Cowboy extends Personnage{

    private int m_argent = 0;
    private ArrayList<String> m_brigandCapturer;
    private static Boisson m_boissonDef = new Boisson("eau", new Feminin()); // nom de la boisson par defaut

    public Cowboy(String nom){
        super(nom,m_boissonDef);
        m_brigandCapturer = new ArrayList<String>();
    }
    
    public Cowboy(String nom, Boisson boissonFav){
        super(nom,boissonFav);
        m_brigandCapturer = new ArrayList<String>();
    }

    @Override
    public String sePresenter(){
        String brigand = "";
        for(String loic : m_brigandCapturer){
            brigand += loic+", ";
        }
        if(brigand.length()>2){
            brigand = brigand.substring(0,brigand.length()-2);
        }
        return super.sePresenter() + " J’ai déjà empoché "+m_argent+"$ en capturant "+brigand+".";
    }

    public String tirerSur(Brigand brigand){
        return m_nom+" - PAN ! PAN ! Prend ça, chacal de "+brigand.getNom()+" !\n"+brigand.estViserPar(this.getNom());
    }

    public String capturer(Brigand brigand){
        m_argent += brigand.getRecompense();
        m_brigandCapturer.add(brigand.getNom());
        String brigandString = brigand.estCapturer(this.getNom());
        String remercimentDame = brigand.getRemerciment(this.getNom());
        return brigandString+"\n"+m_nom+" - Voilà "+brigand.getNameDame()+"tu es libre maintenant !\n"+remercimentDame;
    }

    public static void setBoissonDef(Boisson boisson){
        m_boissonDef = boisson;
    }
}
