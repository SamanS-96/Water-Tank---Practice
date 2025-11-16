/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watertank;

/**
 *
 * @author Hp
 */
public class StartMain {
    public static void main(String[] args) {
        WaterLevelObservable waterLevelObservable=new WaterLevelObservable();
        waterLevelObservable.addWaterLevelObserver(new AlarmWindow());
        waterLevelObservable.addWaterLevelObserver(new DisplayWindow());
        waterLevelObservable.addWaterLevelObserver(new AlarmWindow());
        waterLevelObservable.addWaterLevelObserver(new DisplayWindow());
        
        new WaterTank(waterLevelObservable).setVisible(true);
        
    }
}
