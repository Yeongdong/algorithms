namespace DefaultNamespace;

public class ListNode<T>
{
    public T Data {get; set;}
    public ListNode<T> Next { get; set; }

    public ListNode(T data)
    {
        Data = data;
        Next = null;
    }
}

public class SimpleLinkedList<T>
{
    private ListNode<T> head;
    private int count;
    
    public int Count => count;
    public bool IsEmpty => head == null;

    public SimpleLinkedList()
    {
        head = null;
        count = 0;
    }
    
    // 첫 번째 위치에 삽입 - O(1)
    public void AddFirst(T data)
    {
        ListNode<T> newNode = new ListNode<T>(data);
        newNode.Next = head;
        head = newNode;
        count++;
    }
    
    // 마지막 위치에 삽입 - O(n)
    public void AddLast(T data)
    {
        ListNode<T> newNode = new ListNode<T>(data);

        if (head == null)
        {
            head = newNode;
        }
        else
        {
            ListNode<T> current = head;
            while (current.Next != null)
            {
                current = current.Next;
            }

            current.Next = newNode;
        }

        count++;
    }

    // 특정 값을 가진 첫 번째 노드 제거 - O(n)
    public bool Remove(T data)
    {
        if (head == null) return false;

        if (head.Data.Equals(data))
        {
            head = head.Next;
            count--;
            return true;
        }

        ListNode<T> current = head;
        while (current.Next != null)
        {
            if (current.Next.Data.Equals(data))
            {
                current.Next = current.Next.Next;
                count--;
                return true;
            }
            current = current.Next
        }

        return false;
    }
    
    // 값 검색 - O(n)
    public bool Contains(T data)
    {
        ListNode<T> current = head;
        while (current != null)
        {
            if (current.Data.Equals(data))
                return true;
            current = current.Next
        }

        return false;
    }
}