/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V8002382;

import java.util.Random;

/**
 *
 * @author v8002382
 */
public enum Faction {
    GDI,
    NOD,
    SCRIN;
    public static Faction getRandomFaction() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
    }
}
