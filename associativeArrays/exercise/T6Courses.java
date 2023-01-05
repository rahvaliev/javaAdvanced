package associativeArrays.exercise;

import java.util.*;

public class T6Courses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, List<String>>courses=new LinkedHashMap<>();
        String commnad=scanner.nextLine();
        while (!commnad.equals("end")){
            String course=commnad.split(" : ")[0];
            String student=commnad.split(" : ")[1];
            if (courses.containsKey(course)) {
                courses.get(course).add(student);
            }else {
                courses.put(course,new ArrayList<>());
                courses.get(course).add(student);
            }


                commnad = scanner.nextLine();

        }
        courses.forEach((k,v)->{
            System.out.printf("%s: %d%n",k,v.size());
            for (int i = 0; i <v.size() ; i++) {
                System.out.printf("-- %s%n",courses.get(k).get(i));
            }
        });
    }
}
