import java.util.Map;
import java.util.TreeMap;

public class zad6{


public static void main(String[] args){

TreeMap<NrTelefoniczny,Wpis> treeMap = new TreeMap<>();

Osoba osoba1 = new Osoba("imie1", "nazwisko1", "adres1", new NrTelefoniczny(1, 11));
Osoba osoba2 = new Osoba("imie2", "nazwisko2", "adres2", new NrTelefoniczny(2, 12));
Osoba osoba3 = new Osoba("imie3", "nazwisko3", "adres3", new NrTelefoniczny(3, 13));

Firma firma1 = new Firma("nazwa1", "fAdres1", new NrTelefoniczny(4, 14));
Firma firma2 = new Firma("nazwa2", "fAdres2", new NrTelefoniczny(5, 15));
Firma firma3 = new Firma("nazwa3", "fAdres3", new NrTelefoniczny(6, 16));


treeMap.put(osoba1.getNr(), osoba1);
treeMap.put(osoba2.getNr(), osoba2);
treeMap.put(osoba3.getNr(), osoba3);
treeMap.put(firma1.getNr(), firma1);
treeMap.put(firma2.getNr(), firma2);
treeMap.put(firma3.getNr(), firma3);


for(Map.Entry<NrTelefoniczny,Wpis> entry : treeMap.entrySet())
    System.out.println(entry.getValue().opis() + "=>" + entry.getKey().toString());




}




}