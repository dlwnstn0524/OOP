import java.util.ArrayList;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest1
{
   public static void main(String[] args)
   {
      Employee[] emps = new Employee[4];
      emps[0] = new Employee("Kim", 100000.0, 2015, 3, 1);
      emps[1] = new Employee("Lee", 200000.0, 2005, 9, 1);
      emps[2] = new Employee("Hong", 80000.0, 2017, 5, 1);
      emps[3] = new Employee("Park", 150000.0, 2008, 3, 1);

      ArrayList<String> ae = new ArrayList<>();
      for(Employee e : emps)
         ae.add(e.getName());
      String[] names = ae.toArray(new String[ae.size()]);

      Pair<String> nn = ArrayAlg.minmax(names);
      System.out.println("min name = " + nn.getFirst());
      System.out.println("max name = " + nn.getSecond());

      Pair<Employee> ss = ArrayAlg.minmax(emps);
      System.out.println("min salary = " + ss.getFirst().getSalary());
      System.out.println("max salary = " + ss.getSecond().getSalary());
   }
}

class ArrayAlg
{
   /**
    * Gets the minimum and maximum of an array of strings.
    * @param a an array of strings
    * @return a pair with the min and max value, or null if a is null or empty
    */
   public static Pair<Employee> minmax(Employee[] a)
   {
      if (a == null || a.length == 0) return null;
      Employee min = a[0];
      Employee max = a[0];
      for (int i = 1; i < a.length; i++)
      {
         if (min.compareTo(a[i]) > 0) min = a[i];
         if (max.compareTo(a[i]) < 0) max = a[i];
      }
      return new Pair<>(min, max);
   }
   public static Pair<String> minmax(String[] a)
   {
      if (a == null || a.length == 0) return null;
      String min = a[0];
      String max = a[0];
      for (int i = 1; i < a.length; i++)
      {
         if (min.compareTo(a[i]) > 0) min = a[i];
         if (max.compareTo(a[i]) < 0) max = a[i];
      }
      return new Pair<>(min, max);
   }
}
