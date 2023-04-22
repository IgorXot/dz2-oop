package Hero;
public class Sniper extends BaseHero {

    public Sniper(String name, int strength, int health) {
        super(name, strength, health);
        
    }
    public Sniper() {
        super( "Sniper", 5, 30 );
    }


    public void aim() {
        System.out.println(this.name + " целится из винтовки.");
    }

    
    public void shoot() {
        System.out.println(this.name + " стреляет из винтовки.");
    }
}
    

