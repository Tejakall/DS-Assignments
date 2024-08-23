import java.util.Stack;
public class EvaluationPostFix
{
 static int evaluatePostfix(String exp)
 {
 //create a stack
 Stack<Integer> stack = new Stack<>();

 // Scan all characters one by one
 for(int i = 0; i < exp.length(); i++)
 {
 char c = exp.charAt(i);

 if(c == ' ')
 continue;

 // If the scanned character is an operand
 // (number here),extract the number
 // Push it to the stack.
 else if(Character.isDigit(c))
 {
 int n = 0;

 //extract the characters and store it in num
 while(Character.isDigit(c))
 {
 n = n*10 + (int)(c-'0');
 i++;
 c = exp.charAt(i);
 }

 //push the number in stack
 stack.push(n);
 }
