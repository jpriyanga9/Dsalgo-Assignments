package ArrayList2;

import java.util.ArrayList;

public class ArrayList2 {
public static void main(String[]args) {
		
		ArrayList<String> friends = new ArrayList<String>();
		
		
		friends.add("city1");
		friends.add("city2");
		friends.add("city3");
		friends.add("city4"); 
		friends.add("city5"); 
		System.out.println("Where do your friends live at?");
		System.out.println("My five best friend lives :" );
		for (String str : friends)
            System.out.print(str + ", ");
		
	}

}
