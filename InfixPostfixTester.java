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

            if (isOperator(currentChar))
            {
                output += currentChar;
            }
            
            else if(isOperator(currentChar))
            {
                //pop any operators with higher precidence before continuing. 
                
                while (precedenceOrder(currentChar) < precedenceOrder(stack.peek()) || precedenceOrder(currentChar) == precedenceOrder(stack.peek()))
                {
                    char temp = stack.pop();
                    output = output + temp; 
                }//check for operators with a higher or equal precedence and pop them to output.
                
                stack.push(currentChar);  //End goal for each
            }
            
            else if(currentChar == ')')
            {
                char temp = stack.peek();
                while(temp != '(');
                {
                    temp = stack.pop();
                    output = output + temp;
                    
                }
            }
            
            else if(currentChar == '(')
            {
                stack.push(currentChar);
            }
            
        }
        System.out.print(output);    
    }//main
}//class