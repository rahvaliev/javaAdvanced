package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T10SoftUniPlanning {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> plan= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command=scanner.nextLine();
        int exists=0;
        while (!command.equals("course start")){
            String[] commandData=command.split(":");
            switch (commandData[0]){
                case("Add"):
                    exists=0;
                    String lessonTitle=commandData[1];
                    for (int index = 0; index < plan.size() ; index++) {
                        if(lessonTitle.equals(plan.get(index))){
                            exists++;
                        }
                    }
                    if(exists>=1){

                    }else {
                        plan.add(lessonTitle);
                    }
                    break;
                case("Insert"):
                    exists=0;
                    lessonTitle=commandData[1];
                    int indexInsert=Integer.parseInt(commandData[2]);
                    for (int index = 0; index < plan.size() ; index++) {
                        if(lessonTitle.equals(plan.get(index))){
                            exists++;
                        }
                    }
                    if(exists>=1){

                    }else {
                        plan.add(indexInsert,lessonTitle);
                    }

                    break;
                case("Remove"):
                    exists=0;
                    int removeIndex=0;
                    lessonTitle=commandData[1];
                    for (int index = 0; index < plan.size() ; index++) {
                    if(lessonTitle.equals(plan.get(index))){
                        exists++;
                        removeIndex=index;
                    }
                }
                if(exists>=1){
                    plan.remove(lessonTitle);
                    String current=lessonTitle+"-Exercise";
                    if(removeIndex< plan.size()) {
                        if (plan.get(removeIndex).equals("current")) ;
                        plan.remove(current);
                    }
                }

                    break;
                case("Swap"):
                    exists=0;
                    lessonTitle=commandData[1];
                    String lessonSwap=commandData[2];
                    int swapfirst=0;
                    int swapsecond=0;
                    for (int index = 0; index < plan.size() ; index++) {
                        if(lessonTitle.equals(plan.get(index))){
                            exists++;
                            swapfirst=index;
                        }
                    }
                    if(exists>=1){
                        exists=0;
                        for (int index = 0; index < plan.size() ; index++) {
                            if(lessonSwap.equals(plan.get(index))){
                                exists++;
                                swapsecond=index;
                            }
                        }
                        if(exists>=1){
                            if(swapsecond<swapfirst){
                                String current=plan.get(swapfirst);
                                String exercise=lessonTitle+"-Exercise";
                                String exerciseSwap=lessonSwap+"-Exercise";
                                plan.set(swapfirst,plan.get(swapsecond));
                                plan.set(swapsecond,current);
                                if((swapfirst+1)< plan.size()){
                                    if(plan.get(swapfirst+1).equals(exercise)){
                                        plan.add(swapsecond+1,exercise);
                                        plan.remove(swapfirst+1);
                                    }
                                    if(plan.get(swapsecond+2).equals(exerciseSwap)){
                                        plan.add(exerciseSwap);
                                        plan.remove(swapsecond+2);
                                    }
                                }
                                if(plan.get(swapsecond).equals(exerciseSwap)) {
                                    plan.add(exerciseSwap);
                                    plan.remove(swapsecond+1);
                                }

                            }
                            String current=plan.get(swapfirst);
                            String exercise=lessonTitle+"-Exercise";
                            String exerciseSwap=lessonSwap+"-Exercise";
                            plan.set(swapfirst,plan.get(swapsecond));
                            plan.set(swapsecond,current);
                            if(plan.get(swapfirst+1).equals(exercise)){
                                if(swapsecond+1< plan.size()){
                                    plan.add(swapsecond+1,exercise);
                                    plan.remove(swapfirst+1);

                                }else {
                                    plan.add(exercise);
                                }
                            }
                            if((swapsecond+1)<=( plan.size()-1)){
                                if(plan.get(swapsecond+1).equals(exerciseSwap) ){
                                    plan.add(swapfirst+1,exerciseSwap);
                                    plan.remove(swapsecond+2);
                                }
                            }
                        }
                    }
                    break;
                case("Exercise"):
                    int indexEcercise=0;
                    exists=0;
                    lessonTitle=commandData[1];
                    for (int index = 0; index < plan.size() ; index++) {
                        if(lessonTitle.equals(plan.get(index))){
                            exists++;
                            indexEcercise=index+1;
                        }
                    }
                    if(exists>=1){
                        String exercise=lessonTitle+"-Exercise";
                        if(indexEcercise< plan.size()){
                            plan.add(exercise);
                        }else {
                            plan.add(indexEcercise,exercise);
                        }
                    }else {
                        plan.add(lessonTitle);
                        String exercise=lessonTitle+"-Exercise";
                        plan.add(exercise);
                    }
                    break;
            }



            command=scanner.nextLine();
        }

        for (int i = 0; i < plan.size() ; i++) {
            System.out.printf("%d.%s\n",i+1,plan.get(i));

        }
    }


}
