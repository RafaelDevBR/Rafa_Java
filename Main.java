import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integrate language = new Integrate();
        int opc;
        do{
            language.Menu();
            opc = input.nextInt();
            switch (opc){
                case 1:
                    language.addLinguagem();
                    break;

                case 2:
                    language.infoListLinguagem();
                    break;
                case 3:
                    language.addLinguagemRandom();
                    break;
                case 4:
                    language.infoListRandom();
                    break;
                case 5:
                default:
                    break;



            }
        }while(opc != 5);





    }


}
