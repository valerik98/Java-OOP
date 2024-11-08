package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
private String name;
private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.isEmpty()){
            throw new IllegalArgumentException("A name should not be empty");
        }
        this.name = name;
    }
    //+ addPlayer(Player) : void
    public void addPlayer(Player player){
        this.players.add(player);
        // Team {team name} does not exist.
    }
    //+ removePlayer(String) : void
    public void removePlayer(String name){
        int index = -1;
        for (int i = 0; i < this.players.size(); i++) {
            if (name.equals(this.players.get(i).getName())){
                index = i;
            }
        }
        if (index == -1){
            throw new IllegalArgumentException("Player " + name + " is not in " + this.name + " team.");
        }
        this.players.remove(index);
    }
    //+ getRating() : double
    public double getRating(){
        return Math.round(this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0));
    }
}
