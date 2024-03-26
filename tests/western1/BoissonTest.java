package western1;

import western1.Boisson;
import western1.grammaire.Genre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoissonTest
{
    @Test
    public void test_masculinDefini()
    {
        Boisson whisky= new Boisson("whisky", Genre.MASCULIN);
        assertEquals("le whisky", whisky.getNomAvecArticleDefini());
    }

    @Test void test_masculinIndefini()
    {
        Boisson whisky= new Boisson("whisky", Genre.MASCULIN);
        assertEquals("un whisky", whisky.getNomAvecArticleIndefini());
    }

    @Test void test_masculinPartitif()
    {
        Boisson whisky= new Boisson("whisky", Genre.MASCULIN);
        assertEquals("du whisky", whisky.getNomAvecArticlePartitif());
    }

    @Test
    public void test_femininDefini()
    {
        Boisson whisky= new Boisson("vodka", Genre.FEMININ);
        assertEquals("la vodka", whisky.getNomAvecArticleDefini());
    }

    @Test void test_femininIndefini()
    {
        Boisson whisky= new Boisson("vodka", Genre.FEMININ);
        assertEquals("une vodka", whisky.getNomAvecArticleIndefini());
    }

    @Test void test_femininPartitif()
    {
        Boisson whisky= new Boisson("vodka", Genre.FEMININ);
        assertEquals("de la vodka", whisky.getNomAvecArticlePartitif());
    }

    @Test void test_ellisionDefini()
    {
        Boisson eau= new Boisson("eau", Genre.FEMININ);
        assertEquals("l'eau", eau.getNomAvecArticleDefini());
    }

    @Test void test_ellisionIndefini()
    {
        Boisson eau= new Boisson("eau", Genre.FEMININ);
        assertEquals("une eau", eau.getNomAvecArticleIndefini());
    }

    @Test void test_ellisionPartitif()
    {
        Boisson eau= new Boisson("eau", Genre.FEMININ);
        assertEquals("de l'eau", eau.getNomAvecArticlePartitif());
    }

}
