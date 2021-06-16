import java.util.ArrayList;

public class PhoneBook extends Phone{
    String name;
    String phone;

    ArrayList<PhoneBook> PhoneList = new ArrayList<>();

    public PhoneBook() {
    }

    public PhoneBook(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    void insertPhone(String name, String phone) {
        for (PhoneBook ten : PhoneList){
            if (ten.getName().equals(name)){
                if(!ten.getPhone().equals(phone)){
                    ten.setPhone(phone);
                    return;
                }
                return;
            }
        }
    PhoneList.add(new PhoneBook(name, phone));
    }

    @Override
    void removePhone(String name) {
        for (PhoneBook ten : PhoneList){
            if(ten.getName().equals(name)){
                PhoneList.remove(ten);
            }
        }
    }

    @Override
    void updatePhone(String name, String newphone) {
        for (PhoneBook ten : PhoneList){
            if(ten.getName().equals(name)){
                ten.setPhone(newphone);
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (PhoneBook ten : PhoneList){
            if(ten.getName().equals(name)){
                System.out.println(ten.getPhone());
            }
        }
    }

    public void show(){
        for (PhoneBook ten : PhoneList){
            System.out.println(ten);
        }
    }
    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    void sort() {

    }
}
