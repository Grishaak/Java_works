package Java_seminars.Java_seminar_five;

public class Cat {
    static int count;
    String owner;
    int numPassport;
    String name;
    int age;
    String colour;

    public Cat(String owner, int numPassport, String name, int age, String colour) {
        this.numPassport = count++;
        this.owner = owner;
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    @Override
    public String toString() {

        return "passport:" + numPassport +
                ", owner:" + owner +
                ", name:" + name +
                ", age:" + age +
                ", colour:" + colour;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return numPassport == cat.numPassport && name.equalsIgnoreCase(cat.name) &&
                owner.equalsIgnoreCase(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 7 + numPassport + 13 * owner.hashCode();
    }
}
