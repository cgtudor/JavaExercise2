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
public class Major extends Soldier implements Killable{

    public Major(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                points = 55;
                break;
            case NOD:
                points = 60;
                break;
            case SCRIN:
                points = 70;
                break;
        }
    }

    @Override
    public String kill() {
        return "A "+faction+" major explodes into pieces: +"+points+"pts.\n";
    }
    
}
