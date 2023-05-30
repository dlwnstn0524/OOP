// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.*;

public class CollectionTest 
{
   public static void main(String[] args)
   {
      // add elements in colors array to list
      String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN", "RED", "CYAN", "RED", "BLUE"};
      LinkedList<String> list = new LinkedList<String>();

      makeList(list, colors); // 2-가

      // output list contents
      System.out.printf("%n%nOriginal colors:%n");
      for (String color : list)
         System.out.printf("%s ", color);

      // get duplicates
      List<String> list2 = removeDuplicates(list);

      // output list contents
      System.out.printf("%n%nDuplicate-removed colors:%n");
      for (String color : list)
         System.out.printf("%s ", color);

      // output list contents
      System.out.printf("%n%nDuplicated colors:%n");
      for (String color : list2)
         System.out.printf("%s ", color);

      //2-(라) 정답 코드
      list2.sort(Comparator.reverseOrder());

      System.out.printf("%n%nSorted colors:%n");
      for (String color : list2)
         System.out.printf("%s ", color);
   }

   // 2-(가)
   private static void makeList(LinkedList<String> list, String[] colors) {
      ListIterator iter = list.listIterator();
      for(String color : colors){
         iter.add(color);
      }
   }

   //2-(나) 정답 코드
//   private static LinkedList<String> removeDuplicates(LinkedList<String> list) {
//      Iterator<String> iter = list.iterator();
//      List<String> list2 = new LinkedList<String>(); // new LinkedList<>(); 도 OK
//      LinkedList<String> list3 = new LinkedList<String>();
//      while(iter.hasNext())
//      {
//         String s = iter.next();
//         if(list2.contains(s))
//         {
//            iter.remove();
//            if(!list3.contains(s))
//               list3.add(s);
//         }
//         list2.add(s);
//      }
//      return  list3;
//   }

   //2-(다) 정답 코드
   private static <T> LinkedList<T> removeDuplicates(LinkedList<T> list){
      Iterator<T> iter = list.iterator();
      List<T> list2 = new LinkedList<>(); // new LinkedList<>(); 도 OK
      LinkedList<T> list3 = new LinkedList<>();
      while(iter.hasNext())
      {
         T s = iter.next();
         if(list2.contains(s))
         {
            iter.remove();
            if(!list3.contains(s))
               list3.add(s);
         }
         list2.add(s);
      }
      return  list3;
   }

   // remove colors specified in collection2 from collection1
   private static void removeColors(Collection<String> collection1, 
      Collection<String> collection2)
   {
      // get iterator
      Iterator<String> iterator = collection1.iterator(); 

      // loop while collection has items
      while (iterator.hasNext())
      {
         if (collection2.contains(iterator.next()))
            iterator.remove(); // remove current element
      } 
   } 
} // end class CollectionTest
