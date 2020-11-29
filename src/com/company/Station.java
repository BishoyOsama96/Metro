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
            "Al-Shohadaa","Masarra","Rod El-Farag","St. Teresa",
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
    // Check redundancy
    System.out.println("after we searched, we could find that  ");
    if (start.equalsIgnoreCase(destination)) System.out.println("you must enter different destination");

    // first case of select within lines
     if(line1.contains(start) && line1.contains(destination))
    {
        u= (byte) line1.indexOf(start);
        v= (byte) line1.indexOf(destination);
        t=ticket(Math.max(u,v)-Math.min(u,v));
        nostation= (byte)( Math.max(u,v)-Math.min(u,v));
        extime= (byte) (wtime*nostation);

        System.out.println("your path contains of "+nostation+" Stations");

        if(u>v){
            List rev = new ArrayList(line1.subList(Math.min(u,v),Math.max(u,v)));
            Collections.reverse(rev);
            System.out.println("your rout is "+rev);
        }

        else System.out.println("your rout is "+line1.subList(Math.min(u,v),Math.max(u,v)));

        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");
    }
     if(line2.contains(start) && line2.contains(destination))
    {
        u= (byte) line2.indexOf(start);
        v= (byte) line2.indexOf(destination);
        t=ticket(Math.max(u,v)-Math.min(u,v));
        nostation= (byte)( Math.max(u,v)-Math.min(u,v));
        extime= (byte) (wtime*nostation);

        System.out.println("your path contains of "+nostation+" Stations");

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
        nostation= (byte)( Math.max(u,v)-Math.min(u,v));
        extime= (byte) (wtime*nostation);
        System.out.println("your path contains of "+nostation+" Stations");

        if(u>v){
            List rev = new ArrayList(line3.subList(Math.min(u,v),Math.max(u,v)));
            Collections.reverse(rev);
            System.out.println("your rout is "+rev);
        }

        else System.out.println("your rout is "+line3.subList(Math.min(u,v),Math.max(u,v)));

        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");
    }

    // to check overlapping
    //Sadat ‫السادات‬ Line 1 & Line2
    //Al-Shohadaa ‫الشهداء‬ Line 1 & Line2
    // from line 1 to line 2
     if (line1.contains(start) && line2.contains(destination)){
        System.out.println("your possible paths are :");
        System.out.println("--------------------within Al-Shohadaa--------------------");
        u= (byte) line1.indexOf(start);
        v= (byte) line2.indexOf(destination);
        if(u> line1.indexOf("Al-Shohadaa")){

            List rev = new ArrayList(line1.subList(Math.min(u,line1.indexOf("Al-Shohadaa")),
                    Math.max(u,line1.indexOf("Al-Shohadaa"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 1 is  "+rev);
        }

       else{
           System.out.println("your rout in line 1 is  "+
                    line1.subList(Math.min(u,line1.indexOf("Al-Shohadaa")),
                            Math.max(u,line1.indexOf("Al-Shohadaa")))
            );
        }

        if(line2.indexOf("Al-Shohadaa")>v){
            System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line2.subList(
                    Math.min(v,line2.indexOf("Al-Shohadaa")),
                    Math.max(v,line2.indexOf("Al-Shohadaa"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  "+rev);
        }
        else{
            System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 2 is  "+
                   line2.subList(Math.min(v,line2.indexOf("Al-Shohadaa")),
                           Math.max(v,line2.indexOf("Al-Shohadaa"))
                   ));
        }


        nostation= (byte) (
                Math.max(u,line1.indexOf("Al-Shohadaa"))-Math.min(u,line1.indexOf("Al-Shohadaa"))
                + Math.max(v,line2.indexOf("Al-Shohadaa"))-Math.min(v,line2.indexOf("Al-Shohadaa"))
                          );



        t=ticket(nostation);
        extime= (byte) (wtime*nostation);
        System.out.println("your path contains of "+nostation+" Stations");
        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");
        //________________________________________________________________________________
        // print the route of El-sadat
        System.out.println("-------------------within Sadat----------------------");
        u= (byte) line1.indexOf(start);
        v= (byte) line2.indexOf(destination);
        if(u> line1.indexOf("Sadat")){

            List rev = new ArrayList(line1.subList(Math.min(u,line1.indexOf("Sadat")),
                    Math.max(u,line1.indexOf("Sadat"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 1 is  "+rev);
        }

        else{
            System.out.println("your rout in line 1 is  "+
                    line1.subList(Math.min(u,line1.indexOf("Sadat")),
                            Math.max(u,line1.indexOf("Sadat")))
            );
        }

        if(line2.indexOf("Sadat")>v){
            System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line2.subList(
                    Math.min(v,line2.indexOf("Sadat")),
                    Math.max(v,line2.indexOf("Sadat"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  "+rev);
        }
        else{
            System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 2 is  "+
                    line2.subList(Math.min(v,line2.indexOf("Sadat")),
                            Math.max(v,line2.indexOf("Sadat"))
                    ));
        }


        nostation= (byte) (
                Math.max(u,line1.indexOf("Sadat"))-Math.min(u,line1.indexOf("Sadat"))
                        + Math.max(v,line2.indexOf("Sadat"))-Math.min(v,line2.indexOf("Sadat"))
        );



        t=ticket(nostation);
        extime= (byte) (wtime*nostation);
        System.out.println("your path contains of "+nostation+" Stations");
        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");
    }
     // reverse it
    if (line2.contains(start) && line1.contains(destination)){
        System.out.println("your possible paths are :");
        System.out.println("--------------------within Al-Shohadaa--------------------");
        u= (byte) line2.indexOf(start);
        v= (byte) line1.indexOf(destination);
        if(u> line2.indexOf("Al-Shohadaa")){

            List rev = new ArrayList(line2.subList(Math.min(u,line2.indexOf("Al-Shohadaa")),
                    Math.max(u,line2.indexOf("Al-Shohadaa"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  "+rev);
        }

        else{
            System.out.println("your rout in line 2 is  "+
                    line2.subList(Math.min(u,line2.indexOf("Al-Shohadaa")),
                            Math.max(u,line2.indexOf("Al-Shohadaa")))
            );
        }

        if(line1.indexOf("Al-Shohadaa")>v){
            System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line1.subList(
                    Math.min(v,line1.indexOf("Al-Shohadaa")),
                    Math.max(v,line1.indexOf("Al-Shohadaa"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 1 is  "+rev);
        }
        else{
            System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 1 is  "+
                    line1.subList(Math.min(v,line1.indexOf("Al-Shohadaa")),
                            Math.max(v,line1.indexOf("Al-Shohadaa"))
                    ));
        }


        nostation= (byte) (
                Math.max(u,line2.indexOf("Al-Shohadaa"))-Math.min(u,line2.indexOf("Al-Shohadaa"))
                        + Math.max(v,line1.indexOf("Al-Shohadaa"))-Math.min(v,line1.indexOf("Al-Shohadaa"))
        );



        t=ticket(nostation);
        extime= (byte) (wtime*nostation);
        System.out.println("your path contains of "+nostation+" Stations");
        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");
        //________________________________________________________________________________
        // print the route of El-sadat
        System.out.println("-------------------within Sadat----------------------");
        u= (byte) line2.indexOf(start);
        v= (byte) line1.indexOf(destination);
        if(u> line2.indexOf("Sadat")){

            List rev = new ArrayList(line2.subList(Math.min(u,line2.indexOf("Sadat")),
                    Math.max(u,line2.indexOf("Sadat"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  "+rev);
        }

        else{
            System.out.println("your rout in line 2 is  "+
                    line2.subList(Math.min(u,line2.indexOf("Sadat")),
                            Math.max(u,line2.indexOf("Sadat")))
            );
        }

        if(line1.indexOf("Sadat")>v){
          //  System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line1.subList(
                    Math.min(v,line1.indexOf("Sadat")),
                    Math.max(v,line1.indexOf("Sadat"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 1 is  "+rev);
        }
        else{
           // System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 1 is  "+
                    line1.subList(Math.min(v,line1.indexOf("Sadat")),
                            Math.max(v,line1.indexOf("Sadat"))
                    ));
        }


        nostation= (byte) (
                Math.max(u,line2.indexOf("Sadat"))-Math.min(u,line2.indexOf("Sadat"))
                        + Math.max(v,line1.indexOf("Sadat"))-Math.min(v,line1.indexOf("Sadat"))
        );



        t=ticket(nostation);
        extime= (byte) (wtime*nostation);
        System.out.println("your path contains of "+nostation+" Stations");
        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");
    }

    //Nasser ‫عبدالناصر‬ ‫جمال‬ Line 1 & Line3
    if (line1.contains(start) && line3.contains(destination)){
        System.out.println("your possible paths are :");
        System.out.println("--------------------within Nasser--------------------");
        u= (byte) line1.indexOf(start);
        v= (byte) line3.indexOf(destination);
        if(u> line1.indexOf("Nasser")){

            List rev = new ArrayList(line1.subList(Math.min(u,line1.indexOf("Nasser")),
                    Math.max(u,line1.indexOf("Nasser"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 1 is  "+rev);
        }

        else{
            System.out.println("your rout in line 1 is  "+
                    line1.subList(Math.min(u,line1.indexOf("Nasser")),
                            Math.max(u,line1.indexOf("Nasser")))
            );
        }

        if(line3.indexOf("Nasser")>v){
            //System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line3.subList(
                    Math.min(v,line3.indexOf("Nasser")),
                    Math.max(v,line3.indexOf("Nasser"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 3 is  "+rev);
        }
        else{
            //System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 3 is  "+
                    line3.subList(Math.min(v,line3.indexOf("Nasser")),
                            Math.max(v,line3.indexOf("Nasser"))
                    ));
        }


        nostation= (byte) (
                Math.max(u,line1.indexOf("Nasser"))-Math.min(u,line1.indexOf("Nasser"))
                        + Math.max(v,line3.indexOf("Nasser"))-Math.min(v,line3.indexOf("Nasser"))
        );



        t=ticket(nostation);
        extime= (byte) (wtime*nostation);
        System.out.println("your path contains of "+nostation+" Stations");
        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");

    }
     // reverse
    if (line3.contains(start) && line1.contains(destination)){
        System.out.println("your possible paths are :");
        System.out.println("--------------------within Nasser--------------------");
        u= (byte) line3.indexOf(start);
        v= (byte) line1.indexOf(destination);
        if(u> line3.indexOf("Nasser")){

            List rev = new ArrayList(line3.subList(Math.min(u,line3.indexOf("Nasser")),
                    Math.max(u,line3.indexOf("Nasser"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 3 is  "+rev);
        }

        else{
            System.out.println("your rout in line 3 is  "+
                    line3.subList(Math.min(u,line3.indexOf("Nasser")),
                            Math.max(u,line3.indexOf("Nasser")))
            );
        }

        if(line1.indexOf("Nasser")>v){
            //System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line1.subList(
                    Math.min(v,line1.indexOf("Nasser")),
                    Math.max(v,line1.indexOf("Nasser"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 1 is  "+rev);
        }
        else{
            //System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 1 is  "+
                    line1.subList(Math.min(v,line1.indexOf("Nasser")),
                            Math.max(v,line1.indexOf("Nasser"))
                    ));
        }


        nostation= (byte) (
                Math.max(u,line3.indexOf("Nasser"))-Math.min(u,line3.indexOf("Nasser"))
                        + Math.max(v,line1.indexOf("Nasser"))-Math.min(v,line1.indexOf("Nasser"))
        );



        t=ticket(nostation);
        extime= (byte) (wtime*nostation);
        System.out.println("your path contains of "+nostation+" Stations");
        System.out.println("your ticket will cost: "+t+" pounds");
        System.out.println("expected time is "+extime+"m");

    }
/*

Attaba ‫العتبة‬ Line 2 & Line3
Cairo University ‫القاهرة‬ ‫جامعة‬ Line 2 & Line 3
 */
    if (line2.contains(start) && line3.contains(destination)) {
        System.out.println("your possible paths are :");
        u = (byte) line2.indexOf(start);
        v = (byte) line3.indexOf(destination);
        System.out.println("--------------------within Attaba--------------------");
        if (u > line2.indexOf("Attaba")) {

            List rev = new ArrayList(line2.subList(Math.min(u, line2.indexOf("Attaba")),
                    Math.max(u, line2.indexOf("Attaba"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  " + rev);
        } else {
            System.out.println("your rout in line 2 is  " +
                    line2.subList(Math.min(u, line2.indexOf("Attaba")),
                            Math.max(u, line2.indexOf("Attaba")))
            );
        }

        if (line3.indexOf("Attaba") > v) {
            //System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line3.subList(
                    Math.min(v, line3.indexOf("Attaba")),
                    Math.max(v, line3.indexOf("Attaba"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 3 is  " + rev);
        } else {
            //  System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 3 is  " +
                    line3.subList(Math.min(v, line3.indexOf("Attaba")),
                            Math.max(v, line3.indexOf("Attaba"))
                    ));
        }


        nostation = (byte) (
                Math.max(u, line2.indexOf("Attaba")) - Math.min(u, line2.indexOf("Attaba"))
                        + Math.max(v, line3.indexOf("Attaba")) - Math.min(v, line3.indexOf("Attaba"))
        );


        t = ticket(nostation);
        extime = (byte) (wtime * nostation);
        System.out.println("your path contains of " + nostation + " Stations");
        System.out.println("your ticket will cost: " + t + " pounds");
        System.out.println("expected time is " + extime + "m");
        //________________________________________________________________________________
        // print the route of El-sadat
        System.out.println("-------------------within Cairo University----------------------");
        if (u > line2.indexOf("Cairo University")) {

            List rev = new ArrayList(line2.subList(Math.min(u, line2.indexOf("Cairo University")),
                    Math.max(u, line2.indexOf("Cairo University"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  " + rev);
        } else {
            System.out.println("your rout in line 2 is  " +
                    line2.subList(Math.min(u, line2.indexOf("Cairo University")),
                            Math.max(u, line2.indexOf("Cairo University")))
            );
        }

        if (line3.indexOf("Cairo University") > v) {
            //System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line3.subList(
                    Math.min(v, line3.indexOf("Cairo University")),
                    Math.max(v, line3.indexOf("Cairo University"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 3 is  " + rev);
        } else {
            //  System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 3 is  " +
                    line3.subList(Math.min(v, line3.indexOf("Cairo University")),
                            Math.max(v, line3.indexOf("Cairo University"))
                    ));
        }


        nostation = (byte) (
                Math.max(u, line2.indexOf("Cairo University")) - Math.min(u, line2.indexOf("Cairo University"))
                        + Math.max(v, line3.indexOf("Cairo University")) - Math.min(v, line3.indexOf("Cairo University"))
        );


        t = ticket(nostation);
        extime = (byte) (wtime * nostation);
        System.out.println("your path contains of " + nostation + " Stations");
        System.out.println("your ticket will cost: " + t + " pounds");
        System.out.println("expected time is " + extime + "m");







    }
    // reverse
    if (line3.contains(start) && line2.contains(destination)) {
        System.out.println("your possible paths are :");
        u = (byte) line3.indexOf(start);
        v = (byte) line2.indexOf(destination);
        System.out.println("--------------------within Attaba--------------------");
        if (u > line3.indexOf("Attaba")) {

            List rev = new ArrayList(line3.subList(Math.min(u, line3.indexOf("Attaba")),
                    Math.max(u, line3.indexOf("Attaba"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 3 is  " + rev);
        } else {
            System.out.println("your rout in line 3 is  " +
                    line3.subList(Math.min(u, line3.indexOf("Attaba")),
                            Math.max(u, line3.indexOf("Attaba")))
            );
        }

        if (line2.indexOf("Attaba") > v) {
            //System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line2.subList(
                    Math.min(v, line2.indexOf("Attaba")),
                    Math.max(v, line2.indexOf("Attaba"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  " + rev);
        } else {
            //  System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 2 is  " +
                    line2.subList(Math.min(v, line2.indexOf("Attaba")),
                            Math.max(v, line2.indexOf("Attaba"))
                    ));
        }


        nostation = (byte) (
                Math.max(u, line3.indexOf("Attaba")) - Math.min(u, line3.indexOf("Attaba"))
                        + Math.max(v, line2.indexOf("Attaba")) - Math.min(v, line2.indexOf("Attaba"))
        );


        t = ticket(nostation);
        extime = (byte) (wtime * nostation);
        System.out.println("your path contains of " + nostation + " Stations");
        System.out.println("your ticket will cost: " + t + " pounds");
        System.out.println("expected time is " + extime + "m");
        //________________________________________________________________________________
        // print the route of El-sadat
        System.out.println("-------------------within Cairo University----------------------");
        if (u > line3.indexOf("Cairo University")) {

            List rev = new ArrayList(line3.subList(Math.min(u, line3.indexOf("Cairo University")),
                    Math.max(u, line3.indexOf("Cairo University"))));

            Collections.reverse(rev);
            System.out.println("your rout in line 3 is  " + rev);
        } else {
            System.out.println("your rout in line 3 is  " +
                    line3.subList(Math.min(u, line3.indexOf("Cairo University")),
                            Math.max(u, line3.indexOf("Cairo University")))
            );
        }

        if (line2.indexOf("Cairo University") > v) {
            //System.out.println("you should walk in the direction of Shubra El-Kheima");
            List rev = new ArrayList(line2.subList(
                    Math.min(v, line2.indexOf("Cairo University")),
                    Math.max(v, line2.indexOf("Cairo University"))
            ));

            Collections.reverse(rev);
            System.out.println("your rout in line 2 is  " + rev);
        } else {
            //  System.out.println("you should walk in the direction of El-Mounib");
            System.out.println("your route in line 2 is  " +
                    line2.subList(Math.min(v, line2.indexOf("Cairo University")),
                            Math.max(v, line2.indexOf("Cairo University"))
                    ));
        }


        nostation = (byte) (
                Math.max(u, line3.indexOf("Cairo University")) - Math.min(u, line3.indexOf("Cairo University"))
                        + Math.max(v, line2.indexOf("Cairo University")) - Math.min(v, line2.indexOf("Cairo University"))
        );


        t = ticket(nostation);
        extime = (byte) (wtime * nostation);
        System.out.println("your path contains of " + nostation + " Stations");
        System.out.println("your ticket will cost: " + t + " pounds");
        System.out.println("expected time is " + extime + "m");







    }


    // no more selections







    else
        System.out.println("There is no Metro line connects your start with your destination.");






}

}

