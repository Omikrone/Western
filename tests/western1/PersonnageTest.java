package western1;

import org.junit.jupiter.api.Test;
import western1.grammaire.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonnageTest
{
    @Test
    void test_constructeurDefaut()
    {
        Personnage max = new Personnage("Max");
        assertEquals("Max - Bonjour, je suis Max et j'aime l'eau." , max.sePresenter());
    }

    @Test
    void test_constructeurSePresenter()
    {
        Personnage kid = new Personnage("The Kid", new Boisson("thé à la menthe", new Masculin()));
        assertEquals("The Kid - Bonjour, je suis The Kid et j'aime le thé à la menthe.",  kid.sePresenter());
    }

    @Test void test_boire()
    {
        Personnage kid = new Personnage("The Kid", new Boisson("thé à la menthe", new Masculin()));
        assertEquals("The Kid - Ah ! boire du thé à la menthe ! GLOUPS !", kid.boire());
    }

    @Test void test_boireBoissonPreferee()
    {
        Personnage kid = new Personnage("The Kid", new Boisson("thé à la menthe", new Masculin()));
        assertEquals("The Kid - Ah ! boire du thé à la menthe ! GLOUPS !", kid.boire(new Boisson("thé à la menthe", new Masculin())));
    }

    @Test void test_boireAutreBoisson()
    {
        Personnage kid = new Personnage("The Kid", new Boisson("thé à la menthe", new Masculin()));
        assertEquals("The Kid - GLOUPS ! Faut vraiment avoir soif pour boire du whisky ! j'aurais préféré boire du thé à la menthe.", kid.boire(new Boisson("whisky", new Masculin())));
    }
}
