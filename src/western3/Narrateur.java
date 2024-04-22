package western2;

public class Narrateur {
    String m_lignes = "";
    public Narrateur () {
    }

    public void ajouterLignes(String lignes) {
        m_lignes += lignes+"\n";
    }

    public void raconterHistoire() {
        System.out.println(m_lignes);
    }
}
