public class Person {
    String name;
    int age, weight, height;
    boolean dead, criminal, warCriminal, employed;
    
    public Person() {
        this.name = "John Doe";
        this.age = 21;
        this.weight = 210;
        this.height = 66;
        this.dead = false;
        this.criminal = true;
        this.warCriminal = true;
        this.employed = false;
    }
    
    public Person(String n, int a, int w, int h, boolean d, boolean crim, boolean wCrim, boolean e) {
        this.name = n;
        this.age = a;
        this.weight = w;
        this.height = h;
        this.dead = d;
        this.criminal = crim;
        this.warCriminal = wCrim;
        this.employed = e;
    }
    
    public String changeName(String newName) {
        this.name = newName;
        return(this.name);
    }
    
    public void print(Object s) {
        System.out.println(s);
    }
    
    public void say(Object s) {
        if (!dead){
            print(this.name + " says: " + s);
        } else {
            print(this.name + " is dead and cannot speak.");
        }
    }
    
    public String toString() {
        return("Name: " + name + ", age: " + age + ", employed: " + employed);
    }
    
    public void death() {
        print(this.name + " has died.");
        dead = true;
    }
    
    public void birthday() {
        print("It was " + this.name + "'s birthday.");
        age++;
    }
    
    public void fired() {
        employed = false;
        print(name + " got fired.");
    }
}