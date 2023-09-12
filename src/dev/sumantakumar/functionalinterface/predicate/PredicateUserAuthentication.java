package dev.sumantakumar.functionalinterface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    protected String userName;
    protected String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class PredicateUserAuthentication {
    public static void main(String[] args) {
        Predicate<User> userPredicate = user -> user.userName.equals(user.password);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name");
        String username = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();

        User user = new User(username, password);

        if(userPredicate.test(user)){
            System.out.println("Valid User");
        }else{
            System.out.println("Invalid User. Please login again.");
        }

    }
}
