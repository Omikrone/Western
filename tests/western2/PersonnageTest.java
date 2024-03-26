package western2;
import org.junit.jupiter.api.Test;
import western1.Boisson;
import western1.grammaire.Genre;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest
{
    @Test void test_narrateur()
    {
        Narrateur narrateur = new Narrateur("Ed");
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        narrateur.dire("Il était une fois, à l'Ouest de Java Town, trois personnages singuliers :");
        assertEquals("Il était une fois, à l'Ouest de Java Town, trois personnages singuliers :", myOut.toString().trim());
    }

    @Test void test_kidnapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", Genre.MASCULIN));
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        dalton.kidnapper(scarlett);
        assertEquals("Scarlett - Hiiii ! Au secours ! Dalton le méchant m'enlève !\nDalton - Ah ah ! Miss Scarlett tu es mienne désormais.", myOut.toString().trim());
    }

    @Test void test_tir()
    {
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", Genre.MASCULIN));
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", Genre.FEMININ));
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        luke.tirerSur(dalton);
        assertEquals("Luke - PAN ! PAN ! Prend ça, chacal de Dalton le méchant !\nDalton - Tu n'es qu'un coyote, Luke !", myOut.toString().trim());
    }

    @Test void test_capture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", Genre.MASCULIN));
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", Genre.FEMININ));
        dalton.kidnapper(scarlett);
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        luke.capturer(dalton);
        assertEquals("Dalton - Damned, je suis fait ! Luke, tu m'as eu ! Tu n'emporteras pas les 150$ au paradis.\nLuke - Voilà Miss Scarlett, tu es libre maintenant !\nScarlett - Merci Luke de m'avoir libérée.", myOut.toString().trim());
    }

}
