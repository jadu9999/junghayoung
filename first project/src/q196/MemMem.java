package q196;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
      
       List<Member> members = new ArrayList();
       Member min = new Member();
       min.setName("힣");
       
       for(int i =0 ; i < 3; i++) {
          Member member = new  Member();
          member.setName(sc.next()); 
          
          member.setTel(sc.next());
          
          member.setAddr(sc.next());
          
          members.add(member);747441
       }
              
       for(int i =0; i< members.size(); i++) {
         if(min.getName().compareTo(members.get(i).getName()) > 0) {
            min = members.get(i);
         }
       }
       
       System.out.println(min);
       
   }    
}
