public class SizeMismatchException extends Exception
{
    public SizeMismatchException(int a, int b)
    {
        super("Nie wlasciwe rozmiary. Rozmiar 1. wektora : " + a + ", rozmiar wektora 2 : " + b);
    }

}