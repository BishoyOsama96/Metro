package com.company;
public class ticket extends Station {
private String Start;
private String Destination;
private byte Cost=0;
private byte Count=0;
public byte TicketPrice(String Start, String Destination){
    this.Start=Start;
    this.Destination=Destination;
    for ( int i =list1.indexOf(Start); i <(list1.indexOf(Destination)) ;i++) {
    if (list1.contains(Start)&&i!=list1.indexOf(Destination)){ Count++; } }
    for (int i = list1.indexOf(Start); i > list1.indexOf(Destination); i--) {
        if (list1.contains(Start)&&i!=list1.indexOf(Destination)){ Count++; } }
    for ( int i =list2.indexOf(Start); i <(list2.indexOf(Destination)) ;i++) {
        if (list2.contains(Start)&&i!=list2.indexOf(Destination)){ Count++; } }
    for (int i = list2.indexOf(Start); i > list2.indexOf(Destination); i--) {
        if (list2.contains(Start)&&i!=list2.indexOf(Destination)){ Count++; } }
    for ( int i =list3.indexOf(Start); i <(list3.indexOf(Destination)) ;i++) {
        if (list3.contains(Start)&&i!=list3.indexOf(Destination)){ Count++; } }
    for (int i = list3.indexOf(Start); i > list3.indexOf(Destination); i--) {
        if (list3.contains(Start)&&i!=list3.indexOf(Destination)){ Count++; } }
    if (Count>=1&&Count<=9){ Cost=5; }
    else if (Count>9&&Count<=16){ Cost=7; }
    else if (Count>16&&Count<=39){ Cost=10; }
    return Cost;
}
  public ticket() {
    }
}

