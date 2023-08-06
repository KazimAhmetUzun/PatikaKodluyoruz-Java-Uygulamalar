package Fixture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {

    public static List<List<String>> generateFixture(List<Team> teams) {
        int totalTeams = teams.size();
        List<List<String>> fixture = new ArrayList<>();

        // Takım sayısı tekse bay takımı ekleyelim
        if (totalTeams % 2 != 0) {
            Team bayTeam = new Team("Bay");
            teams.add(bayTeam);
            totalTeams++;
        }

        int rounds = totalTeams - 1;
        int matchesPerRound = totalTeams / 2;

        List<Team> homeTeams = new ArrayList<>(teams.subList(0, totalTeams / 2));
        List<Team> awayTeams = new ArrayList<>(teams.subList(totalTeams / 2, totalTeams));
        Collections.reverse(awayTeams); // Deplasman takımlarını ters çevirerek her turda farklı eşleşmeler elde ederiz.

        for (int round = 0; round < rounds; round++) {
            List<String> roundMatches = new ArrayList<>();
            for (int match = 0; match < matchesPerRound; match++) {
                String homeTeamName = homeTeams.get(match).getName();
                String awayTeamName = awayTeams.get(match).getName();
                roundMatches.add(homeTeamName + " vs " + awayTeamName);
            }
            fixture.add(roundMatches);

            // Tur sonunda takımları döndürüp tekrar eşleştirelim
            Team temp = homeTeams.remove(homeTeams.size() - 1);
            awayTeams.add(1, temp);
            homeTeams.add(1, awayTeams.remove(awayTeams.size() - 1));
        }

        return fixture;
    }

    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Fenerbahçe"));
        teams.add(new Team("Beşiktaş"));
        teams.add(new Team("Başakşehir"));
        teams.add(new Team("Trabzonspor"));

        List<List<String>> fixture = generateFixture(teams);

        int roundNumber = 1;
        for (List<String> roundMatches : fixture) {
            System.out.println("Round " + roundNumber++);
            for (String match : roundMatches) {
                System.out.println(match);
            }
            System.out.println();
        }
    }
}