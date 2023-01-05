package associativeArrays.exercise;

import java.util.*;

public class T9ForceBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        Map<String, List<String>>users=new LinkedHashMap<>();
        while (!line.equals("Lumpawaroo")){
            if (line.contains("|")) {
                String side = line.split("\\s+\\|\\s+")[0];
                String user = line.split("\\s+\\|\\s+")[1];
                users.putIfAbsent(side,new ArrayList<>());
                boolean nonMatch=users.entrySet()
                        .stream().noneMatch(entry->entry.getValue().contains(user));

                if(nonMatch){
                    users.get(side).add(user);
                }


            }else if(line.contains("->")){
                String side = line.split("\\s+->\\s+")[1];
                String user = line.split("\\s+->\\s+")[0];
                users.forEach((k,v)->v.remove(user));
                users.putIfAbsent(side,new ArrayList<>());
                users.get(side).add(user);
                System.out.printf("%s joins the %s side!%n",user,side);

            }



            line=scanner.nextLine();
        }
        users.forEach((k,v)->{
            if(v.size()!=0){
                System.out.printf("Side: %s, Members: %d%n",k,v.size());
                v.forEach(x-> System.out.printf("! %s%n",x));
            }
        });
    }
}
