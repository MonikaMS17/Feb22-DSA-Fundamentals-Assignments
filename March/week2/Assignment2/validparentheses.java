class parentheses {
public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    
    char[] charr = s.toCharArray();
    
    for(char a : charr){
        if(a == '{' || a == '(' || a == '['){
            stack.push(a);
            continue;
        }
        
        if(stack.isEmpty()){
            return false;
        }
        else{
            if(a == '}' && (stack.peek() == '[' || stack.peek() == '(')){
                return false;
            } 
            else if(a == ')' && (stack.peek() == '{' || stack.peek() == '[')){
                return false;
            }
            else if(a == ']' && (stack.peek() == '{' || stack.peek() == '(')){
                return false;
            }
            
            stack.pop();
        }
    }
    return stack.isEmpty() ? true : false;
}
}
