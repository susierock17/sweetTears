import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * Created by Kate on 23-Apr-16.
 */
public class Pain {



    public List<Object> list = new ArrayList<Object>();

    public static void main(String args[]){
        Pain pain = new Pain();
        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        pain.fuctionAnagram(str1,str2);
        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1.equals(i2));
    }

    public void functionOne(){
        List<Object> list;

        list=new ArrayList<Object>();

        list.add("a");
        list.add(1);
        List list2 = new ArrayList();
        list2.add(3);
        list2.add("d");
        list2.add('4');
        list.addAll(list2);
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }

    public void functionTwo(){
        double sum = 0;
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(8);
        for(Object o: list){
            sum += (Integer)o;
        }
        double middle = sum / list.size();
        System.out.println(middle);
        double minDiff = middle - (Integer)list.get(0);
        double diff;
        Object ob = list.get(0);
        for(Object o : list){
            diff = Math.abs(middle - (Integer)o);
            //minDiff = diff;
            if(minDiff>diff) {
                minDiff = diff;
                ob = o;
            }
        }
        System.out.println(ob);
    }

    public void functionThree(){
        list.add(24);
        list.add(5);
        list.add(56);
        list.add(4);
        list.add(90);
        list.add(21);
        list.add(3);
        int min = (Integer) list.get(0);
        for (Object o: list){
            if(min>(Integer)o)
                min = (Integer)o;
        }
        int max = (Integer) list.get(0);
        for(Object o: list){
            if(max<(Integer)o)
                max = (Integer)o;
        }
        System.out.println(min + " " + max);
        int multiple = min*max;
        try {
            Writer out = new FileWriter("mine1.txt");
            out.write(String.valueOf(multiple));
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //huj

    }

//    public void functionFour(){
//        Map <Integer, Object> map = new HashMap<Integer, Object>();
//        Object o = new Object();
//        map.put(1, o);
//        System.out.println(map.get(1));
//        Set <Integer> set = new HashSet<Integer>();
//        set.add(1);
//        set.add(2);
//        set.add(6);
//        System.out.println(set);
//
//        LinkedList<Integer> ll = new LinkedList<Integer>();
//
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//
//        System.out.print(ll.get(0));
//
//        StringBuffer str = new StringBuffer();
//        String str1= new String("Hello Kate!");
//        System.out.println("\n"+str1.length());
//        double d1 =Double.NaN;
//        double d2 =Double.NaN;
//        if(Double.compare(d1,d2)==0)
//            System.out.print("true");
//        String str2 = "true";
//        if(str2=="true")
//            System.out.print("true");
//    }

    public boolean fuctionAnagram(String str1,String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String s1 = new String(char1);
        String s2 = new String(char2);
        System.out.println(s1 + "\n" + s2);
        if(!s1.equals(s2)){
            System.out.println("False");
            return false;
        }
        System.out.println(s1.hashCode());

        int[] mass = {1, 12, 3};
        int[] mass1 = new int[2];
        return true;
    }

}


