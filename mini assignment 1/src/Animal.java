public class Animal {

    public static void main(String[] args) {
        Animals Whale = new Animals();
        Animals cow = new Animals();
        Animals Dog = new Animals();


        Whale.setName("PET");
        Whale.setLegs(0);
        Whale.setWeight(400);

        cow.setName("mammal");
        cow.setLegs(4);
        cow.setWeight(80);

        Dog.setName("Browny");
        Dog.setLegs(4);
        Dog.setWeight(25);

        System.out.println(Whale.getName()  + " has got "+ Whale.getLegs() + " and has "+ Whale.getWeight() + " weight.");
        System.out.println(cow.getName()  + " has got "+ cow.getLegs() + " and has "+ cow.getWeight() + " weight.");
        System.out.println(Dog.getName()  + " has got "+ Dog.getLegs() + " and has "+ Dog.getWeight() + " weight.");
    }
}

class Animals {
    private String name =" ";
    private int no_of_legs = 0;
    private int weight  = 0;


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getLegs()
    {
        return no_of_legs;
    }
    public void setLegs(int legs)
    {
        this.no_of_legs =legs;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
