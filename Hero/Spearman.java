package Hero;
public class Spearman extends BaseHero {

    public Spearman(String name, int strength, int health) {
        super(name, strength, health);
        
    }
    public Spearman() {
        super( "Spearman", 7, 30 );
    }


    public void brace() {
        System.out.println(this.name + " отмахивается своим копьем.");
    }


    public void thrust() {
        System.out.println(this.name + " бьет копьем.");
    }
}
