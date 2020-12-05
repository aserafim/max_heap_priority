import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        //Instancia variavel que armazena a escolha do usuário
        int op = 2;

        //Cria fila com 4000 elementos
        FilaDePrioridade fila = new FilaDePrioridade();

        /*Elemento[] elementos = new Elemento[4000];
        elementos[0] = new Elemento(1,8.0);
        elementos[1] = new Elemento(1,18.0);
        elementos[2] = new Elemento(1,14.0);
        elementos[3] = new Elemento(1,17.0);
        elementos[4] = new Elemento(1,12.0);
        elementos[5] = new Elemento(1,13.0);
        elementos[6] = new Elemento(1,11.0);
        elementos[7] = new Elemento(1,15.0);
        elementos[8] = new Elemento(1,16.0);
         */

        ArrayList<Elemento> elementos = new ArrayList<>();
//        elementos.add(new Elemento(1,8.0));
//        elementos.add(new Elemento(1,18.0));
//        elementos.add(new Elemento(1,14.0));
//        elementos.add(new Elemento(1,17.0));
//        elementos.add(new Elemento(1,12.0));
//        elementos.add(new Elemento(1,13.0));
//        elementos.add(new Elemento(1,11.0));
//        elementos.add(new Elemento(1,15.0));
//        elementos.add(new Elemento(1,16.0));

        elementos.add(new Elemento(1,100.0));
        elementos.add(new Elemento(1,50.0));
        elementos.add(new Elemento(1,20.0));
        elementos.add(new Elemento(1,1.0));
        elementos.add(new Elemento(1,3.0));
        elementos.add(new Elemento(1,10.0));
        elementos.add(new Elemento(1,5.0));

        fila.heap = elementos;

        /*do {
            System.out.println("Digite a opção desejada e tecle Enter:\n" +
                    "#1) Heap-Max \n#2) Heap-Extract-Max");
            System.out.println("#3) Heap-Insert\n#4) Heap-Print\n#5) Sair");
            op = reader.nextInt();
        } while (op <= 0);*/

        selectionarOpcao(fila, op);

    }

    //Responsável por realizar a chamada da função correspondente ao
    //algoritmo de ordenação selecionado pelo usuário.
    public static void selectionarOpcao(FilaDePrioridade fila, int op){
        ArrayList<Elemento> elementos = fila.heap;
        switch (op){
            case 1:
                System.out.println("Você escolheu Heap-Max");
                break;

            case 2:
                System.out.println("Você escolheu Heap-Extract-Max");
                fila.HeapExtractMax(elementos,elementos.size()-1);
                break;

            case 3:
                System.out.println("Você escolheu Heap-Insert");
                break;

            case 4:
                System.out.println("Você escolheu Heap-Print");
                break;

            case 5:
                System.out.println("Você escolheu MaxHeapify");
                fila.MaxHeapify(elementos,0);
                break;

            default:
                System.out.println("Você escolheu sair");
                break;
        }
    }
}
