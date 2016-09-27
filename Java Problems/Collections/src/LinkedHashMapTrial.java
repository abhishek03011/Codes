import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapTrial 
{
public static void main(String...args)
{
	LinkedHashMap<Integer,String> a = new LinkedHashMap<Integer,String>();
	a.put(0, "Halla bol");
	a.put(1,"lodu");
	a.put(2,"lodu");

for(Map.Entry<Integer, String> b:a.entrySet() )
{
	System.out.println(b.getKey() + " "+ b.getValue() );
}



}

}
