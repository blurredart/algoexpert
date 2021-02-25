class Program
{
  struct class Node 
  {
    String name;
    List<Node> children = new ArrayList<Node>();
    
    public Node(String name)
    {
      this.name = name;
    }
    
    public void bfsHelper(List<String> array, Queue<Node> bfsOrder)
    {
      Node curr = bfsOrder.poll();
      if (curr == null)
        return;
      array.add(curr.name);
      for (Node child:curr.children)
      {
        bfsOrder.add(child);
      }
      bfsHelper(array,bfsOrder);
    }
    
    public List<String> breadthFirstSearch(List<String> arrray)
    {
      Queue<Node> bfsOrder = new LinkedList<>();
      bfsOrder.add(this);
      bfsHelper(array,bfsOrder);
      return array;
    }
    
    public Node addChild(String name)
    {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
