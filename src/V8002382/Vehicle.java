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
public abstract class Vehicle implements Killable{
    Faction faction;
    public int points;
    public static int totalPoints;
    public Vehicle(Faction faction) {
        this.faction = faction;
    }
    public int getPoints()
    {
        return points;
    }
}
