package skills;
// classe que implementa a interface Skills
public abstract class PericiaBonus implements Skills {
    private String name;
    private int bonus;

    //contrutor
    public PericiaBonus(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }

}
