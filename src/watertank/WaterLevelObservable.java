/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watertank;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class WaterLevelObservable { //Controll Room-----------
    private int waterLevel;
    private ArrayList<WaterLevelObserver> observerList=new ArrayList<>();
    
    public boolean addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        return observerList.add(waterLevelObserver);
    }
    public boolean removeWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        return observerList.remove(waterLevelObserver);
    }
    public void notifyObservers(){
        for (WaterLevelObserver waterLevelObserver : observerList) {
           waterLevelObserver.update(waterLevel);
        }
    }
}
