public class Main {
    public static void main(String[] args) {

        int nombre = 5;
        long resultat = 1;
        int i = 1;
        while(i <= nombre){
            resultat= resultat*i;
            i++;
        }
        System.out.println("La factorielle de " + nombre + " est " + resultat);

    }
}