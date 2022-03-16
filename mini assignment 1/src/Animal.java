public class Animal {

    public static void main(String[] args) {
        Animals Whale = new Animals();
        Animals cow = new Animals();


        Whale.setName("PET");
        Whale.setLegs(0);
        Whale.setWeight(400);

        cow.setName("mammal");
        cow.setLegs(4);
        cow.setWeight(80);

        System.out.println(Whale.getName()  + "has got "+ Whale.getLegs() + " and has "+ Whale.getWeight() + " weight.");
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
