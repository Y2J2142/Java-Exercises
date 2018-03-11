public class Osoba extends Wpis{

String imie;
String nazwisko;
String adres;
NrTelefoniczny nr;


    public Osoba(String imie, String nazwisko, String adres, NrTelefoniczny nr)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nr = nr;
        
    }
public NrTelefoniczny getNr() {
    return nr;
}



@Override
String opis() {
    return imie + " " + nazwisko + " " + adres + " " + nr;
}


}