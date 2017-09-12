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
        
        for(int i = 0; i< input.length(); i++)
        {
            char currentChar = input.charAt(i);

            if(currentChar == '(')
            {
                stack.push(currentChar);
                System.out.println("STACK TEST 61: " + stack.toString());//TEST
            }
            
            else if(currentChar == ')')
            {
                System.out.println("Right Paren OUTPUT:" + output + " line 65");
                while(stack.peek() != '(')
                {
                    char temp = stack.pop();
                    output.append(temp);
                    System.out.println("Right Paren w/friend in stack OUTPUT:" + output + " line 69");//TEST                
                }
                stack.pop();
                
            }
            else if (isOperand(currentChar))
            {
                output.append(currentChar);
                System.out.println("isOperand output: " + output); //For testing
            }
            //make sure stack is not empty and top is not parenthesis
            else if(isOperator(currentChar))
            {
                //pop any operators with higher or equal precidence before continuing. 
                
                while (!stack.isEmpty() &&
                    isOperator(stack.peek()) &&
                    precedenceOrder(currentChar) <= precedenceOrder(stack.peek()))                   
                {
                        char temp = stack.pop();                                                         // therefore will be taken from stack with this    
                        output.append(temp); 
                        System.out.println("Precedence evaluated");
                }
                stack.push(currentChar);
                System.out.println("isOperator stack view: " + stack.toString());
            }
        }//for
        //POP AND PRINT UNTIL EMPTY
        while(!stack.isEmpty())
        {
            char temp = stack.pop();
            output.append(temp);
        }
        
        System.out.println(output);    
    }//main
}//class















