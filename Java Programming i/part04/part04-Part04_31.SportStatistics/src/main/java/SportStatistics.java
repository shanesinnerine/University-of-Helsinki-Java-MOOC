
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();
        String winner;
        String loser;
        int index;
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String results = fileScanner.nextLine();
                String[] parsedResults = results.split(",");
                for(int i = 0; i < 2;i++){
                    if(newTeam(teams, parsedResults[i])){
                        teams.add(new Team (parsedResults[i]));
                    }
                }
                
                if(Integer.valueOf(parsedResults[2]) > Integer.valueOf(parsedResults[3])){
                    winner = parsedResults[0];
                    loser = parsedResults[1];
                } else {
                    winner = parsedResults[1];
                    loser = parsedResults[0];
                }
                index = searchFor(teams, winner);
                teams.get(index).addWin();
                index = searchFor(teams, loser);
                teams.get(index).addLoss();
            }       
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String teamName = scan.nextLine();
        index = searchFor(teams, teamName);
        if(index != 999){
            teams.get(index).printTeamStats();
        } else{
            System.out.println("Games: " + 0);
        System.out.println("Wins: " + 0);
        System.out.println("Losses: " + 0);
        }
    }

    
    
    
    public static boolean newTeam(ArrayList<Team> teams, String name){
        for(Team team : teams){
            if((team.getName()).equals(name)){
                return false;
            }
        }
        return true;
    }
    
    public static int searchFor(ArrayList<Team> teams, String name){
        for(int i = 0; i < teams.size(); i++){
            if(teams.get(i).getName().equals(name)){
                return i;
            }
        }
        return 999;
    }
}
