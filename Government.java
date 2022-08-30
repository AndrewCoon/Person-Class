import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.ArrayList;

public class Government {
    String type, name;
    int wealth, power;
    List<Person> members = new ArrayList<Person>();
    Person leader;

    public Government(String name, String type, int wealth, Person leader) {
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
        power = (int) (wealth * 100) + (members.size() * 1500);
        if (leader.hp <= 0 || power <= 0 || wealth <= 0) {

        }
    }

    public String memberNames() {
        String mems = "";
        for (int i = 0; i < members.size(); i++) {
            mems += members.get(i).name + ", ";
        }
        return mems;
    }

    public void printInfluence() {
        print(name + ": contains " + members.size() + " members: " + members);
    }

    void print(Object s) {
        System.out.println(s);
    }

    public String toString() {
        return ("Name: " + name + ", Leader: " + leader.name + ", Members: " + memberNames());
    }

    public void attack(Government target) {
        if (randomInt(0, 1) == 0) {
            target.damageAll(randomInt(10, 25));
        } else {
            if (randomInt(0, 1) == 0) {
                damageAll(randomInt(5, 15));
            }
        }
        update();
        target.update();
    }

    public void damageAll(int damage) {
        for (int i = 0; i < members.size(); i++) {
            members.get(i).hp -= damage;
        }
    }

    public int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

}
