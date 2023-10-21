import java.io.FileWriter;
import java.io.IOException;

public class Poem {
    private String name;
    private String poet;

    public Poem() {

        name = "unknown";
        poet = "unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoet() {
        return poet;
    }

    public void setPoet(String poet) {
        this.poet = poet;
    }

    @Override
    public String toString() {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }

    public static void main(String[] args) {
        Poem p1 = new Poem();
        Poem p2 = new Poem();
        Poem p3 = new Poem();

        try {
            FileWriter file = new FileWriter("poem.txt");
            file.write(p1.getName()+"\n"+p1.getPoet()+"\n"+"\n");
            file.write(p2.getName()+"\n"+p2.getPoet()+"\n"+"\n");
            file.write(p3.getName()+"\n"+p3.getPoet()+"\n"+"\n");
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}