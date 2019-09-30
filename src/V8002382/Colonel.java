/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V8002382;

/**
 *
 * @author v8002382
 */
public class Colonel extends Soldier implements Killable{

    public Colonel(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                points = 100;
                break;
            case NOD:
                points = 95;
                break;
            case SCRIN:
                points = 90;
                break;
        }
    }

    @Override
    public String kill() {
        totalPoints += points;
        return "A "+faction+" colonel retires, permanently: +"+points+"pts.\n";
    }
    
}
