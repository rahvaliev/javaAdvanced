package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class T8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, LinkedHashMap<String,String>> companyUsers=new LinkedHashMap<>();
        String command=scanner.nextLine();
        while (!command.equals("End")){
            //{companyName} -> {employeeId}
            String companyName=command.split(" -> ")[0];
            String id=command.split(" -> ")[1];
            if(companyUsers.containsKey(companyName)){
                companyUsers.get(companyName).put(id,companyName);
            }else {
                companyUsers.put(companyName,new LinkedHashMap<>());
                companyUsers.get(companyName).put(id,companyName);
            }

            command=scanner.nextLine();
        }
        companyUsers.forEach((k,v)->{
            System.out.println(k);
            v.forEach((x,y)-> System.out.printf("-- %s%n",x));
        });
    }
}
