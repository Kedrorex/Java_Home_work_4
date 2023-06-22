package Home_work_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class HJ_1 {
    public static void main(String[] args) {
        Scanner useString = new Scanner(System.in);
        Deque<String> dQ = new LinkedList<>();

        System.out.println("Enter your string, please: ");

        while(true){
            String temp = useString.nextLine().replaceAll(" ", "");
            if (temp.toLowerCase().equals("exit")){
                break;
            } else if (temp.toLowerCase().equals("print")){
                System.out.println(dQ);
            } else if (temp.toLowerCase().equals("revert")){
                if (dQ.size() == 0) {
                    System.err.println("throw new NoSuchElementException");
                    continue;
                }
                System.out.printf("Revert removed element: %s\n", dQ.pollFirst());
            } else if (temp != ""){
                dQ.addFirst(temp);
            }
        }

        useString.close();

    }
    
}
