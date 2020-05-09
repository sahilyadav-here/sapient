import java.util.*;

public class SynonymDict {
  static Dictionary<String,Set<String>> dict = new Hashtable<String,Set<String>>();

  public static void addValueToDict(String s,Set<String> strlist){
    dict.put(s,strlist);
  }

  public static Set<String> getSetfromArray(String[] s){
    Set<String> set = new HashSet<String>();
    set.addAll(Arrays.asList(s));
    return set;
  }
    public static void main(String[] args){
        addValueToDict("GoodMorning", getSetfromArray(new String[]{"GoodMorning","Shubhodaya","Shubhohday","Bonjour"}));
        addValueToDict("GoodEvening", getSetfromArray(new String[]{"good Evening","Shubha sange","susandhya","Bonsoir"}));

        Scanner sc = new Scanner(System.in);
        while(true){
          System.out.println("enter a key, or enter 'C' to exit-");
          String input = sc.nextLine();
          if(input.charAt(0) == 'C'){
            break;
          }
          Set<String> s = dict.get(input);
          if(s != null){
            System.out.println("");
            for(String k : s){
              System.out.println(k);
            }
          }else{
            System.out.println("the word is not in the dict, would you like to add it? press Y for yes, else any key");
            String res = sc.nextLine();
            if(res.charAt(0) == 'Y'){
              ArrayList<String> temp = new ArrayList<String>();
              System.out.println("enter the values-");
              while(true){
                String inp = sc.nextLine();
                if(inp.isEmpty()){
                  break;
                }
                temp.add(inp);
              }
              addValueToDict(input, getSetfromArray(temp.toArray(new String[0])));
            }
          }
        }
        sc.close();
      }
}