package western1.grammaire;

public class Masculin implements Genre{
    private String m_articleDef;
    private String m_articleIndef;
    private String m_articleParti;

    public Masculin(){
        m_articleDef = "le";
        m_articleIndef = "un";
        m_articleParti = "du";
    }

    @Override
    public String getArticleDef() {
        return m_articleDef;
    }

    public String getArticleIndef(){
        return m_articleIndef;
    }

    public String getArticleParti(){
        return m_articleParti;
    }

    private boolean estVoyelle(char lettre){
        switch (lettre) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            case 'y':
                return true;
            default:
                return false;
        }
    }
}
