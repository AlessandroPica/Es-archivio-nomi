import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int scelta;
    String [] nomi = new String[100];
    String nome;
    int n = 0;
    do{
      System.out.println("inserisci 1 per aggiunere un nome");
      System.out.println("inserisci 2 per rimuovere un nome");
      System.out.println("inserisci 3 per cercare un nome");
      System.out.println("inserisci 4 per visualizzare i nomi ripetuti");
      System.out.println("inserisci 5 per modificare un nome");
      System.out.println("inserisci 6 per visualizzare tutti i nomi");
      System.out.println("inserisci 7 per cercare il nome più lungo e più corto");
      System.out.println("inserisci 8 per cancellare tutte le occorrenze di un nome");
      System.out.println("inserisci 0 per uscire dal programma")
      scelta = in.nextInt();
      switch(scelta){
        case 1:
          n++;
          System.out.println("inserisci il nome da aggiungere");
          nome=in.nextLine();
          nomi[n]=nome;
        case 2:
          System.out.println("inserisci il nome da rimuovere");
          nome=in.nextLine();
          
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        default:
          System.out.println("scelta non valida");
          break;
      }
    }while(scelta!=0);
  }
  private static String [] rimuoviNome(String [] nomi, int n, String nome){
    int i;
    for(i=0;i<n;i++){
      if(nomi[i].equals(nome)){
        nomi[i]=nomi[n-1];
        n--;
      }
    }
    return nomi;
  }
}