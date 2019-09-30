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
public class LightTank extends Vehicle{
    
    public LightTank(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                points = 150;
                break;
            case NOD:
                points = 175;
                break;
            case SCRIN:
                points = 150;
                break;
        }
    }

    @Override
    public String kill() {
        return "A "+faction+" light tank is destroyed: +"+points+"pts.\n";
    }
    
}
