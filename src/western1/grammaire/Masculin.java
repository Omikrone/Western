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

    @Override
    public String getArticleIndef(){
        return m_articleIndef;
    }

    @Override
    public String getArticleParti(){
        return m_articleParti;
    }
}
