/********************************

* MyQueue
*
* Implementiert eine generische
* Warteschlange
********************************/

// Eine Warteschlange wird implementiert durch verschachtelte Knoten,
// wobei ein Start- und ein Endknoten existiert, wobei der next-Pointer
// des Endknoten null sein soll und der data-Wert des Startknoten irrelevant ist.
// Ausserdem soll der Endknoten durch endliches iterieren von P = P.next; mit
// dem Startknoten als Startwert erreicht werden.
public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int sizeCounter;

    //constructor, creates an empty queue
    // tail beginnt als (null,null)-Knoten, head wird auf denselben Knoten gesetzt
    // (das garantiert spaeter beim Befuellen, dass head.next das erste Element ist)
    public MyQueue () {
        tail = new Node<T>(null);
        head = tail;
        sizeCounter = 0;
    }

    //inserts item at the end of this queue
    // Ein neuer (item, null)-Knoten wird angehaengt, indem das alte tail auf jenen
    // Knoten zeigt und tail auf diesen gesetzt wird. Groesse wird um 1 erhoeht.
    public void enqueue (T item) {
        Node<T> itemnode = new Node<>(item);
        tail.next = itemnode;
        tail = itemnode;
        sizeCounter++;
    }

    //returns the first item of this queue and deletes it
    // ist die Schlange leer, so wird null zurueckgegeben, sonst:
    // Der Wert von head.next wird zurückgegeben und head auf head.next gesetzt.
    // Wenn die Schleife geleert wurde, so gilt wieder head = tail (Initialisierungszustand)
    public T dequeue () {
        if(!isEmpty()){
            T current = head.next.data;
            head = head.next;
            sizeCounter--;
            return current;
        } else {
            return null;
        }
    }

    //returns the first item of this queue without deleting
    // wenn Schlange leer ist, null, sonst head.next.data
    public T peek () {
        if(!isEmpty()){
            return head.next.data;
        } else {
            return null;
        }
    }

    //returns true if this queue contains no elements
    public boolean isEmpty() {
        return (size() == 0);
    }

    //returns the number of elements in this queue
    public int size () {
        return sizeCounter;
    }

    //returns Sting rep
    public String toString () {
        return "Queue of "+size()+" elements";
    }
}
