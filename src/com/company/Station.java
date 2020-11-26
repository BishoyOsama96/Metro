package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Station {
 private byte price;
    byte u, v,nostation,extime,wtime=4;
    byte t = 0;
     public ArrayList<String> line1=new ArrayList<>(Arrays.asList(
             "New El-Marg","El-Marg","Ezbet El-Nakhl","Ain Shams",
             "El-Matareyya","Helmeyet El-Zaitoun","Hadayeq El-Zaitoun"
             ,"Saray El-Qobba","Hammamat ElQobba","Kobri El-Qobba",
             "Manshiet El-Sadr","El-Demerdash","Ghamra","Al-Shohadaa",
             "Orabi","Nasser","Sadat","Saad Zaghloul","Al-Sayeda Zeinab",
             "El-Malek El-Saleh","Mar Girgis","El-Zahraa'","Dar El-Salam",
             "Hadayek El-Maadi","Maadi","Sakanat El-Maadi","Tora El-Balad",
             "Kozzika","Tora El-Asmant","El-Maasara","Hadayek Helwan",
             "Wadi Hof","Helwan University","Ain Helwan","Helwan"));
    public ArrayList<String> line2=new ArrayList<>(Arrays.asList(
            "El-Mounib","Sakiat Mekky"," Omm El-Masryeen","Giza",
            "Faisal","Cairo University","El Bohoth","Dokki",
            "Opera","Sadat","Mohamed Naguib","Attaba",
            "Al Shohadaa","Masarra","Rod El-Farag","St. Teresa",
            "Khalafawy","Mezallat", "Kolleyyet El-Zeraa","Shubra El-Kheima"));
   public ArrayList<String> line3=new ArrayList<>(Arrays.asList("Airport","Ahmed Galal",
           "Adly Mansour","El Haykestep","Omar Ibn El-Khattab", "Qobaa","Hesham Barakat",
           "El-Nozha","Nadi El-Shams","Alf Maskan","Heliopolis Square", "Haroun","Al-Ahram",
           "Koleyet El-Banat", "Stadium","Fair Zone","Abbassiya", "Abdou Pasha","El-Geish",
           "Bab El-Shaaria","Attaba","Nasser","Maspero", "Zamalek", "Kit Kat","Sudan","Imbaba",
           "El-Bohy","El-Kawmeya Al-Arabiya","Ring Road","Rod El-Farag","El-Tawfikeya",
           "Wadi El-Nil","Gamaat El Dowal Al-Arabiya","Bulaq El-Dakroor","Cairo University"));

public  byte ticket(int Count){
    if (Count >= 1 && Count <= 9) {
        this.price= 5;
    } else if (Count > 9 && Count <= 16) {
        this.price = 7;}else if (Count > 16 && Count <= 39) {
        this.price = 10;}return this.price;
}
public void route(String start,String destination){

    if (start.equalsIgnoreCase(destination)) System.out.println("enter valid destination");

    else{
        if(line1.contains(start) && line1.contains(destination))
        {
            u= (byte) line1.indexOf(start);
            v= (byte) line1.indexOf(destination);
            t=ticket(Math.max(u,v)-Math.min(u,v));
            nostation= (byte) (v-u);
            extime= (byte) (wtime*nostation);

            System.out.println("your path contains of "+(Math.max(u,v)-Math.min(u,v))+" Stations");

            if(u>v){
                List rev = new ArrayList(line1.subList(Math.min(u,v),Math.max(u,v)));
                Collections.reverse(rev);
                System.out.println("your rout is "+rev);
            }

            else System.out.println("your rout is "+line1.subList(Math.min(u,v),Math.max(u,v)));

            System.out.println("your ticket will cost: "+t+" pounds");
            System.out.println("expected time is "+extime+"m");
        }

        else if(line2.contains(start) && line2.contains(destination))
        {
            u= (byte) line2.indexOf(start);
            v= (byte) line2.indexOf(destination);
            t=ticket(Math.max(u,v)-Math.min(u,v));
            nostation= (byte) (v-u);
            extime= (byte) (wtime*nostation);

            System.out.println("your path contains of "+(Math.max(u,v)-Math.min(u,v))+" Stations");

            if(u>v){
                List rev = new ArrayList(line2.subList(Math.min(u,v),Math.max(u,v)));
                Collections.reverse(rev);
                System.out.println("your rout is "+rev);
            }

            else System.out.println("your rout is "+line2.subList(Math.min(u,v),Math.max(u,v)));

            System.out.println("your ticket will cost: "+t+" pounds");
            System.out.println("expected time is "+extime+"m");
        }

        if(line3.contains(start) && line3.contains(destination))
        {
            u= (byte) line3.indexOf(start);
            v= (byte) line3.indexOf(destination);
            t=ticket(Math.max(u,v)-Math.min(u,v));
            nostation= (byte) (v-u);
            extime= (byte) (wtime*nostation);

            System.out.println("your path contains of "+(Math.max(u,v)-Math.min(u,v))+" Stations");

            if(u>v){
                List rev = new ArrayList(line3.subList(Math.min(u,v),Math.max(u,v)));
                Collections.reverse(rev);
                System.out.println("your rout is "+rev);
            }

            else System.out.println("your rout is "+line3.subList(Math.min(u,v),Math.max(u,v)));

            System.out.println("your ticket will cost: "+t+" pounds");
            System.out.println("expected time is "+extime+"m");
        }






        else
            System.out.println("There is no Metro line connects your start with your destination.");
    }

}

}
