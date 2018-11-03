import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tools {
    protected int strength;
    protected char type;

    public tools(int strength, char type) {
        this.strength = strength;
        this.type = type;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

class Rock extends tools {

    public Rock(int strength) {
        super(strength, 'r');
    }

    public boolean fight(tools tool) {
        if (tool instanceof Paper)
            return this.strength/2 > tool.strength;
        else if (tool instanceof Scissors)
            return this.strength*2 > tool.strength;
        return false;
    }
}

class Paper extends tools {

    public Paper(int strength) {
        super(strength, 'p');
    }

    public boolean fight(tools tool) {
        if (tool instanceof Rock)
            return this.strength*2 > tool.strength;
        else if (tool instanceof Scissors)
            return this.strength/2 > tool.strength;
        return false;
    }
}

class Scissors extends tools {

    public Scissors(int strength) {
        super(strength, 's');
    }

    public boolean fight(tools tool) {
        if (tool instanceof Paper)
            return this.strength*2 > tool.strength;
        else if (tool instanceof Rock)
            return this.strength/2 > tool.strength;
        return false;
    }
}

class RockPaperScissorsGame {
    public static void main(String args[]) {
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , " + p.fight(s));
        System.out.println(p.fight(r) + " , " + r.fight(p));
        System.out.println(r.fight(s) + " , " + s.fight(r));
    }
    @Test
    public void test(){
        Scissors s1 = new Scissors(12);
        Paper p1 = new Paper(8);
        Rock r1 = new Rock(15);
        assertEquals(s1.fight(p1),true);
        assertEquals(p1.fight(s1),false);
        assertEquals(p1.fight(r1),true);
        assertEquals(r1.fight(p1),false);
        assertEquals(r1.fight(s1),true);
        assertEquals(s1.fight(r1),false);
    }


}