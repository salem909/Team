/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import client.MapleClient;
import client.MapleCharacter;
import client.inventory.MapleInventoryType;
import net.AbstractMaplePacketHandler;
import client.inventory.manipulator.MapleInventoryManipulator;
import tools.MaplePacketCreator;
import client.MapleOccupations;

/**
 *
 * @author ExtremeUser
 */
public class Occexp { 
    public static void doOccexpgain(client.MapleCharacter chr){ 
        int mesoMultiplier = 1; 
        int expMultiplier = 1; 
        switch(chr.getWorld()){ 
            case 0: 
                mesoMultiplier = config.ServerConfig.MESO_RATE; 
                expMultiplier = config.ServerConfig.EXP_RATE; 
                break; 
            case 1: // if you have bera 
                mesoMultiplier = config.ServerConfig.MESO_RATE; 
                expMultiplier = config.ServerConfig.EXP_RATE; 
                break; 
            case 2: // if you have broa 
                mesoMultiplier = config.ServerConfig.MESO_RATE; 
                expMultiplier = config.ServerConfig.EXP_RATE; 
                break; 
        } 
        int mesoAward = (int)(1400.0 * Math.random() + 1201) * mesoMultiplier + (15 * chr.getLevel() / 5); 
        int expAward = (int)(645.0 * Math.random()) * expMultiplier + (15 * chr.getLevel() / 2) / 6; 
    
        if((chr.getMapId() == 180000000 && chr.getOccupation().isA(MapleOccupations.Aphrodite)) || (chr.getMapId() == 100000000 && chr.getOccupation().isA(MapleOccupations.Aphrodite)) || (chr.getMapId() == 1000 && chr.getOccupation().isA(MapleOccupations.Aphrodite) )){ 
                    chr.gainOccupationEXP((int)(Math.random() * 10 + 1));
                    //chr.gainItem((int)(4032056), (short)10, (boolean)false);          
        }
    } 
    public static int getRandomItem(){ 
        int finalID = 0; 
        int rand = (int)(100.0 * Math.random()); 
        int[] commons = {1002851, 2002020, 2002020, 2000006, 2000018, 2002018, 2002024, 2002027, 2002027, 2000018, 2000018, 2000018 , 2000018, 2002030, 2002018, 2000016}; // filler' up 
        int[] uncommons = {1000025, 1002662, 1002812, 1002850, 1002881, 1002880, 1012072, 4020009, 2043220, 2043022, 2040543, 2044420, 2040943, 2043713, 2044220, 2044120, 2040429, 2043220, 2040943}; // filler' uptoo 
        int[] rares = {1002859, 1002553, 01002762, 01002763, 01002764, 01002765, 01002766, 01002663, 1002788, 1002949, 2049100, 2340000, 2040822,2040822,2040822,2040822,2040822,2040822,2040822,2040822}; // filler' uplast 
        if(rand >= 25){ 
            return commons[(int)(commons.length * Math.random())]; 
        } else if(rand <= 7 && rand >= 5){ 
            return uncommons[(int)(uncommons.length * Math.random())]; 
        } else if(rand <= 3){ 
            return rares[(int)(rares.length * Math.random())]; 
        } 

        return finalID; 
    } 
}
