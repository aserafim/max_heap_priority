public class FilaDePrioridade {

    //fila-heap
    Elemento[] heap;
    //maxElementos
    int maxElementos;
    //qtdElementosNoHeap
    int m;

    public FilaDePrioridade(){
        this.heap = new Elemento[4000];
        this.maxElementos = 4000;
        this.m = 0;
    }

    public Elemento HeapMax(Elemento[] fila, int qtd){

        //Método para deveolver o elemento que possui a maior prioridade
        //do vetor A com qtd elementos. Se a fila estiver vazia
        //deve retornar -1 -1 0

        return fila[0];
    }

    public Elemento HeapExtractMax(Elemento[] fila, int qtd){

        //Método que remove e devolve o elemento que possui a maior
        //prioridade do vetor que possui qtd elementos
        //Se a fila estiver vazia, deve retornar -1 -1, 0

        return fila[0];
    }

    public boolean HeapInsert(Elemento[] fila, int qtd, Elemento elemento){

        //Insere o elemento no vetor fila que contem qtd elementos
        //Se a insercao for bem sucedidade, retorna T
        //do contrário retorna F
        return true;
    }

    public void HeapPrint(Elemento[] fila, int qtd){

        //Imprime o vetor fila que contém m elementos
    }

    //MÉTODOS AUXILIARES

    public void MaxHeapify(Elemento[] fila, int indice){

        //Recebe o vetor fila e o indice tal que
        //as arvores com raizes nos filhos esq e dir
        //do nó i são max-heaps. Utilizado como auxiliar
        //do metodo HeapExractMax
    }

    public void HeapIncreaseKey(Elemento[] fila, int indice, float prioridade){

        //Aumenta o valor da prioridade para prioridade do elemento
        //que está na posição indice da fila. Utilizado como auxiliar
        //do HeapInsert
    }
}
