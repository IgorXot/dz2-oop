import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Hero.*;

public class dz2 {
    public static void main( String[] args ) {
        List<BaseHero> team_1 = generateHeroes( 10 );
        List<BaseHero> team_2 = generateHeroes( 10 );
        System.out.println( "\nСписок_1:" );
        team_1.forEach( u -> System.out.println( u.getInfo() ) );

        System.out.println( "\nСписок_2:" );
        team_2.forEach( u -> System.out.println( u.getInfo() ) );
        System.out.println();
    }


    public static List<BaseHero> generateHeroes( int count ) {
        List<BaseHero> list = new ArrayList<>();
        for ( int i = 0; i < count; i++ ) {
            switch( new Random().nextInt( 7 ) ) {
                case 0:
                    list.add( new Peasant( getName(), 3, 100 ) );
                    break;
                case 1:
                    list.add( new Rogue( getName(), 5, 150 ) );
                    break;
                case 2:
                    list.add( new Sniper( getName(), 6, 120 ) );
                    break;
                case 3:
                    list.add( new Warlock( getName(), 9, 80 ) );
                    break;
                case 4:
                    list.add( new Spearman( getName(), 8, 200 ) );
                    break;
                case 5:
                    list.add( new Crossbowman( getName(), 7, 110 ) );
                    break;
                default:
                    list.add( new Monk( getName(), 4, 90 ) );
            }
        }
        return list;
    }


    private static String getName(){
        return names.values()[ new Random().nextInt( names.values().length ) ].toString();
    }
}

