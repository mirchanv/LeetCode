class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(' || currChar == '[' || currChar == '{') {
                myStack.push(currChar);
                continue;
            }

            if (!myStack.isEmpty()) {
                switch(currChar) {
                    case ')':
                        if (myStack.pop() != '(') 
                            return false;
                        break;
                    
                    case ']':
                        if (myStack.pop() != '[') 
                            return false;
                        break;

                    case '}':
                        if (myStack.pop() != '{') 
                            return false;
                        break;
                }
            } else {
                return false;
            }
        }

        if (myStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}