package western3;

import org.junit.jupiter.api.Test;
import western1.Boisson;
import western1.grammaire.Feminin;
import western1.grammaire.Masculin;
import western2.Brigand;
import western2.Cowboy;
import western2.Dame;
import western2.Narrateur;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class PersonnagesTest
{
    @Test void test_presentationBrigand()
    {
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 100$ ! Je suis libre.", dalton.sePresenter());
    }

    @Test void test_presentationDame()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis libre." , scarlett.sePresenter());
    }

    @Test void test_presentationBrigandKinapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        dalton.kidnapper(scarlett);
        assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 150$ ! Je suis libre et en bonne compagnie avec Miss Scarlett.",
                dalton.sePresenter());
    }

    @Test void test_presentationDameKinapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        dalton.kidnapper(scarlett);
        assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis captive de cet escroc de Dalton le méchant.",
                scarlett.sePresenter());
    }

    @Test void test_presentationDameLiberation()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis libre grace à Luke.",
                scarlett.sePresenter());
    }

    @Test void test_presentationBrigandCapture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 150$ ! Je suis le prisonnier de Luke.",
                dalton.sePresenter());
    }

    @Test void test_presentationCowboyCapture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Boisson("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Boisson("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        assertEquals("Luke - Bonjour, je suis Luke et j'aime la bière. J’ai déjà empoché 150$ en capturant Dalton le méchant.",
                luke.sePresenter());
    }


}
