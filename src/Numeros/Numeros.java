/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;
import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Numeros {
    private Robot joe;
    private City Muros;
    private Thing bola;
    private Wall blockAve1;
    
     public Numeros(){
        
        this.Muros = new City(10,10);
        
        this.joe = new Robot(Muros,6,2,Direction.NORTH);
        for(int i=1;i<=5;i++){
        this.blockAve1 = new Wall(Muros, i, 1, Direction.WEST);
        }
        for(int i=1;i<=9;i++){
        this.blockAve1 = new Wall(Muros, 1, i, Direction.NORTH);
        }
        for(int i=1;i<=5;i++){
        this.blockAve1 = new Wall(Muros, i, 4, Direction.WEST);
        }
        for(int i=1;i<=5;i++){
        this.blockAve1 = new Wall(Muros, i, 7, Direction.WEST);
        }
        for(int i=1;i<=5;i++){
        this.blockAve1 = new Wall(Muros, i, 9, Direction.EAST);
        }
        this.blockAve1 = new Wall(Muros, 5, 1, Direction.SOUTH);
        this.blockAve1 = new Wall(Muros, 5, 3, Direction.SOUTH);
        this.blockAve1 = new Wall(Muros, 5, 4, Direction.SOUTH);
        this.blockAve1 = new Wall(Muros, 5, 6, Direction.SOUTH);
        this.blockAve1 = new Wall(Muros, 5, 7, Direction.SOUTH);
        this.blockAve1 = new Wall(Muros, 5, 9, Direction.SOUTH);
       
        for(int x=1;x<6;x++){
            for(int y=1;y<10;y++)
            {
                this.bola = new Thing(this.Muros,x,y);
            }
        }
 }
     
}
