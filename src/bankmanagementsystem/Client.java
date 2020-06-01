/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

/**
 *
 * @author 136-fkhoubsirat
 */
public class Client {

    private static String firstName;
    private static String lastName;
    private static String phoneNum;
    private static String address;
    private static String sinNum;
    private static String email;
    private static String postalCode;
    private static String city;

    public void addClient(String cFirstName, String cLastName, String cPhoneNum, String cAddress, String cSinNum, String cEmail, String cPostalCode, String cCity) {
        firstName = cFirstName;
        lastName = cLastName;
        phoneNum = cPhoneNum;
        address = cAddress;
        sinNum = cSinNum;
        email = cEmail;
        postalCode = cPostalCode;
        city = cCity;

    }

    public String changeFirstName(String new1) {

        firstName = new1;
        return firstName;

    }

    public String changeLastName(String new2) {

        lastName = new2;
        return lastName;
    }

    public String changePhoneNumber(String new3) {

        phoneNum = new3;
        return phoneNum;
    }

    public String changeAddress(String new4) {

        address = new4;
        return address;
    }

    public String changeSin(String new5) {

        sinNum = new5;
        return sinNum;
    }

    public String changeEmailAddress(String new6) {

        email = new6;
        return email;
    }

    public String changeCity(String new7) {

        city = new7;
        return city;
    }

    public String changepostalCode(String new8) {

        postalCode = new8;
        return postalCode;
    }

    public String showClientInfo() {
        return firstName + "\n" + lastName + "\n" + phoneNum + "\n" + address + "\n" + email + "\n" + postalCode + "\n" + city;
    }

    public void deleteAccount() {
        System.out.println("your account has been deleted.");
        firstName = "";
        lastName = "";
        phoneNum = "";
        address = "";
        sinNum = "";
        email = "";
        postalCode = "";
        city = "";
    }
}
