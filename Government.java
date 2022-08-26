import java.util.List;
import java.util.ArrayList;

public class Government
{
    String type, name;
    int wealth;
    List<Person> members = new ArrayList<Person>();
    Person leader;
    public Government(String name, String type,  int wealth, Person leader)
    {
       this.wealth = wealth;
       this.type = type;
       this.leader = leader;
       this.name = name;
       members.add(0, this.leader);
       print(this.leader.name + " has formed a " + this.type);
    }
    
    public void join(Person joining) {
        if (!joining.dead) {
            members.add(joining);
            print(joining.name + " has joined " + this.name);
        } else {
            print(joining.name + " is dead and cannot join a government.");
        }
    }
    
    public void update() {
        
       
    }
    
    public void memberNames() {
        
    }
    
    public void printInfluence() {
        print(name + ": contains " + members.size() + " members: " + members);
    }
    
    void print(Object s) {
        System.out.println(s);
    }
    
    public String toString() {
        return("Name: " + name + ", Leader: " + leader.name + ", members: " + members);
    }

}
