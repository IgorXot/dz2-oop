package Hero;
public class Monk extends BaseHero {

    public Monk(String name, int strength, int health) {
        super(name, strength, health);
    
    }
    public Monk() {
        super( "Monk", 6, 30 );
    }


    public void meditate() {
        System.out.println(this.name + " медитирует.");
    }


    public void heal() {
        System.out.println(this.name + " использует целебную силу.");
    }
}

