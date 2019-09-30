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
public class Cadet extends Soldier implements Killable{

    public Cadet(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                points = 25;
                break;
            case NOD:
                points = 20;
                break;
            case SCRIN:
                points = 15;
                break;
        }
    }

    @Override
    public String kill() {
        return "A "+faction+" cadet bites the dust: +"+points+"pts.\n";
    }
    
}
