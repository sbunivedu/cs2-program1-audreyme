Public Class InfixPostfixTester
{
    Public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        CharStack stack = new CharStack();
        
        System.out.print("Please enter infix notation: ");
        String input = scan.nextLine();
        
        for (int i = 0; i< input.length; i++;)
        {
            if(input.charAt(i) == '('')
            {
                //take it and put it in the stack
            }
            else if (input.charAt(i) == ')')
            {
                //pop operator out into output
                //get rid of left paren in stack
            }
            else if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/' || input.charAt(i) == '%')
            {
                //put it in stack to wait until operand2 is printed
            }
            else //number
            {
                //write number to output
            }
        }
    }//main
}//class