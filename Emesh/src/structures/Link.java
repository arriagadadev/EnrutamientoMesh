/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author danie
 */
public class Link {
    public int dData; //Representa el peso de la arista (distancia en este caso)
    public Vertex vertex;
    public int indexOnArray;
    public Link next;              // next link in list
// -------------------------------------------------------------
    public Link(Vertex vertex, int index, int distance) // constructor
    {
    this.vertex = vertex;
    this.indexOnArray = index;
    this.dData = distance;
    }
// -------------------------------------------------------------
    public void displayLink()      // display ourself
    {
    System.out.print("{" + vertex.label +  "} ");
    }
}
