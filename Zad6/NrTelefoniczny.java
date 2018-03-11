public class NrTelefoniczny implements Comparable<NrTelefoniczny>
{
    Integer nrTelefonu;
    Integer nrKierunkowy;

    public NrTelefoniczny(int nrTelefonu, int nrKierunkowy)
    {
        this.nrTelefonu = nrTelefonu;
        this.nrKierunkowy = nrKierunkowy;
    }


    @Override
    public int compareTo(NrTelefoniczny n) {
        if(this.nrKierunkowy.equals(n.nrKierunkowy)){
            if(this.nrTelefonu < n.nrTelefonu)
                return -1;
            if(this.nrTelefonu > n.nrTelefonu)
                return 1;
            else   
                return 0;
        }
        else if(this.nrKierunkowy > n.nrKierunkowy)
                return 1;
        else
            return -1;
        
    }


    @Override
    public String toString() {
        return "+" + nrKierunkowy.toString() + " " +  nrTelefonu.toString();
    }

}