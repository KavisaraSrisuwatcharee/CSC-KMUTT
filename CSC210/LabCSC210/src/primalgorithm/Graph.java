package primalgorithm;

import java.util.LinkedList;
import java.util.ListIterator;

public class Graph {
    // Adjacency List to represent pur graph
    LinkedList nodeList[];
    int NUM_NODES;

    public Graph(int nodes) { //constructor
        NUM_NODES = nodes;
        nodeList = new LinkedList[NUM_NODES];
        for (int i = 0; i < nodeList.length; i++) {
            nodeList[i] = new LinkedList();
        }
    }
    public void primAlgo(){
        LinkedList treeVertices = new LinkedList();
        LinkedList remainingVertices =new LinkedList();
        ListIterator iterator;
        Edge e;
        treeVertices.add(new Edge(0,0,-1));
        int min=Integer.MAX_VALUE;
        for(int i=0;i<NUM_NODES;i++){
            iterator=nodeList[0].listIterator();
            for(e= (Edge) iterator.next();
                e.to!=i && iterator.hasNext();
                e = (Edge) iterator.next()){
                //loop to search node i whether
                // node A (0) can go to node i

            }
            if (e.to==i){
                if(e.distance<min){
                    remainingVertices.addFirst(e);
                    min= e.distance;
                }else{
                    remainingVertices.add(e);
                }
            }else{
                remainingVertices.add(new Edge(0,i,Integer.MAX_VALUE));
            }
        }
        //print out remaining vertice list
        iterator=remainingVertices.listIterator();
        while(iterator.hasNext()){
            Edge x=(Edge) iterator.next();
            System.out.print(x.to+"("+x.from+","+x.distance+"),");
        }
    }
}
