//  @ Project : Western
//  @ File Name : Histoire3.java
//  @ Date : 02/02/2010
//  @ Author : P. Divoux
//  @ Date : 31/12/2022
//  @ Author : R. Schneider
//
//

import western1.Boisson;
import western1.grammaire.Feminin;
import western1.grammaire.Masculin;
import western2.Brigand;
import western2.Cowboy;
import western2.Dame;
import western2.Narrateur;

public class Histoire3
{
    public static void main(String[] args)
    {
        Cowboy luke = new Cowboy("Luke");
        Cowboy.setBoissonDef(new Boisson("pepsi", new Masculin()));
        Cowboy roman = new Cowboy("roman");
        Brigand dalton = new Brigand("Dalton");
        Dame scarlett = new Dame("Scarlett");
        Narrateur narrateur = new Narrateur();

        /* Les présentations */
        narrateur.ajouterLignes("Il était une fois, à l'Ouest de Java Town, trois personnages singuliers :");
        narrateur.ajouterLignes(luke.sePresenter());
        narrateur.ajouterLignes(roman.sePresenter());
        narrateur.ajouterLignes(dalton.sePresenter());
        narrateur.ajouterLignes(scarlett.sePresenter());

        narrateur.raconterHistoire();
        /* Les libations */
        narrateur.ajouterLignes("Après leur traversée du désert, nos trois personnages s'arrêtent dans un bar pour étancher leur soif.");
        narrateur.ajouterLignes(luke.dire("Nous sommes arrivés. Trinquons, maintenant !"));
        narrateur.ajouterLignes(luke.boire());
        narrateur.ajouterLignes(dalton.boire());
        narrateur.ajouterLignes(dalton.dire("Waoh ! Il est fort celui-la !"));
        narrateur.ajouterLignes(scarlett.boire());
        narrateur.ajouterLignes(scarlett.dire("C'est quand même plus hydratant que l'alcool !"));

        narrateur.raconterHistoire();
        /* un peu d'action */
        narrateur.ajouterLignes("Et maintenant, un peu d'action.");
        narrateur.ajouterLignes(dalton.getNom() + " kidnappe " + scarlett.getNom() + ".");
        narrateur.ajouterLignes(dalton.kidnapper(scarlett));
        narrateur.ajouterLignes(scarlett.sePresenter());
        narrateur.ajouterLignes(dalton.sePresenter());
        narrateur.ajouterLignes("Mais " + luke.getNom() + " intervient sans tarder et capture " + dalton.getNom() + ".");
        narrateur.ajouterLignes(luke.tirerSur(dalton));
        narrateur.ajouterLignes(luke.capturer(dalton));
        narrateur.ajouterLignes(scarlett.sePresenter());
        narrateur.ajouterLignes(dalton.sePresenter());
        narrateur.ajouterLignes(luke.sePresenter());
        narrateur.raconterHistoire();
    }
}

