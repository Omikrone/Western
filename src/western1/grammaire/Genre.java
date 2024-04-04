package western1.grammaire;

/**
 * Genre
 */
public interface Genre {
    String getArticleDef(char premierLettre);
    String getArticleIndef(char premierLettre);
    String getArticleParti(char premierLettre);
}