package skills;

public class Craft {
    private String name;

    public static final Craft FERREIRO = new Craft("Ferreiro");
    public static final Craft ARTESAO = new Craft("Artesão");
    public static final Craft ALQUIMISTA = new Craft("Alquimista");
    public static final Craft CONSTRUTOR = new Craft("Construtor");
    public static final Craft PADRE = new Craft("Padre");
    public static final Craft EXPLORADOR = new Craft("Explorador");

    public Craft(String name) {
        this.name = name;
    }
    public String getCraftName() {
        return name;
    }
}
