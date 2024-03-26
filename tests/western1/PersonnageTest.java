package western1;

import western1.Boisson;
import western1.grammaire.Genre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonnageTest
{
    @Test
    void test_constructeurDefaut()
    {
        Personnage max = new Personnage("Max");
        //redirection de la sortie standart vers myOut
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        max.sePresenter();
        assertEquals("Max - Bonjour, je suis Max et j'aime l'eau." , myOut.toString().trim());
    }

    @Test
    void test_constructeurSePresenter()
    {
        Personnage kid = new Personnage("The Kid", new Boisson("thé à la menthe", Genre.MASCULIN));
        //redirection de la sortie standart vers myOut
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        kid.sePresenter();
        assertEquals("The Kid - Bonjour, je suis The Kid et j'aime le thé à la menthe.",  myOut.toString().trim());
    }
}
