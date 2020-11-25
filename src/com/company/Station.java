package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Station {
 private byte price;
     public ArrayList<String> line1=new ArrayList<>(Arrays.asList("Helwan","Ain Helwan","Helwan University",
            "Wadi Hof","Hadayek Helwan","El-Maasara","Tora El-Asmant",
            "Kozzika","Tora El-Balad","Sakanat El-Maadi","Maadi","Hadayek El-Maadi",
            "Dar El-Salam","El-Zahraa","Mar Girgis","El-Malek El-Saleh","Al-Sayeda Zeinab",
            "Saad Zaghloul","Sadat","Nasser","Orabi","Al-Shohadaa","Ghamra","El-Demerdash",
            "Manshiet El-Sadr","Kobri El-Qobba","Hammamat El-Qobba","Saray El-Qobba",
            "Hadayeq El-Zaitoun","Helmeyet El-Zaitoun","El-Matareyya","Ain Shams",
            "Ezbet El-Nakhl","El-Marg","New El-Marg"));

    public ArrayList<String> line2=new ArrayList<>(Arrays.asList( "El-Mounib","Sakiat Mekky"," Omm El-Masryeen","Giza","Faisal","Cairo University "
            ,"El Bohoth","Dokki","Opera","Sadat","Mohamed Naguib","Attaba",
            "Al Shohadaa","Masarra","Rod El-Farag","St. Teresa","Khalafawy","Mezallat",
            "Kolleyyet El-Zeraa","Shubra El-Kheima"
    ));

   public ArrayList<String> line3=new ArrayList<>(Arrays.asList("Airport","Ahmed Galal","Adly Mansour","El Haykestep","Omar Ibn El-Khattab",
            "Qobaa","Hesham Barakat","El-Nozha","Nadi El-Shams","Alf Maskan","Heliopolis Square",
            "Haroun","Al-Ahram","Koleyet El-Banat","Stadium","Fair Zone","Abbassiya",
            "Abdou Pasha","El-Geish","Bab El-Shaaria","Attaba","Nasser","Maspero","Zamalek",
            "Kit Kat","Sudan","Imbaba","El-Bohy","El-Kawmeya Al-Arabiya","Ring Road","Rod El-Farag",
            "El-Tawfikeya","Wadi El-Nil","Gamaat El Dowal Al-Arabiya","Bulaq El-Dakroor","Cairo University"
    ));
public  byte ticket(int Count){


    if (Count >= 1 && Count <= 9) {
        this.price= 5;
    } else if (Count > 9 && Count <= 16) {
        this.price = 7;
    } else if (Count > 16 && Count <= 39) {
        this.price = 10;
    }

    return this.price;
}
}

