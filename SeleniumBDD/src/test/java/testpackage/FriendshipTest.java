package testpackage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class FriendshipTest {

	 public static void main(String []args){
	        Friendship friendship = new Friendship();
	        friendship.makeFriend("Aaron", "Bella");

	        ArrayList<String> expected = new ArrayList<String>();
	        expected.add("Bella");
	       
	      //  assertResults(expected, friendship.getDirectFriends("Aaron"));
	 }
}
