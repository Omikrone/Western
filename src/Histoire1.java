package western1;

//  @ Project : Western
//  @ File Name : Histoire1.java
//  @ Date : 02/02/2010
//  @ Author : P. Divoux
//  @ Date : 31/12/2021
//  @ Author : R. Schneider
//
//

import western1.grammaire.Feminin;
import western1.grammaire.Masculin;
import western2.Narrateur;

public class Histoire1
{
    public static void main(String[] args)
    {
        Personnage max = new Personnage("Max");
        Personnage kid = new Personnage("The Kid", new Boisson("thé à la menthe", new Masculin()));
        Personnage bill = new Personnage("Bill", new Boisson("whisky", new Masculin()));
        Narrateur homere = new Narrateur();

        homere.ajouterLignes(max.sePresenter());
        homere.ajouterLignes(max.boire());
        homere.ajouterLignes(max.dire("Bon, au boulot, maintenant !"));

        homere.ajouterLignes(kid.sePresenter());
        homere.ajouterLignes(kid.boire());

        homere.ajouterLignes(bill.sePresenter());
        homere.ajouterLignes(bill.boire(new Boisson("eau", new Feminin())));

        homere.raconterHistoire();
    }
}
