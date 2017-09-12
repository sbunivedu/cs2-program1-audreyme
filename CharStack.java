public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack()
  {
    //PRE: n/a
    //POS: New CharStack is implemented
    //TAS: Create an empty stack with a default capacity
    
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element)
  {
    //PRE: Stack is not at max capacity
    //POS: top incremented, stack has another element
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }

  public char pop ()
  {
    //PRE: Stack is a non-empty
    //POS: Decrement top by one, top item returned
    //TAS: remove and return the item on the top of the stack
    char result = s[top]; //so the "top" value will stay the same.
    top--;
    return result; 
  }

  public boolean isEmpty()
  {
    //PRE: there is a stack
    //POS: returns state of stack
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
    if (top == -1){
      return true;
    }
    else 
      return false;
  }
  public boolean isFull(){
    //PRE: There is a stack.
    //POS: Returns state of stack
    //TAS: return whether or not the stack is full
    return top == MAX_CAP-1;
  }
  
  public char peek()
  {
    //PRE: There is a stack & there is at least 1 element.
    //POS: Returns top element of stack. 
    //TAS: return the top element of stack so viewer can see it.
    return s[top];
  }  
  //COMPLETE???  
  public String toString()
  {
      //PRE: There is a stack and it has at least one element
      //POS: Returns string of stack elements
      //TAS: Return stack contents left to right
      String result = "";
      
      for(int i = 0; i < top + 1; i++)
      {
        result += s[i] + " ";
      }
      
      return result;
  } 
  public static boolean isOperand(char c)
   {
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
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
      return 2;
    }
    else 
    {
      return 1;
    }
  }  
}//class