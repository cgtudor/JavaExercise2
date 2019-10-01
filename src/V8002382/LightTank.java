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
public class LightTank extends Vehicle{
    
    ImageIcon icon;
    
    public LightTank(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                icon = new ImageIcon("gdi-ltank");
                points = 150;
                break;
            case NOD:
                icon = new ImageIcon("not-ltank");
                points = 175;
                break;
            case SCRIN:
                icon = new ImageIcon("scrin-ltank");
                points = 150;
                break;
        }
    }

    @Override
    public String kill() {
        totalPoints += points;
        return "A "+faction+" light tank is destroyed: +"+points+"pts.\n";
    }
    
}
