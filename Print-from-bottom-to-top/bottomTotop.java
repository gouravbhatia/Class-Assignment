public class bottomTotop
{
    class Node
    {
        int key;
        Node left;
        Node right;
        Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;
    bottomTotop(){
        root=null;
    }
    void insert(int key)
    { 
        root = insertRec(root, key); 
    } 
    Node insertRec(Node root, int key) 
    { 
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
        return root; 
    } 
    void reverseLevelOrder(Node node)  
    { 
        int h = height(node);
		
        int i; 
        for (i = h; i >= 1; i--)  
        
        { 
            printGivenLevel(node, i); 
        } 
    } 
    void printGivenLevel(Node node, int level)  
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.key + " "); 
        else if (level > 1)  
        { 
            printGivenLevel(node.right, level - 1); 
            printGivenLevel(node.left, level - 1); 
        } 
        } 
        int height(Node node)  
        { 
            if (node == null) 
                return 0; 
            else
            {   
                int lheight = height(node.left); 
                int rheight = height(node.right); 
                if (lheight > rheight) 
                    return (lheight + 1); 
                else
                    return (rheight + 1); 
            } 
        }
    public static void main(String[] args) { 
        bottomTotop tree = new bottomTotop();
        tree.insert(40); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(35); 
        tree.insert(70); 
        tree.insert(50);
        tree.insert(80); 
        tree.reverseLevelOrder(tree.root);
    }
}