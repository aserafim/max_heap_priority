import java.util.ArrayList;

public class FilaDePrioridade {

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

    public Elemento HeapMax(ArrayList<Elemento> elementos, int qtd){

        //Método para devolver o elemento que possui a maior prioridade
        //do vetor A com qtd elementos. Se a fila estiver vazia
        //deve retornar -1 -1 0
        if (elementos.isEmpty()){
            return new Elemento(-1,-1.0);
        }

        return elementos.get(0);
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

    public String  HeapInsert(ArrayList<Elemento> elementos, Elemento elemento){
        //Insere o elemento no vetor fila que contem qtd elementos
        //Se a insercao for bem sucedidade, retorna T
        //do contrário retorna F
        elementos.add(elemento);
        m = elementos.size();
        return HeapIncreaseKey(elementos, m - 1, elemento);
    }

    public void HeapPrint(ArrayList<Elemento> elementos){
        //Imprime o vetor fila que contém m elementos
        for (int i = 0; i < elementos.size(); i++) {
            Elemento elemento = elementos.get(i);
            System.out.println("id: "+ elemento.id + " prior: " + elemento.priority);
        }
    }

    //MÉTODOS AUXILIARES

    public void MaxHeapify(ArrayList<Elemento> elementos, int i){
        //Recebe o vetor fila e o indice tal que
        //as arvores com raizes nos filhos esq e dir
        //do nó i são max-heaps. Utilizado como auxiliar
        //do metodo HeapExtractMax
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
        }
    }

    public String HeapIncreaseKey(ArrayList<Elemento> fila, int i, Elemento elemento){

        //Aumenta o valor da prioridade para prioridade do elemento
        //que está na posição indice da fila. Utilizado como auxiliar
        //do HeapInsert
        if(elemento.priority < fila.get(i).priority){
            System.out.println("a nova chave é menor que a chave atual");
            return "F";
        }

        fila.set(i, elemento);
        int parent = (i + 1) / 2 - 1;
        while(i > 0 && fila.get(parent).priority < fila.get(i).priority){
            Elemento temp = fila.get(parent);
            fila.set(parent, fila.get(i));
            fila.set(i, temp);
            i = parent;
            parent = (i + 1) / 2 - 1;
        }

        return "T";

    }

    //is heap empty?
    public boolean isEmpty(){
        return heap.isEmpty();
    }
}
