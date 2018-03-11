public class Firma extends Wpis{

    String nazwa;
    String adres;
    NrTelefoniczny nr;

    Firma(String nazwa, String adres, NrTelefoniczny nr){
        this.nazwa = nazwa;
        this.adres = adres;
        this.nr = nr;
    }

    public NrTelefoniczny getNr() {
        return nr;
    }

    @Override
    String opis() {
        return nazwa + " " + adres + " " + nr;    
    }




}