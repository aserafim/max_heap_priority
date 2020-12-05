import java.util.ArrayList;

public class




FilaDePrioridade {

    //fila-heap
    ArrayList<Elemento> heap;
    //maxElementos
    int maxElementos;
    //qtdElementosNoHeap
    int m;

    public FilaDePrioridade(){
        this.heap = new ArrayList<>();
        this.maxElementos = 4000;
        this.m = 0;
    }

    public Elemento HeapMax(Elemento[] fila, int qtd){

        //Método para devolver o elemento que possui a maior prioridade
        //do vetor A com qtd elementos. Se a fila estiver vazia
        //deve retornar -1 -1 0

        return fila[0];
    }

    public Elemento HeapExtractMax(ArrayList<Elemento> elementos, int qtd){
        //Método que remove e devolve o elemento que possui a maior
        //prioridade do vetor que possui qtd elementos
        //Se a fila estiver vazia, deve retornar -1 -1, 0
        if(isEmpty()){
           return new Elemento(-1,-1.0);
        }
        Elemento removido = elementos.get(0);
        elementos.set(0, elementos.get(qtd));
        elementos.remove(qtd);
        MaxHeapify(elementos,0);
        return removido;
    }

    public boolean HeapInsert(Elemento[] fila, int m, Elemento elemento){

        //Insere o elemento no vetor fila que contem qtd elementos
        //Se a insercao for bem sucedidade, retorna T
        //do contrário retorna F
        fila[m] = elemento;


        return true;
    }

    public void HeapPrint(Elemento[] fila, int qtd){

        //Imprime o vetor fila que contém m elementos
    }

    //MÉTODOS AUXILIARES

    public void MaxHeapify(ArrayList<Elemento> elementos, int i){
        //Recebe o vetor fila e o indice tal que
        //as arvores com raizes nos filhos esq e dir
        //do nó i são max-heaps. Utilizado como auxiliar
        //do metodo HeapExractMax
        int size = elementos.size();
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && elementos.get(l).priority > elementos.get(largest).priority)
            largest = l;
        if (r < size && elementos.get(r).priority > elementos.get(largest).priority)
            largest = r;

        if (largest != i) {
            Elemento temp = elementos.get(largest);
            elementos.set(largest, elementos.get(i));
            elementos.set(i, temp);

            MaxHeapify(elementos, largest);
        } else {

        }
    }

    public void HeapIncreaseKey(Elemento[] fila, int indice, float prioridade){

        //Aumenta o valor da prioridade para prioridade do elemento
        //que está na posição indice da fila. Utilizado como auxiliar
        //do HeapInsert
    }

    //is heap empty?
    public boolean isEmpty(){
        return heap.isEmpty();
    }
}
