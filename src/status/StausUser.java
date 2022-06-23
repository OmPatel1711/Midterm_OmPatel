/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
enum user {zero,one,two,three};

public class StausUser 
{
   public void statusDetail(String code)
{
    user v = user.valueOf(code.toUpperCase());
 switch(v)
        {
        case ZERO : ;
        break;
        case ONE : System.out.println("PENDING");
        break;
        case TWO :
        System.out.println("PROCESSING");
        break;
        case THREE: 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
