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
public class Colonel extends Soldier implements Killable{

    ImageIcon icon;
    public Colonel(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                icon = new ImageIcon("gdi-colonel.png");
                points = 100;
                break;
            case NOD:
                icon = new ImageIcon("nod-colonel.png");
                points = 95;
                break;
            case SCRIN:
                icon = new ImageIcon("scrin-colonel.png");
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
