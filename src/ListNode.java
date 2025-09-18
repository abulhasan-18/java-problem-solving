public class ListNode {
    int val;
    ListNode next;
    
    // Constructors
    ListNode() {}
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val;
        this.next = next;
    }
}

class AddNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String alpha = "";
        String beta = "";

        for (ListNode current = l1; current != null; current = current.next) {
            alpha += current.val; 
        }

        
        for (ListNode current = l2; current != null; current = current.next) {
            beta += current.val; 
        }

        StringBuilder sb = new StringBuilder(alpha);
        alpha  = sb.reverse().toString();

        sb = new StringBuilder(beta);
        beta  = sb.reverse().toString();
      
        System.out.println("First number (alpha): " + alpha);
        System.out.println("Second number (beta): " + beta);

  
        int number1 = Integer.parseInt(alpha);
        int number2 = Integer.parseInt(beta);

     
        int sum = number1 + number2;

        
        System.out.println("Sum: " + sum);

       
        String resultString = String.valueOf(sum);

        int length = resultString.length();

        System.out.println(length);


      // Initialize a result linked list
      ListNode resultNode = null;
      ListNode current = null;

      // Traverse the result string in reverse order
      for (int i = resultString.length() - 1; i >= 0; i--) {
          int digit = Integer.parseInt(String.valueOf(resultString.charAt(i)));

          // Create a new node for each digit
          ListNode newNode = new ListNode(digit);

          // If this is the first node, set it as the resultNode
          if (resultNode == null) {
              resultNode = newNode;
              current = newNode;
          } else {
              // Link the new node to the current list
              current.next = newNode;
              current = newNode;
          }
      }

      // Return the head of the resultant linked list
      return resultNode;
  }




     

    // Main method to test the addTwoNumbers method
    public static void main(String[] args) {
        // Create the first list (l1) representing the number 342 (stored as 2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);

        // Create the second list (l2) representing the number 465 (stored as 5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next   = new ListNode(9);

        // Create an instance of AddNumber and call addTwoNumbers
        AddNumber adder = new AddNumber();
        ListNode result = adder.addTwoNumbers(l1, l2);

        System.out.print("Resultant linked list: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
        System.out.println();

        // For now, we are only printing the values
        // Later, you can modify this to handle the addition logic and return the result
    }
}
