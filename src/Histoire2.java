package western2;

//  @ Project : Western
//  @ File Name : Histoire2.java
//  @ Date : 02/02/2010
//  @ Author : P. Divoux
//  @ Date : 31/12/2022
//  @ Author : R. Schneider
//
//

import western1.Boisson;
import western1.grammaire.*;

public class Histoire2
{
    public static void main(String[] args)
    {
        Dame scarlett = new Dame("Scarlett");
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", new Feminin()));
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        Narrateur narrateur = new Narrateur();

        /* Les présentations */
        narrateur.ajouterLignes("Il était une fois, à l'Ouest de Java Town, trois personnages singuliers :");
        narrateur.ajouterLignes(scarlett.sePresenter());
        narrateur.ajouterLignes(luke.sePresenter());
        narrateur.ajouterLignes(dalton.sePresenter());

        /* Les libations */
        narrateur.ajouterLignes("Après leur traversée du désert, nos trois personnages s'arrêtent dans un bar pour étancher leur soif.");
        narrateur.ajouterLignes(luke.dire("Nous sommes arrivés. Trinquons, maintenant !"));
        narrateur.ajouterLignes(luke.boire());
        narrateur.ajouterLignes(dalton.boire());
        narrateur.ajouterLignes(dalton.dire("Waoh ! Il est fort celui-la !"));
        narrateur.ajouterLignes(scarlett.boire());
        narrateur.ajouterLignes(scarlett.dire("C'est quand même plus rafraîchissant que l'alcool !"));

        /* un peu d'action */
        narrateur.ajouterLignes("Et maintenant, un peu d'action.");
        narrateur.ajouterLignes(dalton.getNom() + " kidnappe " + scarlett.getNom() + ".");
        narrateur.ajouterLignes(dalton.kidnapper(scarlett));
        narrateur.ajouterLignes("Mais " + luke.getNom() + " intervient sans tarder et capture " + dalton.getNom() + ".");
        narrateur.ajouterLignes(luke.tirerSur(dalton));
        narrateur.ajouterLignes(luke.capturer(dalton));

        narrateur.raconterHistoire();
    }
}

