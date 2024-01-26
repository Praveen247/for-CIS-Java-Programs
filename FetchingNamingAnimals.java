public class FetchingNamingAnimals {
    public static void main(String[] args) {
        Animal elphant=new Animal("Black","Tomcat", 13, 25);

   elphant.biodata();
Animal Girafee=new Animal("Yellow","giraff",10,60);
Girafee.biodata();
    }
}
class Animal{
    String color;
    String name;
    int age;
    float weight;

    public Animal(String color, String name, int age, float weight) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void biodata(){

        System.out.println("Name of the Animal:"+name);
        System.out.println("Age of the Animal:"+age);
        System.out.println("Color of the Animal:"+color);
        System.out.println("Weight of the Animal:"+weight);
    }
}