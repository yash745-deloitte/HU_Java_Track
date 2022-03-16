public class Animal {
    Animals Whale = new Animals();
    Animals cow = new Animals();


    Whale.setName("PET");
    Whale.setLegs("0");
    Whale.setWeight("400");

    cow.setName("mammal");
    cow.setLegs("4");
    cow.setWeight("80");

    System.out.println(Whale.getNamed()  + "has got "+ Whale.getLegs + " and has "+ Whale.getWeight + " weight.");
}

class Animals {
    private String animalname =" ";
    private int no_of_legs = 0;
    private int weight  = 0;


    public String getname()
    {
        return this.animalname;
    }
    public void setname(String name)
    {
        this.animalname = name;
    }
    public int getlegs()
    {
        return this.no_of_legs;
    }
    public void setlegs(int legs)
    {
        this.no_of_legs =legs;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weights;
    }
}
