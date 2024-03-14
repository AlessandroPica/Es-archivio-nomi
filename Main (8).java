import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int scelta;
    String [] nomi = new String[100];
    String nome;
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
          System.out.println("inserisci il nome da aggiungere");
          nome=in.nextLine();
          
        case 2:
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
private static String aggiuntaNome(String[] nomi, String nome){
  for(int i=0; i<nomi.length; i++){
    if(nomi[i]==null){
      nomi[i]=nome;
      return nome;
    }
  }
  return null;
}
}