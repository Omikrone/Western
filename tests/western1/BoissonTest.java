package western1;

import western1.grammaire.Feminin;
import org.junit.jupiter.api.Test;
import western1.grammaire.Masculin;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoissonTest
{
    @Test
    public void test_masculinDefini()
    {
        Boisson whisky= new Boisson("whisky", new Masculin());
        assertEquals("le whisky", whisky.getNomAvecArticleDefini());
    }

    @Test void test_masculinIndefini()
    {
        Boisson whisky= new Boisson("whisky", new Masculin());
        assertEquals("un whisky", whisky.getNomAvecArticleIndefini());
    }

    @Test void test_masculinPartitif()
    {
        Boisson whisky= new Boisson("whisky", new Masculin());
        assertEquals("du whisky", whisky.getNomAvecArticlePartitif());
    }

    @Test
    public void test_femininDefini()
    {
        Boisson vodka= new Boisson("vodka", new Feminin());
        assertEquals("la vodka", vodka.getNomAvecArticleDefini());
    }

    @Test void test_femininIndefini()
    {
        Boisson vodka= new Boisson("vodka", new Feminin());
        assertEquals("une vodka", vodka.getNomAvecArticleIndefini());
    }

    @Test void test_femininPartitif()
    {
        Boisson vodka= new Boisson("vodka", new Feminin());
        assertEquals("de la vodka", vodka.getNomAvecArticlePartitif());
    }

    @Test void test_ellisionDefini()
    {
        Boisson eau= new Boisson("eau", new Feminin());
        assertEquals("l'eau", eau.getNomAvecArticleDefini());
    }

    @Test void test_ellisionIndefini()
    {
        Boisson eau= new Boisson("eau", new Feminin());
        assertEquals("une eau", eau.getNomAvecArticleIndefini());
    }

    @Test void test_ellisionPartitif()
    {
        Boisson eau= new Boisson("eau", new Feminin());
        assertEquals("de l'eau", eau.getNomAvecArticlePartitif());
    }

}
