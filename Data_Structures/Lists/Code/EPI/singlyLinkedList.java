public class singlyLinkedList {
    ListNode Head = null;


    public static void main(String[] args) {
        ListNode <Integer> a = new ListNode <> (8);
        ListNode <Integer> b = new ListNode <> (10);
        singlyLinkedList mylist = new singlyLinkedList(a);
        
        mylist.displayList();
        ListNode <Integer> c = mylist.searchList(a, 8);
        System.out.println ("Search within linked list: " + c.data);
        
        mylist.insertAfter(a, b);
        mylist.displayList();
        
        mylist.deleteList(a);
        mylist.displayList();
    }


    public singlyLinkedList(ListNode<Integer> a) {
        this.Head = a;
    }

    //search for a key
    public static ListNode<Integer> searchList(ListNode<Integer> L, int key) {
        while (L != null && L.data != key) {
            L = L.next;
        }
        //if key was not present in the list, L will have become null.
        return L;
    }

    //insert a new node after a specified node
    public static void insertAfter(ListNode <Integer> node, ListNode<Integer> newNode) {
        newNode.next = node.next;
        node.next = newNode;
    }

    //delete the node immediately following the aNode. Assumes aNode is not a tail.
    public static void deleteList(ListNode<Integer> aNode) {
        aNode.next = aNode.next.next;
    }
    
    public void displayList(){
        ListNode <Integer> temp = this.Head;
        
        System.out.println("Head -> Tail");
        System.out.print("{ ");
        
        while (temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        
        System.out.println("} ");
    }

    public static class ListNode<T> {

        private T data;
        private ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
        }

    }
}