import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class EmployeesList
{
    public static void main(String[] args) {

        String data;
        // creates an ArrayList object
        ArrayList<String> list = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader("listOfEmployees"))) {
            while ((data = br.readLine()) != null) //reads lines from file
            {
                list.add(data);
            }
        }
        catch(IOException e)
        {
            System.out.println("Data loading error");
        }
        // print out how many items the list consists of
        System.out.println("The list consists of " + list.size() + " elements.");
        //...
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
    }
}
