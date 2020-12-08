import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args){

        //Instancia variavel que armazena a escolha do usuário
        int op;
        int qtd;

        FilaDePrioridade fila = new FilaDePrioridade();
        ArrayList<Elemento> elementos = new ArrayList<>();
        fila.heap = elementos;

        do {
            System.out.println("Informe a quantidade de operações:");
            qtd = reader.nextInt();
        } while (qtd <= 0);

        for (int i = 0; i < qtd; i++) {
            do {
                System.out.println("Digite a opção desejada e tecle Enter:\n" +
                        "#1) Heap-Max \n#2) Heap-Extract-Max");
                System.out.println("#3) Heap-Insert\n#4) Heap-Print\n#5) Sair");
                op = reader.nextInt();
            } while (op <= 0);

            selectionarOpcao(fila, op);
        }
    }

    //Responsável por realizar a chamada da função correspondente ao
    //algoritmo de ordenação selecionado pelo usuário.
    public static void selectionarOpcao(FilaDePrioridade fila, int op){
        ArrayList<Elemento> elementos = fila.heap;
        Elemento elemento;
        switch (op){
            case 1:
                System.out.println("Você escolheu Heap-Max");
                elemento = fila.HeapMax(elementos, elementos.size());
                System.out.println("id: "+ elemento.id + " prior: " + elemento.priority);
                break;

            case 2:
                System.out.println("Você escolheu Heap-Extract-Max");
                elemento = fila.HeapExtractMax(elementos,elementos.size()-1);
                System.out.println("id: "+ elemento.id + " prior: " + elemento.priority);
                break;

            case 3:
                System.out.println("Você escolheu Heap-Insert");
                elemento = opcao3();
                String resultado = fila.HeapInsert(elementos, elemento);
                System.out.println(resultado);
                break;

            case 4:
                System.out.println("Você escolheu Heap-Print");
                fila.HeapPrint(elementos);
                break;

            default:
                System.out.println("Você escolheu sair");
                break;
        }
    }

    public static Elemento opcao3(){
        System.out.println("Informe o id e a prioridade no formato: 30 2,5");
        int id = reader.nextInt();
        double prior = reader.nextDouble();
        return new Elemento(id, prior);
    }
}
