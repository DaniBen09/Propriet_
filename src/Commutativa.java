import java.util.Scanner;
public class Commutativa {
    public static void main(String[] args) {

        Scanner studente = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        double numero1 = studente.nextDouble();
        System.out.println("Inserisci il secondo numero:");
        double numero2 = studente.nextDouble();
        System.out.println("Inserisci il simbolo dell'operazione + o *:");
        char simbolo = studente.next().charAt(0);
        String risultato;

        if (simbolo == ('+')) {
            System.out.println("Ecco a te la proprietà commutativa: " + numero2 + " " + '+' + " " + numero1);
            studente.nextLine();
            System.out.println("Vuoi il risultato?");
            risultato = studente.nextLine();
            if (risultato.equals("Si") || risultato.equals("si") || risultato.equals("SI"))
                System.out.println("Ecco a te il risultato:");
                System.out.println(numero2 + numero1);}
        else if (simbolo == '*') {
            System.out.println("Ecco a te: "+numero2+" "+'*'+" "+numero1);
            studente.nextLine();
            System.out.println("Vuoi il risultato?");
            risultato = studente.nextLine();
            if (risultato.equals("Si") || risultato.equals("si") || risultato.equals("SI"))
                System.out.println("Ecco a te il risultato:");
                System.out.println(numero2 * numero1);}
        else {System.out.println("Non è un simbolo compatibile con la proprietà commutativa");
        }

        studente.close();
    }
}