public class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=null;
         if(head==null)
         {
            head=node;
         }
         else
         {
            Node n = head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
            node.next=null;
         }
    }
    public void insertAtStart(int data)
    {
        Node node=new Node();
        node.data=data;
        Node temp=head;
        head=node;
        head.next=temp;
    }
    public void insertAt(int index,int data)
    {
        Node node=new Node();
        node.data=data;
        
        if(index==0)
        {
            insertAtStart(data);
        }
        Node n=head;
        int i=0;
        while(n.next!=null && i<index-1)
        {
            i++;
            n=n.next;
        }
        node.next=n.next;
        n.next=node;

    }
    public void show()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next; 
        }
    }
}