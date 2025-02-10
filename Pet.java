//
public class Pet{
    //private data fields
    private String name;
    //public constructors
    public Pet(){
        this.setName("Pet name");
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    //print out info
    public String toString(){
        String output = "Pet Information: ";
        output += "\nName: ";
        output += this.getName();
        return output;
    }

//main
public static void main(String[] args){
    //instantiate pet objects
    Pet myPet = new Pet();
    System.out.println(myPet.toString());
    //second pet instance
    Pet myPet2 = new Pet();
    myPet2.setName("Princess");
    System.out.println(myPet2.toString());
}
}