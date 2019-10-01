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
public class Major extends Soldier implements Killable{

    ImageIcon icon;
    
    public Major(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                icon = new ImageIcon("gdi-major");
                points = 55;
                break;
            case NOD:
                icon = new ImageIcon("nod-major");
                points = 60;
                break;
            case SCRIN:
                icon = new ImageIcon("scrin-major");
                points = 70;
                break;
        }
    }

    @Override
    public String kill() {
        totalPoints += points;
        return "A "+faction+" major explodes into pieces: +"+points+"pts.\n";
    }
    
}
