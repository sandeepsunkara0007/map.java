import java.util.*;
public class Salary {
    HashMap<String,Integer> hm=new HashMap<>();
    public int totalsalary(){
        int sum=0;
        for(Integer salary : hm.values()){
                  sum=sum+salary;
        
        }
        return sum;
    }
    public int getsalary(String designation){
        
        if(hm.containsKey(designation)){
          return hm.get(designation);
        }else{
            return 0;
        }
        
    }
    public void updatesalary(String designation,int salary){
         hm.put(designation,salary);
    }
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        Salary obj=new Salary();
        obj.hm.put("ceo",20000);
        obj.hm.put("developer",5000);
        System.out.println(obj.totalsalary());
        obj.updatesalary("developer",6000);
         System.out.println(obj.hm.get("developer"));

    }
}
