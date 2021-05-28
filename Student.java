
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Student{
    private int id;
    private String name;
    private Date dateofbirth;
    private String telephoneNumber ;
    private String  city;
    private String country;
    private String group;
    private Student(){

    }
    public static Student dataInput() throws Exception{
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Input Id");
        student.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Input name:");
        student.setName(sc.nextLine());
        System.out.println("Input city:");
        student.setCity(sc.nextLine());
        System.out.println("Input Country:");
        student.setCountry(sc.nextLine());
        System.out.println("Input Telephone:");
        student.setTelephoneNumber(sc.nextLine());
        System.out.println("Input Date's name(dd/mm/yyyy):");
        Date d =  new SimpleDateFormat("dd/MM/YYYY").parse(sc.nextLine());
        student.setDateofbirth(d);
        System.out.println("Input group's name:");
        student.setGroup(sc.nextLine());
        return student;

    }
        /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Date return the dateofbirth
     */
    public Date getDateofbirth() {
        return dateofbirth;
    }

    /**
     * @param dateofbirth the dateofbirth to set
     */
    public void setDateofbirth(Date dateofbirth) throws  BithDateExeption{
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,cal.get(Calendar.YEAR)-15);
        Date fifteenYearsOld = cal.getTime();
        if(dateofbirth.compareTo(fifteenYearsOld)<=0){
            this.dateofbirth = dateofbirth;
        }else throw new  BithDateExeption();
    }

    /**
     * @return String return the telephoneNumber
     */
    public String getTelephoneNumber() {
   

        return telephoneNumber;
    }

    /**
     * @param telephoneNumber the telephoneNumber to set
     */
    public void setTelephoneNumber(String telephoneNumber) throws PhoneNumberExeption {
        Pattern pattern = Pattern.compile("^(\\+855|0)[0-9]{8,9}$");
        Matcher matcher = pattern.matcher(telephoneNumber);
        boolean matchFound = matcher.find();
        if(matchFound){
            this.telephoneNumber = telephoneNumber;
        }else throw new PhoneNumberExeption();
    }


    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return Group return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) throws GroupException{
        Pattern pattern = Pattern.compile("(I[1-5]|T[1-2])[A-Z]{1,2}$");
        Matcher match = pattern.matcher(group);
        boolean matchFound = match.find();
        if(matchFound){
            this.group = group;
        }else{
            throw new GroupException();
        }
    }

}

class BithDateExeption extends Exception{
    public BithDateExeption(){
        super("Invalid date of birth");
    }
}
class PhoneNumberExeption extends Exception{
    public PhoneNumberExeption(){
        super("Invalid telephone");
    }
}
class GroupException extends Exception{
    public GroupException(){
        super("Group Invalid");
    }
}
class Main{
    public static void main(String[] args) throws Exception {
        Student student = Student.dataInput();
    
    }
}
