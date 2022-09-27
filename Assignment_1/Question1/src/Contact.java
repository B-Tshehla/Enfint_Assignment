import java.util.*;

public class Contact {

    public static ArrayList<Phone> obj = new ArrayList<>();
    // Method create an instance of Contact
    public static Phone createContact(String name, String phone) {
        return new Phone(name, phone);
    }
    //Method Checks is Phone Exist
    public static boolean CheckContact(String name){
        boolean isValue = true;
        if(obj.size() != 0) {
            for (Phone phone : obj) {
                isValue = !name.equals(phone.getName());
            }
        }
        return isValue;
    }
    //Method finds Phone by name
    public static Phone findPhone(String name){

        for (Phone phone : obj) {
            if (name.equals(phone.getName())) {
                return phone;
            }
        }
        return null;
    }
    //Method Adds more numbers
    public static void addMoreNum(Phone contact){
        Scanner inputString = new Scanner(System.in);

        String phoneNum;
        int x = 1;
        System.out.println("Enter phone number "+ x +"( # to Cancel)");
        phoneNum = inputString.nextLine();

       do {
            x++;
            contact.addNum(phoneNum);
            System.out.println("Enter phone number "+ x +"( # When you done)");
            phoneNum = inputString.nextLine();

       } while(!phoneNum.equals("#"));

       System.out.println("Phone number(s) added");
    }

    public static void main(String[] args) {
        //Instantiation of objects

        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);


        //Variable declaration
        int select;
        String name;
        String phone;
        String moreNum;
        Phone searched;
       try{
            System.out.println("Please select Desired operation:\n1- Add a new contact\n2- Find phone by name");
            System.out.println("0- To stop the program");
            select = inputInt.nextInt();

            while (select != 0){
                if(select == 1){
                    System.out.println("Please enter name of the contact");
                    name = inputString.nextLine();
                    if(CheckContact(name)){
                        System.out.println("Please enter phone number of the contact");
                        phone = inputString.nextLine();
                        obj.add(createContact(name,phone));
                        System.out.println("Do you want to add more phone numbers for "+ name +" Enter (Y)/(N)");
                        moreNum = inputString.nextLine();
                        if (moreNum.equals("Y") || moreNum.equals("y")){
                            addMoreNum(Objects.requireNonNull(findPhone(name)));
                        }
                        else{
                            System.out.println("Contact Created");
                        }

                    }

                } else if (select == 2) {
                    System.out.println("Enter the name of the contact you are looking for");
                    name = inputString.nextLine();
                    searched = findPhone(name);
                    if (searched != null) {
                        System.out.println(searched.getName());
                        for (int x = 0;x<searched.getPhone().size();x++){
                            System.out.println(searched.getPhone().get(x));
                        }
                    }
                    else {
                        System.out.println("Phone contact does not exist");
                    }
                }
                System.out.println("Please select Desired operation:\n1- Add a new contact\n2- Find phone by name");
                System.out.println("0- To stop the program");
                select = inputInt.nextInt();
            }
        }catch (InputMismatchException i){
            System.out.println("You entered a character while the expected input was an integer");
        }

    }

}
class Phone {
    private final String name;
    private final ArrayList<String> phoneNum = new ArrayList<>();

    //Initializing the class with a constructor
    Phone(String name , String phone){
        this.name = name;
        this.phoneNum.add(phone);
    }
    // Method to add phone numbers to a contact
    public void addNum(String num){
        this.phoneNum.add(num);
    }
    //Method get a contact name
    public String getName(){
        return this.name;
    }
    //Method get a list of contact phone
    public ArrayList getPhone(){
        return this.phoneNum;
    }
}



