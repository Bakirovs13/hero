package com.company;

import javax.lang.model.element.Name;
import java.util.Random;
//class XYZ{
//    private Object ab
//    public XYZ(Object ab){
//        this.ab = ab;//This is the constructor called when you create an XYZ object, and want to use the Object ab in XYZ
//    }
public class Hero {

   int HeroHealth;
   int HeroDamage;
   String heroName;




     public Hero(int HeroHealth,int HeroDamage,String heroName){       //конструктор
         System.out.println();
         this.heroName = heroName;
         this.HeroHealth = HeroHealth;
         this.HeroDamage = HeroDamage;
     }


     public void setHeroHealth(int HeroHealth ){ this.HeroHealth=HeroHealth; }
     public void setHeroDamage(int HeroDamage){ this.HeroDamage=HeroDamage; }

     public void setHeroName(String heroName){ this.heroName = heroName; }

     public void getInfo(){
         System.out.println("Hero name:"+  heroName);
         System.out.println("Hero Health:" +HeroHealth);
         System.out.println("Hero Damage:"  +HeroDamage);


     }



    }




