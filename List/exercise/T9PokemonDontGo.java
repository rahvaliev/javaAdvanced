package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T9PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer>distanceToPokemon= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum=0;
        while (!distanceToPokemon.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                sum+=distanceToPokemon.get(0);
                int element=distanceToPokemon.get(0);
                distanceToPokemon.remove(0);
                distanceToPokemon.add(0, distanceToPokemon.get(distanceToPokemon.size() - 1));
                for (int i = 0; i < distanceToPokemon.size(); i++) {
                    if (distanceToPokemon.get(i) <= element) {
                        distanceToPokemon.set(i, distanceToPokemon.get(i) + element);
                    } else {
                        distanceToPokemon.set(i, distanceToPokemon.get(i) - element);
                    }
                }
            } else if (index > distanceToPokemon.size() - 1) {
                sum+=distanceToPokemon.get(distanceToPokemon.size()-1);
                int element=distanceToPokemon.get(distanceToPokemon.size()-1);
                distanceToPokemon.set(distanceToPokemon.size()-1,distanceToPokemon.get(0) );
                for (int i = 0; i < distanceToPokemon.size(); i++) {
                    if (distanceToPokemon.get(i) <= element) {
                        distanceToPokemon.set(i, distanceToPokemon.get(i) + element);
                    } else {
                        distanceToPokemon.set(i, distanceToPokemon.get(i) - element);
                    }
                }

            } else {
                int element = distanceToPokemon.get(index);
                distanceToPokemon.remove(index);
                sum += element;
                for (int i = 0; i < distanceToPokemon.size(); i++) {
                    if (distanceToPokemon.get(i) <= element) {
                        distanceToPokemon.set(i, distanceToPokemon.get(i) + element);
                    } else {
                        distanceToPokemon.set(i, distanceToPokemon.get(i) - element);
                    }
                }


            }
        }
        System.out.println(sum);
    }
}
