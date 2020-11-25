package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Station {
 private byte price;
     public ArrayList<String> line1=new ArrayList<>(Arrays.asList("New El-Marg","El-Marg","Ezbet El-Nakhl","ain shams","El-Matareyya","Helmeyet El-Zaitoun","Hadayeq El-Zaitoun","Saray El-Qobba","Hammamat El-Qobba","Kobri El-Qobba",
        "Manshiet El-Sadr","El-Demerdash","ghamra","Al Shohadaa","urabi","naser","sadat","Saad Zaghloul","AlSayyeda Zeinab","El-Malek El-Saleh",
        "Mar Girgis","El-Zahraa","Dar El-Salam","Hadayeq El-Maadi","Maadi","Thakanat El-Maadi","Thakanat El-Maad","Tora El-Balad","opera"
        ,"dokki","El Behoos","Kozzika","Tora El-Asmant","Tora El-Asmant","El-Maasara","Hadayeq Helwan","Wadi Hof","Helwan University","Ain Helwan","Helwan"));

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

