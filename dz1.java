import Hero.Crossbowman;
import Hero.Monk;
import Hero.Peasant;
import Hero.Rogue;
import Hero.Sniper;
import Hero.Spearman;
import Hero.Warlock;

//Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах". 
//Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
//В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
//Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

public class dz1 {

    public static void main(String[] args) {
        // Крестьянин
        Peasant peasant = new Peasant("Ivan", 5, 100);
        // Разбойник
        Rogue rogue = new Rogue("Serga", 5, 120);
        // Снайпер
        Sniper sniper = new Sniper("Gaz", 5, 120);
        // Колдун
        Warlock warlock = new Warlock("Marvel", 5, 80);
        // Копейщик
        Spearman spearman = new Spearman("Tuty", 5, 200);
        // Арбалетчик
        Crossbowman crossbowman = new Crossbowman("Tom", 5, 110);
        // Монах
        Monk monk = new Monk("Bob", 5, 90);

        // можем использовать каждый персонаж и вызывать их методы
        System.out.println(  );
        peasant.attack(rogue);
        peasant.harvest();
        rogue.attack(spearman);
        rogue.die();
        sniper.rest(50);
        sniper.aim();
        warlock.rest(30);
        warlock.curse();
        crossbowman.attack(monk);
        crossbowman.reload();
        spearman.takeDamage(50);
        spearman.brace();
        monk.rest(20);
        monk.heal();

        System.out.println( "\n" + peasant );
        System.out.println( rogue );
        System.out.println( sniper );
        System.out.println( warlock );
        System.out.println( crossbowman );
        System.out.println( spearman );
        System.out.println( monk + "\n" );
        
    }
        
    
}