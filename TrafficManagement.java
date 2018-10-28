import java.util.*;
import java.util.R
class node
{
  int n,s,e,w,totalTime;
  Node N,S,E,W;
  Node(int n)
  {
    n=0;e=0;w=0;s=0,totalTime=n;
  }
  void addRandomTraffic()
  {
    Random r=new Random();
    if(N=null)
      n+=r.nextInt(200);
    if(S=null)
      s+=r.nextInt(200);
    if(E=null)
      e+=r.nextInt(200);
    if(W=null)
      w+=r.nextInt(200);
  }
  void simulateTraffic(int time[])
  {
    n-=(time[0]/2);
    if(n<0)
      n=0;
    s-=(time[1]/2);
    if(s<0)
      s=0;
    e-=(time[2]/2);
    if(e<0)
      e=0;
    w-=(time[3]/2);
    if(w<0)
      w=0;
  }
  static int[] getIndex(float ratios[])
  {
    int index={0,1,2,3};
    float values=ratios.clone();
    for(int i=0;i<4-1;i++)
      for(int j=0;j<4-1-i;j++)
      {
        if(values[j]>values[j+1])
        {
          float tempA=values[j];
          int tempI=index[j];
          values[j]=values[j+1];
          values[j+1]=tempA;
          index[j]=index[j+1];
          index[j+1]=tempI;
      }
      return index;
  }

  int[] checkTraffic()
  {
    int time[]=new int[4];
    int total=n+s+e+w;
    int newTotal=totalTime;
    float ratios[]={n/total*totalTime,s/total*totalTime,e/total*totalTime,w/total*totalTime};
    int indexArray[]=getIndex(ratios);
    for(int i=0;i<4;i++)
    {
      index=indexArray[i];
      if(ratios[index]==0)
        time[index]=0;
      else if(ratios[index]<15)
      {
        time[index]=15;
        newTotal-=15;
      }
      else if(ratios[index]>newTotal)
          time[index]=newTotal;
      else
          time[index]=ratio[index];
      }
      return time;
  }
  void addN(Node n)
  {
    N=n;
  }
  void addS(Node n)
  {
    S=n;
  }
  void addE(Node n)
  {
    E=n;
  }
  void addN(Node n)
  {
    W=n;
  }
  public static void main(String args[])
  {
      Node n1=new Node();
      n1.addRandomTraffic();

  }
}
