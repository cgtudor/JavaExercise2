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
public class Cadet extends Soldier implements Killable{

    public Cadet(Faction faction) {
        super(faction);
    }

    @Override
    public String kill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}