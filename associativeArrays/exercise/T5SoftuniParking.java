package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T5SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> users = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");
            String command = data[0];
            String user = data[1];

            switch (command) {
                case ("register"):
                    String plate = data[2];
                    if(users.containsKey(user)){
                        System.out.printf("ERROR: already registered with plate number %s%n",plate);
                    }else {
                        users.put(user,plate);
                        System.out.printf("%s registered %s successfully%n",user,plate);
                    }
                    break;
                case ("unregister"):
                    if(users.containsKey(user)){
                        users.remove(user);
                        System.out.printf("%s unregistered successfully%n",user);
                    }else {
                        System.out.printf("ERROR: user %s not found%n",user);
                    }

                    break;
            }

        }
        users.forEach((k,v)-> System.out.printf("%s => %s%n",k,v));
    }

}
