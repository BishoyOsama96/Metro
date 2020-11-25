package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Station st=new Station();
        int u, v,nostation,extime,wtime=4;
        byte t = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Start");
        String start=sc.nextLine();
        System.out.println("Enter your Destination");
        String destination = sc.nextLine();
        if(st.line1.contains(start) && st.line1.contains(destination))
        {
            u=st.line1.indexOf(start);
            v=st.line1.indexOf(destination);
            t=st.ticket(Math.max(u,v)-Math.min(u,v));
            nostation=v-u;
            extime=wtime*nostation;
            System.out.println("your path contains of "+(Math.max(u,v)-Math.min(u,v))+" Stations");
            System.out.println("your rout is "+st.line1.subList(Math.min(u,v),Math.max(u,v+1)));
            System.out.println("your ticket will cost: "+t+" pounds");
            System.out.println("expected time is "+extime+"m");
        }
        else if(st.line2.contains(start) && st.line2.contains(destination)){
        u=st.line2.indexOf(start);
        v=st.line2.indexOf(destination);
            t=st.ticket(Math.max(u,v)-Math.min(u,v));
            nostation=v-u;
            extime=wtime*nostation;
        System.out.println("your path contains of "+(Math.max(u,v)-Math.min(u,v))+" Stations");
        System.out.println("your rout is "+st.line2.subList(Math.min(u,v),Math.max(u,v+1)));
            System.out.println("your ticket will cost: "+t+" pounds");
            System.out.println("expected time is "+extime+"m");
    }
    else if(st.line3.contains(start) && st.line3.contains(destination)){
            u=st.line3.indexOf(start);
            v=st.line3.indexOf(destination);
            t=st.ticket(Math.max(u,v)-Math.min(u,v));
            nostation=v-u;
            extime=wtime*nostation;
            System.out.println("your path contains of "+(Math.max(u,v)-Math.min(u,v))+" Stations");
            System.out.println("your rout is "+st.line3.subList(Math.min(u,v),Math.max(u,v+1)));
            System.out.println("your ticket will cost: "+t+" pounds");
            System.out.println("expected time is "+extime+"m");
        }
    else
            System.out.println("There is no Metro line connects your start with your destination.");
}}
