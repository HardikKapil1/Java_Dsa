public class HashSet {
    public static void main(String[] args) {
        // Creating a HashSet to store unique elements
        java.util.HashSet<Integer> set = new java.util.HashSet<>();     
        // Adding elements to the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        // Attempting to add a duplicate element
        set.add(3);
        // Printing the elements of the HashSet
        System.out.println("The elements in the HashSet are: " + set);
        // Checking if an element exists in the HashSet
        if (set.contains(3)) {
            System.out.println("The HashSet contains the element 3.");
        } else {
            System.out.println("The HashSet does not contain the element 3.");
        }
        // Removing an element from the HashSet
        set.remove(2);  
        System.out.println("After removing 2, the HashSet contains: " + set);
        // Checking the size of the HashSet
        System.out.println("The size of the HashSet is: " + set.size());
    }   

}
