package Assignment;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NeverEndingBirthdayParty {

    public static int neverEndingBirthdayParty() {
        int totalBirthdays = 366; // 0 to 365
        Set<Integer> seen = new HashSet<>();
        Random random = new Random();
        int peopleCount = 0;

        while (seen.size() < totalBirthdays) {
            int birthday = random.nextInt(totalBirthdays); // Random between 0-365
            seen.add(birthday);
            peopleCount++;
        }

        return peopleCount;
    }

    public static void main(String[] args) {
        int result = neverEndingBirthdayParty();
        System.out.println("Number of people needed: " + result);
    }
}

