public class Main {
    public static void main(String[] args) {
        Main main = new Main();
    }
    
    public Main() {
        Person def = new Person();
        
        def.say("Hi");
        //def.death();
        def.say("I am dead");
        
        Person trevor = new Person("Trevor", 14, 120, 50, false, true, true, false, 25);
        trevor.say("I will start a dictatorship");
        Government tDictator = new Government("Treevor", "Dictatorship", 100, trevor);
        tDictator.join(def);
        print(tDictator);
    }
    
    void print(Object s) {
        System.out.println(s);
    }
}