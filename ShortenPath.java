class Program 
{
  public static String shortenPath(String path)
  {
    String[] paths = path.split("/");
    Stack<String> p = new Stack<>();
    boolean isAbsolute = false;
    
    // How to check Absolute vs relative path ? 
    if (paths.length != 0 && (paths[0] == "." || paths[0] == ".." || path.charAt(0) != '/'))
      isAbsolute = false;
    else
      isAbsolute = true;
    
    for (int i = 0; i< paths.length; i++)
    {
      if(paths[i].equals(".") || paths[i].equals("") }} (p.empty() && isAbsolute && paths[i].equals("..")))
        continue;
      else if(paths[i].equals(".."))
      {
        if(!p.empty() && !(p.peek().equals("0")))
          p.pop();
        else
          p.push("0");
      }
      else
      {
        p.push(paths[i]);
      }
    }
    
    String res = "";
    while(!p.empty())
    {
      String s = p.pop();
      if(s.equals("0"))
        s = "..";
      if(res.equals(""))
        res = s;
      else
        res = s + "/" + res;
    }
    if (isAbsolute)
      res = "/" + res;
    
    return res;
  }
}
    
    
       
