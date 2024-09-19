import java.util.*;
public class Graph{
    ArrayList<LinkedList<Node>> alist;
    Graph(){
        alist=new ArrayList<>();

    }
    public void addNode(Node node){
        LinkedList<Node> currentList=new LinkedList<>();
        alist.add(currentList);

    }
    public void addEdge(int src,int des){
        LinkedList<Node> currentList=alist.get(src);
        Node dstNode=alist.get(des).get(0);
        currentList.add(dstNode);



    }
    public boolean checkEdge(int src,int des){

    }
    public void print(){

    }
}