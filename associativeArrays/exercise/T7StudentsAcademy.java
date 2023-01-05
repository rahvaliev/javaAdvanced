package associativeArrays.exercise;

import java.util.*;

public class T7StudentsAcademy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>> students=new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());
            if(students.containsKey(name)){
                students.get(name).add(grade);
            }else {
                students.put(name,new ArrayList<>());
                students.get(name).add(grade);

            }

        }
        //"{name} –> {averageGrade}"
        //Format the average grade to the 2nd decimal place.
        students.forEach((k,v)-> {
            double averageGrade=v.stream()
                    .mapToDouble(x->x)
                    .average()
                    .orElse(0.0);
            if(averageGrade>=4.50){
                System.out.printf("%s -> %.2f%n",k,averageGrade);
            }
        });
    }
}
