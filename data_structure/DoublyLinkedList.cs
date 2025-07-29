namespace DefaultNamespace;

public class DoublyLinkedList
{
    public T data { get; set; }
    public DoublyListNode<T> Next { get; set; }
    public DoublyListNode<T> Previous { get; set; }

    public DoublyListNode(T data)
    {
        Data = data;
        Next = null;
        Previous = null;
    }
}

public class DoublyLinkedList<T>
{
    private DoublyListNode<T> head;
    private DoublyListNode<T> tail;
    private int count;

    public int Count => count;

    public void AddFirst(T data)
    {
        DoublyListNode<T> newNode = new DoublyListNode<T>(data);

        if (head == null)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.Next = head;
            head.Previous = newNode;
            head = newNode;
        }

        count++;
    }

    public void AddLast(T data)
    {
        DoublyList newNode = new DoublyListNode<T>(data);

        if (tail == null)
        {
            head = tail = newNode;
        }
        else
        {
            tail.Next = newNode;
            newNode.Previous = tail;
            tail = newNode;
        }

        count++;
    }

    public void RemoveFirst()
    {
        if (head == null) return;

        if (head == tail)
        {
            head = tail = null;
        }
        else
        {
            head = head.Next;
            head.Previous = null;
        }

        count--;
    }

    public void RemoveLast(T data)
    {
        if (head == null) return;
        
        if (head == tail)
        {
            head = tail = null;
        }
        else
        {
            tail = tail.Previos;
            tail.Next = null;
        }

        count--;
    } 

}