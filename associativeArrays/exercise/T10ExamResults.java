package associativeArrays.exercise;

import java.util.*;

public class T10ExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<Student>> students = new LinkedHashMap<>();
        Map<String, List<Student>> sortedStudents = new LinkedHashMap<>();
        Map<String, List<String>> languages = new LinkedHashMap<>();
        while (!line.equals("exam finished")) {
            //{username}-{language}-{points}
            if (line.contains("banned")) {
                //TODO
                String banned = "banned";
                String[] data = line.split("-");
                String student = data[0];
                students.entrySet().stream().forEach(entry -> {
                    entry.getValue().stream()
                            .filter(x->x.getName().equals(student))
                            .forEach(x -> x.setName(banned));
                });
            } else {
                String[] data = line.split("-");
                String student = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);
                students.putIfAbsent(student, new ArrayList<Student>());
                students.get(student).add(new Student(student, language, points));
                languages.putIfAbsent(language, new ArrayList<>());
                languages.get(language).add(student);


            }
            line = scanner.nextLine();
        }
        System.out.println("Results:");
        List<Student>sorted=new ArrayList<>();

        students.entrySet().stream()
                .forEach(y->y.getValue()
                        .stream().forEach(r-> {
                            if(!r.getName().equals("banned")){
                                sortedStudents.put(y.getKey(),y.getValue());
                            }
                        }));


      sortedStudents.entrySet().stream()
                .forEach(entry -> {
            OptionalInt max = entry.getValue().stream().mapToInt(x -> x.getPoints()).max();

                    System.out.printf("%s | %s%n", entry.getKey(), max.getAsInt());

        });



/*
        students.entrySet().stream()
                .forEach(y->y.getValue()
                        .stream().forEach(r-> {
                            if(!r.getName().equals("banned")){
                                OptionalInt max = y.getValue().stream().mapToInt(x -> x.getPoints()).max();
                                System.out.printf("%s | %s%n", y.getKey(), max.getAsInt());

                            }
                        }));

 */
        System.out.println("Submissions:");
        languages.entrySet().stream().forEach(entry -> {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().size());
        });
    }

    static class Student {
        String name;
        String language;
        int points;

        public Student(String name, String language, int points) {
            this.name = name;
            this.language = language;
            this.points = points;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }
    }
}
