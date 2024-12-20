package FirstAndReserveTeam;

import java.util.Collections;
import java.util.List;

public class Team {
    private String name ;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }
    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }
    public void addPlayer (Person person){
       if (person.getAge()<40){
           this.firstTeam.add(person);
       }else {
           this.reserveTeam.add(person);
       }
    }
}
