import java.util.*;
import java.io.*;
public class Set2 {
		public static void main (String[] args) throws IOException
		{
		   InputStreamReader inr = new InputStreamReader(System.in);
		   BufferedReader br=new BufferedReader(inr);
		   int cases=Integer.parseInt(br.readLine());
		   while(cases--> 0)
		   {
		       String inp=br.readLine();
		       int n=inp.length();
		       ArrayList<Integer> factors=new ArrayList<Integer>();
		       factors.add(1);
		       for(int i=2;i*i<=n;i++)
		       {
		           if(n%i==0)
		           factors.add(i);
		           
		           if(n/i!=i)
		           factors.add(n/i);
		       }
		       Collections.sort(factors);
		       System.out.println(func(inp,factors));
		   }
		}
		public static boolean func(String str,ArrayList<Integer> a)
		{
		    int n=a.size();
		    for(int i=n-1;i>=0;i--)
		    {
		        int start=0;
		        int end=a.get(i);
		        int temp=str.length()/a.get(i);
		        int k=0;
		        String s="";
		        ArrayList<String> ss=new ArrayList<String>();
		        while(temp-->0 && end<=str.length())
		        {
		            if(k==0)
		            s=str.substring(start,end);
		            else
		            {
		                String t=str.substring(start,end);
		                
		                if(s.equals(t))
		                ss.add(t);
		            }
		            start=start+(str.length()/a.get(i));
		                end=end+(str.length()/a.get(i));
		            k++;
		        }
		        int qwerty=str.length()/a.get(i);
		        if(ss.size()==qwerty-1)
		        return true;
		    }
		    return false;
		}
	}