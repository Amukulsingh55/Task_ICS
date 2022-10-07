package com.infinite.code;
import java.util.*;


public class SetExample {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<String>(); // Creating HashSet
        // Create HashSet
        food.add("Pasta"); // Add elements to the hash set
        food.add("Noodles");
        food.add("Sandwich");
        food.add("Pasta");
        food.add("Burger");
        food.add("Noodles");
        for (String tempFood : food) {
            System.out.println(tempFood);
        }
        //creating Iterator object using iterator() method
        Iterator<String> iterator = food.iterator();
//using hasNext() method to find if next element is present
        while(iterator.hasNext()) {
            //using next() method to get the next element
            System.out.println(iterator.next());
        }

        System.out.println("===========================");
        // Creating HashSet
        HashSet<String> food1 = new HashSet<String>();
//Creating List
        List<String> foodList = new ArrayList<String>();
        foodList.add("Pasta");
        foodList.add("Noodles");
        foodList.add("Sandwich");
        foodList.add("Sandwich");
        System.out.println(foodList);
// Add elements to the hashset from list
        food1.addAll(foodList);
        for (String tempFood : food1) {
            System.out.println(tempFood);
        }


    }
}

class User implements Comparable<User> {
    String username;
    String password;
    String email;

    int id;

    public User(String username, String password, String email, int id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, email);
    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("Max", "fgc123", "max@hnd.com",1));
        userList.add(new User("Mike", "hdgsh@", "imike@hndcom",8));
        userList.add(new User("John", "ucantseeme", "jojo@hnd.com",3));
        userList.add(new User("Moby", "fgc123", "iammoby@ hnd.com",5));
        userList.add(new User("Moby", "fgc123", "iammoby@ hnd.com",7));
        System.out.println("==="+userList);
        // creating user set from list
        Set<User> userSet = new LinkedHashSet<User>();
        userSet.addAll(userList);
        System.out.println("===============================");
        //printing all users
        for (User user : userSet) {
            System.out.println("user = "+user);
        }
        System.out.println("---------------------------------------------------------------------------------");

        TreeSet<User> users = new TreeSet<User>();
        users.add(new User("Max", "fgc123", "max@hnd.com",1));
        users.add(new User("Mike", "hdgsh@", "imike@hndcom",8));
        users.add(new User("John", "ucantseeme", "jojo@hnd.com",3));
        users.add(new User("Moby", "fgc123", "iammoby@ hnd.com",5));
        users.add(new User("Moby", "fgc123", "iammoby@ hnd.com",7));
        System.out.println("TreeSet with compareTo Method= "+users);
        System.out.println("--------------------------------------------------------------------------------");
        TreeSet<User> userss = new TreeSet<User>(new NameComparator1());
        userss.add(new User("Mss","fgc123", "max@hnd.com",1));
        userss.add(new User("Mike", "hdgsh@", "imike@hndcom",8));
        userss.add(new User("John", "ucantseeme", "jojo@hnd.com",3));
        userss.add(new User("Moby", "fgc123", "iammoby@ hnd.com",5));
        userss.add(new User("Moby", "fgc123", "iammoby@ hnd.com",7));
        System.out.println("TreeSet with custom NameCompare class = "+userss);
        System.out.println("-------------------------------------------------------------------------------");

        TreeSet<User> u = new TreeSet<User>(new IdComparator1());
        u.add(new User("Max", "fgc123", "max@hnd.com",1));
        u.add(new User("Mike", "hdgsh@", "imike@hndcom",8));
        u.add(new User("John", "ucantseeme", "jojo@hnd.com",3));
        u.add(new User("Moby", "fgc123", "iammoby@ hnd.com",5));
        u.add(new User("Moby", "fgc123", "iammoby@ hnd.com",7));
        System.out.println("TreeSet with custom IdCompare class = "+u);
    }



    @Override
    public int compareTo(User o) {
        return username.compareTo(o.username);
    }
}

class NameComparator1 implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.username.compareTo(o2.username);
    }
}
class IdComparator1 implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.id == o2.id)
            return 0;
        else if (o1.id > o2.id) {
            return 1;
        } else
            return -1;
    }
}