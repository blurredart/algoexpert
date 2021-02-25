class SingleCycleCheck
{
  public static boolean hasSingleCycle(int[] arr)
  {
    int[] visited = new int[arr.length];
    visited[0] = 1;
    
    int currIndex = 0, nextIndex = 0;
    while (true)
    {
      arr[currIndex] = arr[currIndex]%arr.length;
      nextIndex = (currIndex + arr[currIndex]) < 0
        ? arr.length + arr[cuurIndex] + currIndex
        : (currIndex + arr[currIndex])%arr.length;
      
      if(visited[nextIndex] == 1)
        break;
      
      currIndex = nextIndex;
      visited[currIndex] = 1;
    }
    
    for (int i = 0;i <visited.length; i++)
      if(visited[i] == 0)
        return false;
    
    return (nextIndex == 0 ? true: false);
  }
}
