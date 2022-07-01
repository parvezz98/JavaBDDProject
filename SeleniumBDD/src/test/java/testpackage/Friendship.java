package testpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Friendship {

    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them "friends" of each other.
    //
    // Note: The order of names does not matter
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    public String [] Friendstr= new String[2];
    public String [] NotFrndstr2= new String[2];
    public void makeFriend(String nameKey, String friendName) {
        System.out.println(nameKey+" is friend of "+friendName);
        Friendstr[0]=nameKey;
        Friendstr[1]=friendName;
    }


    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them no longer friends of each other.
    //
    // Note: The order of names does not matter
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    public void unmakeFriend(String nameKey, String friendName) {
        System.out.println(nameKey+" is not friend of "+friendName);
        NotFrndstr2[0]=nameKey;
        NotFrndstr2[1]=friendName;
        //HashMap<String, String> unmakef= new HashMap<>();
     //   unmakef.put(nameKey,friendName);

    }


    // This is for you to implement
    //
    // This method takes a single argument (name) and
    // returns all immediate "friends" of that name
    //
    // For example, A & B are friends, B & C are friends, and C & D are friends.
    // getDirectFriends(B) would return A and C
    // getDirectFriends(D) would return C
    //
    // Note: It should not return duplicate names
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    public List<String> getDirectFriends(String nameKey) {
        List<String> lst= new ArrayList<String>();
       if(Arrays.asList(Friendstr).contains(nameKey)==true){

           if(Friendstr[0]==nameKey){
               lst.add(Friendstr[1]);
           }
           else{
               lst.add(Friendstr[0]);
           }
       }

           return lst;
    }


    // This is for you to implement (Seniors and above)
    //
    // This method takes a single argument (name) and
    // returns all the indirect "friends" of that name
    //
    // For example, A & B are friends, B & C are friends, and C & D are friends.
    // getInirectFriends(A) would return C and D
    //
    // Note: It should not return duplicate names
    // Note: Do not forget to write tests to have good test coverage for this
    // method

    public List<String> getIndirectFriends(String nameKey) {
        return null;
    }

}
