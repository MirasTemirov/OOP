package LAB12;

import java.util.LinkedHashSet;

public class SetOperationsShowcase {
    public static void main(String[] args) {
        LinkedHashSet<String> teamA = new LinkedHashSet<>();
        LinkedHashSet<String> teamB = new LinkedHashSet<>();

        teamA.add("George");
        teamA.add("Jim");
        teamA.add("John");
        teamA.add("Blake");
        teamA.add("Kevin");
        teamA.add("Michael");

        teamB.add("George");
        teamB.add("Katie");
        teamB.add("Kevin");
        teamB.add("Michelle");
        teamB.add("Ryan");


        LinkedHashSet<String> unionSet = (LinkedHashSet<String>) teamA.clone();
        unionSet.addAll(teamB);
        System.out.println("Объединение множеств: " + unionSet);

        LinkedHashSet<String> intersectionSet = (LinkedHashSet<String>) teamA.clone();
        intersectionSet.retainAll(teamB);
        System.out.println("Пересечение множеств: " + intersectionSet);

        LinkedHashSet<String> differenceSet = (LinkedHashSet<String>) teamA.clone();
        differenceSet.removeAll(teamB);
        System.out.println("Разница множеств: " + differenceSet);


        teamA.add("Natalie");
        teamB.add("Oman");
        System.out.println("Команда A с новым участником: " + teamA);
        System.out.println("Команда B с новым участником: " + teamB);
    }
}

