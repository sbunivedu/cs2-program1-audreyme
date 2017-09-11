import java.util.Scanner;
public class InfixPostfixTester
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        CharStack stack = new CharStack(); //UNSURE OF WHY THIS IS AN ISSUE
        String output = "";
        
        System.out.print("Please enter infix notation: ");
        String input = scan.nextLine();
        
        
        for(int i = 0; i< input.length(); i++)
        {
            char currentChar = input.charAt(i);
            System.out.print(currentChar);
           
            
            /*String s = input.charAt(i);
            if(s == '(')
            {
                //take it and put it in the stack
                stack.push(charAt(i));
            }
            
            else if (input.charAt(i) == ')')
            {
                //pop operator out into output
                output = output + " " +(stack.pop()).toString;
                
                //get rid of left paren in stack               
                stack.pop();
            }
            else if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/' || input.charAt(i) == '%')
            {
                //put it in stack to wait until operand2 is printed <--THEN WHAT???
                push(charAt(i));
            }
            else //number
            {
                //write number to output
                output = output + " " + charAt(i).toString;
            }*/
        }
    }//main
}//class