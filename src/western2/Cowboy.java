package western2;

import western1.Personnage;
import western1.Boisson;

public class Cowboy extends Personnage{

    private int m_argent = 0;

    public Cowboy(String nom, Boisson boissonFav){
        super(nom,boissonFav);
    }

    public String tirerSur(Brigand brigand){
        return m_nom+" - PAN ! PAN ! Prends ça, chacal de "+brigand.getNom()+" !\n"+brigand.estViserPar(this);
    }

    public String capturer(Brigand brigand){
        m_argent += brigand.getRecompense();
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
