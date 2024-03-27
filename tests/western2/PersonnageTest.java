package western2;
import org.junit.jupiter.api.Test;
import western1.Boisson;
import western1.grammaire.Feminin;
import western1.grammaire.Masculin;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class PersonnageTest
{
    @Test void test_narrateur()
    {
        Narrateur narrateur = new Narrateur();
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        narrateur.ajouterLignes("Il était une fois, à l'Ouest de Java Town, trois personnages singuliers :");
        narrateur.raconterHistoire();
        assertEquals("Il était une fois, à l'Ouest de Java Town, trois personnages singuliers :", myOut.toString().trim());
    }

    @Test void test_kidnapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        assertEquals("Scarlett - Hiiii ! Au secours ! Dalton le méchant m'enlève !\nDalton - Ah ah ! Miss Scarlett tu es mienne désormais.",
                dalton.kidnapper(scarlett));
    }

    @Test void test_tir()
    {
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", new Feminin()));
        assertEquals("Luke - PAN ! PAN ! Prend ça, chacal de Dalton le méchant !\nDalton - Tu n'es qu'un coyote, Luke !",
                luke.tirerSur(dalton));
    }

    @Test void test_capture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        assertEquals("Dalton - Damned, je suis fait ! Luke, tu m'as eu ! Tu n'emporteras pas les 150$ au paradis.\nLuke - Voilà Miss Scarlett, tu es libre maintenant !\nScarlett - Merci Luke de m'avoir libérée.",
                luke.capturer(dalton));
    }


}
