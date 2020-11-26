package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Station s= new Station();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Start");
        String start=sc.nextLine();
        System.out.println("Enter your Destination");
        String destination = sc.nextLine();
        s.route(start,destination);
      }}
