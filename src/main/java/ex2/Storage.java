package ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>>storageMap = new HashMap<>();


       public void addToStorage(String key, String name){

           List<String>valueList = storageMap.get(key);
           if(valueList==null) {
               valueList=new ArrayList<>();
           }


            valueList.add(name);
           storageMap.put(key, valueList);
           storageMap.forEach((k,v)-> System.out.println("klucz: "+k+", wartość"+v));

       }

       public void printValues(String key){
           System.out.println(storageMap.get(key));
           if(storageMap.get(key) == null){
               System.out.println("This key doesn't exist");
           }else
               System.out.println(storageMap.get(key));
       }
}
    

