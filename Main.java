import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("1.pole prostokąta\n2.suma pól kół\n3.pole trojkąta\n4.iloraz");
    int sterowanie;
    float liczba1,liczba2,odpowiedz;
    double wynik1,wynik2,wynik3;
    Scanner sc = new Scanner(System.in);
    sterowanie = sc.nextInt();
    switch(sterowanie)
      {
        case 1:
          {
            System.out.println("Podaj a oraz b :");
              liczba1 = sc.nextFloat();
              liczba2 = sc.nextFloat();
            odpowiedz = liczba1 * liczba2;
            System.out.println("Pole ="+odpowiedz);
            
          }
          case 2:
          {
            System.out.println("Podaj R1 oraz R2 :");
              liczba1 = sc.nextFloat();
              liczba2 = sc.nextFloat();
            wynik1 = (liczba1 * liczba1* 3.14);
            wynik2 =(liczba2*liczba2 * 3.14);
            wynik3 = wynik1+wynik2;
            System.out.println("Pole ="+ wynik3);
            
          }
          case 3:
          {
            System.out.println("Podaj a oraz h :");
              liczba1 = sc.nextFloat();
              liczba2 = sc.nextFloat();
            odpowiedz = (liczba1 * liczba2)/2;
            System.out.println("Pole ="+odpowiedz);
            
          }
          case 4:
          {
            System.out.println("Podaj a oraz b :");
              liczba1 = sc.nextFloat();
              liczba2 = sc.nextFloat();
            if(liczba2 == 0){System.out.println("nie mozna dzielic przez 0");break;}
            odpowiedz = (liczba1 / liczba2);
            System.out.println("a/b ="+odpowiedz);
            
          }
      }
    
  }
}