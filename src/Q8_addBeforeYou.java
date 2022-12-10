import java.io.*;
import java.util.*;

public class Q8_addBeforeYou {
    //method to add name after given name in stack
    public static void addBeforeYou(Stack<String> stack, String name, String toBeAdded)
    {
        if(stack.peek().compareTo(name)==0)
        {
            //split the names
            String[] names = toBeAdded.split(System.lineSeparator());

            //push the new name
            stack.push(names[0]);

            //push the remaing name
            for(int i=names.length-1; i>0; i--)
                stack.push(names[i]);

            return;
        }

        //add all popped name after new name
        toBeAdded = toBeAdded + "\n"+stack.pop();
        addBeforeYou(stack, name, toBeAdded);
    }

    public static void main(String[] args) {
        //create stack
        Stack<String> stack = new Stack<String>();

        //method calling to push onto stack
        stack.push("John");
        stack.push("Jane");
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Sue");
        stack.push("Jack");

        //method calling
        addBeforeYou(stack, "Bob", "Ali");

        //display the new stack
        System.out.println("The stack is: ");
        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
