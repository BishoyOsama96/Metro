package com.company;
public class ticket extends Station {
private String Start;
private String Destination;
private byte Cost=0;
private byte Count=0;
public byte TicketPrice(String Start, String Destination){
    this.Start=Start;
    this.Destination=Destination;
    for ( int i =line1.indexOf(Start); i <(line1.indexOf(Destination)) ;i++) {
    if (line1.contains(Start)&&i!=line1.indexOf(Destination)){ Count++; } }
    for (int i = line1.indexOf(Start); i > line1.indexOf(Destination); i--) {
        if (line1.contains(Start)&&i!=line1.indexOf(Destination)){ Count++; } }
    for ( int i =line2.indexOf(Start); i <(line2.indexOf(Destination)) ;i++) {
        if (line2.contains(Start)&&i!=line2.indexOf(Destination)){ Count++; } }
    for (int i = line2.indexOf(Start); i > line2.indexOf(Destination); i--) {
        if (line2.contains(Start)&&i!=line2.indexOf(Destination)){ Count++; } }
    for ( int i =line3.indexOf(Start); i <(line3.indexOf(Destination)) ;i++) {
        if (line3.contains(Start)&&i!=line3.indexOf(Destination)){ Count++; } }
    for (int i = line3.indexOf(Start); i > line3.indexOf(Destination); i--) {
        if (line3.contains(Start)&&i!=line3.indexOf(Destination)){ Count++; } }
    if (Count>=1&&Count<=9){ Cost=5; }
    else if (Count>9&&Count<=16){ Cost=7; }
    else if (Count>16&&Count<=39){ Cost=10; }
    return Cost;
}
  public ticket() {
    }
}

