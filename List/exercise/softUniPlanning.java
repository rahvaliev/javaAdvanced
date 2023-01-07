package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softUniPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandData = command.split(":");
            String lessonTitle = commandData[1];
            String exercise=lessonTitle +"-Exercise";
            switch (commandData[0]) {
                case ("Add"):
                    if(!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                    }
                    break;
                case ("Insert"):
                    int index=Integer.parseInt(commandData[2]);
                    if (!schedule.contains(lessonTitle)) {
                        if(index>=0 && index< schedule.size()){
                            schedule.add(index,lessonTitle);
                        }
                    }
                    break;
                case ("Remove"):
                    schedule.remove(lessonTitle);
                    schedule.remove(exercise);
                    break;
                case ("Swap"):
                    String swapLesson=commandData[2];
                    String swapExercise=swapLesson + "-Exercise";
                    if(schedule.contains(lessonTitle) && schedule.contains(swapLesson)){

                        int lessonIndex=schedule.indexOf(lessonTitle);
                        int swapIndex=schedule.indexOf(swapLesson);
                        schedule.add(lessonIndex,swapLesson);
                        schedule.remove(lessonIndex+1);
                        schedule.add(swapIndex,lessonTitle);

                        schedule.remove(swapIndex+1);
                    }
                    if(schedule.contains(swapExercise)){
                        schedule.remove(swapExercise);
                        schedule.add(schedule.indexOf(swapLesson)+1,swapExercise);

                    }
                    if(schedule.contains(exercise)){
                        schedule.remove(exercise);
                        schedule.add(schedule.indexOf(lessonTitle)+1,exercise);


                    }
                    break;
                case ("Exercise"):
                    if(schedule.contains(lessonTitle) && !schedule.contains(exercise)){
                        schedule.add(schedule.indexOf(lessonTitle)+1,exercise);
                    }else if(!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            command=scanner.nextLine();
        }
        for (int i = 0; i < schedule.size() ; i++) {
            System.out.printf("%d.%s\n",i+1,schedule.get(i));

        }
    }
}
