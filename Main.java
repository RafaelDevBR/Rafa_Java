import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
        String nome;
        String stop;


        List<String> Temas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String textPython = "Python é uma linguagem Simples para ser aprendida";

        while (true) {
            System.out.println("Item: ");
            nome = input.next();
            Temas.add(nome);
            System.out.println("Deseja Sair: ");

            stop = input.next();

            if (stop.equalsIgnoreCase("sair")) {
                break;

            }


        }
        System.out.println("Lista:");
        int count = 0;
        for (String elemento : Temas) {
            count += 1;
            System.out.println("Item:" + count + " Linguagem " + elemento);
        }
        List<String> listRandom = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            int indiceAleatorio = random.nextInt(Temas.size());
            String itemAleatorio = Temas.get(indiceAleatorio);
            listRandom.add(itemAleatorio);


        }
        System.out.println("Lista de temas escolhidas pelo computador:");
        for (String item : listRandom) {
            System.out.println(item);
        }
        String temaEscolhido;

        try {
            boolean encontrado;
            for (int i = 0; i < 5; i++) {
                encontrado = false;
                temaEscolhido = input.next();
                for (String item : listRandom) {
                    if (item.equals(temaEscolhido)) {
                        encontrado = true;
                        System.out.println("O tema escolhido da Lista Aleatoria é: " + temaEscolhido);
                        break;
                    }
                }
                if (!encontrado) {
                    throw new Exception("O item não está na lista");
                }
                Map<String, List<String>> mapa = new HashMap<>();
                String textForItem = "Voce escolheu esse";
                addItem(mapa,temaEscolhido,textForItem);
                for(String chave : mapa.keySet()){
                    System.out.println("Chave: " + chave);
                    List<String> valores = mapa.get(chave);

                    for(String valor : valores){
                        if(chave.equals("Python")){
                            valor = "Python é uma linguagem onde parece que voce esta falando ingles com o computador";
                            System.out.println("Valor: " + valor);
                        }
                        if(chave.equals("Php")){
                            valor = "Php é uma linguagem web ";
                            System.out.println("Valor: " + valor);
                        }
                        if(chave.equals("Css")){
                            valor = "Css é uma linguagem de estilo";
                            System.out.println("Valor: " + valor);
                        }
                        if(chave.equals("Java")){
                            valor = "Java é uma linguagem bem construida em Orientação  a Objeto";
                            System.out.println("Valor: " + valor);
                        }

                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void addItem(Map<String, List<String>> mapa, String chave, String valor) {
        if (!mapa.containsKey(chave)) {
            mapa.put(chave, new ArrayList<>());
        }
        mapa.get(chave).add(valor);
    }
}
