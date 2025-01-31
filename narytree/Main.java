class Node
{
    int data;
    boolean locked;
    List<Node> children;
    boolean isLockable;
    Node parent;

    Node(int val)
    {
        this.data=val;
        this.children=new ArrayList<>();
        this.locked=false;
        this.isLockable=true;
    }
    Node(int val,Node parent)
    {
        this.data=val;
        this.parent=parent;
        this.locked=false;
        this.isLockable=true;
        children=new ArrayList<>();
    }
}
class Main{
    boolean isAnyParentLocked(Node root)
    {
        boolean flag=false;
        while(root!=null)
        {
            flag=flag||root.isLockable;
            root=root.parent;
        }
        return flag;
    }
    void lock(Node root)
    {
        if(!root.isLockable) return ;
        if(isLock(root)) return ;
        if(isAnyParentLocked(root.parent)) return ;
        root.locked=true;
        Node temp=root;
        while(temp!=null)
        {
            temp.isLockable=false;
            temp=temp.parent;
        }
    }
    public static void main(String[] args)
    {

    }
    }