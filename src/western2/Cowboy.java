package western2;

import java.util.ArrayList;
import western1.Personnage;
import western1.Boisson;

public class Cowboy extends Personnage{

    private int m_argent = 0;
    private ArrayList<Brigand> brigandCapturer;

    public Cowboy(String nom, Boisson boissonFav){
        super(nom,boissonFav);
        brigandCapturer = new ArrayList<Brigand>();
    }

    @Override
    public String sePresenter(){
        String brigand = "";
        for(Brigand b : brigandCapturer){
            brigand += b.getNom()+", ";
        }
        brigand = brigand.substring(0,brigand.length()-2);
        return super.sePresenter() + " J’ai déjà empoché "+m_argent+"$ en capturant "+brigand+".";
    }

    public String tirerSur(Brigand brigand){
        return m_nom+" - PAN ! PAN ! Prend ça, chacal de "+brigand.getNom()+" !\n"+brigand.estViserPar(this);
    }

    public String capturer(Brigand brigand){
        m_argent += brigand.getRecompense();
        brigandCapturer.add(brigand);
        String brigandString = brigand.estCapturer(this);
        String remercimentDame = "";
        String nomDame = "";
        for(Dame dame : brigand.getDameKidnapper()){
            remercimentDame = remercimentDame.concat("\n"+dame.remercier(this));
            nomDame = nomDame.concat(dame.getNom()+", ");
        }
        return brigandString+"\n"+m_nom+" - Voilà "+nomDame+"tu es libre maintenant !"+remercimentDame;
    }
}
