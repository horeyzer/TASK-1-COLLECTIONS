import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;
public class EmployeesTreeSet
{
    public static void main(String[] args)
    {
        String data;

        TreeSet<String> set = new TreeSet();

        try(BufferedReader br = new BufferedReader(new FileReader("listOfEmployees")))
        {
            while((data = br.readLine()) != null)
            {
                set.add(data);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error loading data");
        }
        System.out.println("The list consists of " + set.size() + " elements.");

        for (String element:set)
        {
            System.out.println(element);
        }
        //...
    }
}
