/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.televisao;

/**
 *
 * @author carlo
 */
public class Televisao {

        String modelo;
        int polegadas;
        int peso;
        boolean ligada;
      
                
        
        void status(){
        System.out.println("modelo " + this.modelo);
        System.out.println("polegadas " + this.polegadas);
        System.out.println("peso" + this.peso);
        }
     void ligar(){
         if(this.ligada == true){
             System.out.println("a tv esta ligada ");        
         }        
         
         }
     void volume(){
         if(this.ligada == true){
             System.out.println("aumentar volume");
         }else{
             System.out.println("diminuir volume");
         }
         
    }        
    }
    

