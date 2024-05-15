import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public class Integrate {
    private String nome;
    private String stop;

    private List<String> Temas = new ArrayList<>();
    private List<String> listRandom = new ArrayList<>();


    private Scanner input = new Scanner(System.in);
    private Random random = new Random();
    public Integrate(){
        this.nome = nome;
        this.stop = stop;

    }
    public void Menu(){
        System.out.println("Menu:");
        System.out.println("[1] Adicionar uma Linguagem de programação.");
        System.out.println("[2] Listar sua lista");
        System.out.println("[3] Para escolher uma linguagem da lista Aleatóriamente");
        System.out.println("[4] Listar a Lista escolhida pelo computador");


    }
    public void addLinguagem(){
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
    }
    public void infoListLinguagem(){
        System.out.println("Lista:");
        int count = 0;
        for (String elemento : Temas) {
            count += 1;
            System.out.println("Item:" + count + " Linguagem " + elemento);
        }
    }
    public void addLinguagemRandom(){

        for (int i = 0; i < 2; i++) {

            int indiceAleatorio = random.nextInt(Temas.size());
            String itemAleatorio = Temas.get(indiceAleatorio);
            listRandom.add(itemAleatorio);


        }

    }
    public void infoListRandom(){
        System.out.println("Lista de temas escolhidas pelo computador:");
        for (String item : listRandom) {
            System.out.println(item);
        }

    }

    public void searchLanguageIntolistRandom(){
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
