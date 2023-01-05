package associativeArrays.exercise;

import java.util.*;

public class T3LegendaryFaming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"

        boolean hasWinner = false;
        String winner = "";
        Map<String, Integer> resources = new LinkedHashMap<>();
        resources.put("shards", 0);
        resources.put("fragments", 0);
        resources.put("motes", 0);
        Map<String,String> winners=new HashMap<>();
        winners.put("shards","Shadowmourne obtained!");
        winners.put("fragments","Valanyr obtained!");
        winners.put("motes","Dragonwrath obtained!");

        while (!hasWinner){
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length-1 ; i+=2) {


                String resource = data[i + 1].toLowerCase();
                int quantity = Integer.parseInt(data[i]);
                resources.putIfAbsent(resource, 0);
                resources.put(resource, resources.get(resource) + quantity);
                if (resource.equals("shards") || resource.equals("fragments") || resource.equals("motes")) {
                    if (resources.get(resource) >= 250) {
                        hasWinner = true;
                        winner = resource;
                        resources.put(resource, resources.get(resource) - 250);
                        break;
                    }
                }
            }
        }
        System.out.println(winners.get(winner));
        resources.forEach((k,v)-> System.out.printf("%s: %d%n",k,v));
    }
}
