/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V8002382;

import javax.swing.ImageIcon;

/**
 *
 * @author v8002382
 */
public class HeavyTank extends Vehicle{
    
    ImageIcon icon;
    
    public HeavyTank(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                icon = new ImageIcon("gdi-htank");
                points = 225;
                break;
            case NOD:
                icon = new ImageIcon("nod-htank");
                points = 310;
                break;
            case SCRIN:
                icon = new ImageIcon("scrin-htank");
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
