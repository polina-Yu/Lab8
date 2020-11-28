package lab7;

public class MyClass {

    public  String name;
    public  String type;
    public  String color;
    public  int size;

    public MyClass(String name, String type, String color, int size) {
        this.name = name;
        this.type = type;
        this.name = name;
        
        this.size = size;
    }

    @Override
    public String toString() {
        String str = "Имя: " + this.name + "\tТип: " + this.type + "\tЦвет: " + this.color + "\tВозраст: " + this.size + "\n";
        return str;
    }
    
    // Без методов equals и hashCode не будет замены в списках
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyClass other = (MyClass) obj;
        if ((this.toString() == null) ? (other.toString() != null) : !this.toString().equals(other.toString())) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.toString() != null ? this.toString().hashCode() : 0);
        return hash;
    }
}