package Hero;
public class Rogue extends BaseHero {

    public Rogue(String name, int strength, int health) {
        super(name, strength, health);
        
    }
    public Rogue() {
        super( "Rogue", 6, 30 );
    }


    public void pickPocket() {
        System.out.println(this.name + " обшаривает карманы.");
    }

    
    public void sneak() {
        System.out.println(this.name + " у все крадет.");
    }
}

