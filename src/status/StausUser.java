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
    public String  x;
   String  statusDetail(String x  )
{
    user v = user.valueOf(x.toUpperCase());
 switch(x.toUpperCase())
        {
        case "ZERO" : 
            return "REJECTED";
        break;
        case "ONE" : 
            return ("PENDING");
        break;
        case "TWO" :
        return ("PROCESSING");
        break;
        case "THREE": 
            return ("APPROVED");
        break;
        default:
        throw new AssertionError("NOT VALID CODE");
        break;
        }
        return null;
      
}
 
}







 