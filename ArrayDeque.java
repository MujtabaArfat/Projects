import java.lang.Math;
public class ArrayDeque
{
    public int items[];
    public int first=4;
    public int last=5;
    public ArrayDeque()
    {
        items = new int[8];
    }
    public void addFirst(int i)
    {
        if(first==last){
            int temp[] = new int[items.length];
            int counter=0;
            for(int j=0;counter<items.length;j++,counter++)
            {   
                temp[j]=items[first];
                first=Math.floorMod((first+1),items.length);
            }
            items=new int[items.length*2];
            first=items.length-1;
            System.arraycopy(temp,0,items,0,temp.length);
      
            items[first]=i;
            first-=1;
        }
        else{
            items[first]=i;
            first=Math.floorMod((first-1),items.length);
        }
    }
    public void addLast(int i)
    {
      if(first==last){
            int temp[] = new int[items.length];
            int counter=0;
            for(int j=0;counter<items.length;j++,counter++)
            {   
                temp[j]=items[first];
                first=Math.floorMod((first+1),items.length);
                
            }
            last=items.length;
            items=new int[items.length*2];
            System.arraycopy(temp,0,items,0,temp.length);
            first=items.length-1;
            items[last]=i;
            last+=1;
        }
        else{last=Math.floorMod(last,items.length);
          items[last]=i;
          last=Math.floorMod((last+1),items.length);
          
        }
    }
      
        
    public static void main(String args[])
    {
        ArrayDeque ad = new ArrayDeque();
        ad.addFirst(10);
        ad.addFirst(9);
        ad.addFirst(8);
        ad.addFirst(7);
        ad.addFirst(6);
        ad.addLast(11);
        ad.addLast(12);
        ad.addLast(13);
        ad.addLast(14);
        ad.addLast(15);
        ad.addFirst(5);
        ad.addFirst(4);
        ad.addLast(14);
        ad.addLast(15);
        ad.addLast(16);
        ad.addFirst(3);
    }
}