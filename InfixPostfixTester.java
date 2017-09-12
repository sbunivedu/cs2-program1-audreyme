import java.util.Scanner;
public class InfixPostfixTester
{
       public static boolean isOperand(char c)
       {
        if(
          (c>='a' && c<='z') ||
          (c>='A' && c<='Z') ||
          (c>='0' && c<='9'))
          {
            return true;
          }
          else
          {
            return false;
          }
        }
    
      public static boolean isOperator(char c)
      {
        if (c=='+' || c=='-' || c=='*' || c=='/')
        {
          return true;
        }
        else
        {
          return false;
        }  
      }
      
    public static int precedenceOrder(char c)
    {
        if(c == '*' || c == '/' )
        {
          return 3;
        }
        else if (c == '+' || c == '-')
        {
          return 2;
        }
        else
            return 1;
    }
    
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        CharStack stack = new CharStack(); 
        
        System.out.print("Please enter infix notation: ");
        String input = scan.nextLine();
        StringBuffer output = new StringBuffer(input.length());
        
        System.out.println(input);//for testing
        
        for(int i = 0; i< input.length(); i++)
        {
            char currentChar = input.charAt(i);

            if(currentChar == '(')
            {
                stack.push(currentChar);
            }
            
            else if(currentChar == ')')
            {
                while(stack.peek() != '(');
                {
                    char temp = stack.pop();
                    output.append(temp);
                }
                stack.pop();
            }
            else if (isOperand(currentChar))
            {
                output.append(currentChar);
                System.out.println(output); //For testing
            }
            //make sure stack is not empty and top is not parenthesis
            else if(isOperator(currentChar))
            {
                //pop any operators with higher or equal precidence before continuing. 
                while (!stack.isEmpty())                                                                 // I changed the precedenceOrder function sightly
                {                                                                                        // so that parentheses and digits are less and 
                    if(precedenceOrder(currentChar) <= precedenceOrder(stack.peek()))                   
                    {
                        char temp = stack.pop();                                                         // therefore will be taken from stack with this    
                        output.append(temp); 
                    }
                }//check for operators with a higher or equal precedence and pop them to output.
                
                stack.push(currentChar);
            }
            
        }//for
        System.out.println(output);    
    }//main
}//class