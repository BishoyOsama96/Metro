package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int u, v;
        byte t ;
        ticket ticket=new ticket();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Start");
        String start=sc.nextLine();
        System.out.println("Enter your Destination");
        String destination = sc.nextLine();
        if(Station.list1.contains(start) && Station.list1.contains(destination))
        {
            u=Station.list1.indexOf(start);
            v=Station.list1.indexOf(destination);
            t=ticket.TicketPrice(start,destination);
            System.out.println("your path contains of "+(Math.max(u+1,v+1)-Math.min(u,v))+" Stations");
            System.out.println("your rout is "+Station.list1.subList(Math.min(u,v),Math.max(u+1,v+1)));
            System.out.println("your ticket will cost: "+t+" pounds");

        }

        else if(Station.list2.contains(start) && Station.list2.contains(destination)){
        u=Station.list2.indexOf(start);
        v=Station.list2.indexOf(destination);
        t=ticket.TicketPrice(start,destination);
        System.out.println("your path contains of "+(Math.max(u+1,v+1)-Math.min(u,v))+" Stations");
        System.out.println("your rout is "+Station.list2.subList(Math.min(u,v),Math.max(u+1,v+1)));
            System.out.println("your ticket will cost: "+t+" pounds");

    }
    else if(Station.list3.contains(start) && Station.list3.contains(destination)){
            u=Station.list3.indexOf(start);
            v=Station.list3.indexOf(destination);
            t=ticket.TicketPrice(start,destination);
            System.out.println("your path contains of "+(Math.max(u+1,v+1)-Math.min(u,v))+" Stations");
            System.out.println("your rout is "+Station.list3.subList(Math.min(u,v),Math.max(u+1,v+1)));
            System.out.println("your ticket will cost: "+t+" pounds");
        }
    else
            System.out.println("There is no Metro line connects your start with your destination.");
    
}

}
