/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V8002382;

import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author v8002382
 */
public class Cadet extends Soldier implements Killable{
    ImageIcon icon;
    public Cadet(Faction faction) {
        super(faction);
        switch(faction)
        {
            case GDI:
                icon = new ImageIcon("gdi-cadet.png");
                points = 25;
                break;
            case NOD:
                icon = new ImageIcon("nod-cadet.png");
                points = 20;
                break;
            case SCRIN:
                icon = new ImageIcon("scrin-cadet.png");
                points = 15;
                break;
        }
    }

    @Override
    public String kill() {
        totalPoints += points;
        return "A "+faction+" cadet bites the dust: +"+points+"pts.\n";
    }
    
}
