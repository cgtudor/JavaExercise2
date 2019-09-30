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
public class HeavyTank extends Vehicle{
    
    public HeavyTank(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                points = 225;
                break;
            case NOD:
                points = 310;
                break;
            case SCRIN:
                points = 270;
                break;
        }
    }

    @Override
    public String kill() {
        totalPoints += points;
        return "A "+faction+" heavy tank is demolished: +"+points+"pts.\n";
    }
    
}
