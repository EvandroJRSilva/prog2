package prog2.aula01;

public class MetodosSobrecarregados {

	public static void main(String[] args) 
	{
		//Arrays de Integer, Double e Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'O', 'L', 'A', 'R'};
        
        System.out.println("Array de inteiros:");
        printArray(integerArray);
        System.out.println("\nArray de double:");
        printArray(doubleArray);
        System.out.println("\nArray de char:");
        printArray(charArray);
	}
	
	//printArray para Integer
    public static void printArray(Integer[] inputArray)
    {
        for(Integer inteiro : inputArray)
            System.out.printf("%s ", inteiro);
            
        System.out.println();
    }
    
  //printArray para Double
    public static void printArray(Double[] inputArray)
    {
        for(Double real : inputArray)
            System.out.printf("%s ", real);
            
        System.out.println();
    }
    
  //printArray para Character
    public static void printArray(Character[] inputArray)
    {
        for(Character caraquitere : inputArray)
            System.out.printf("%s ", caraquitere);
            
        System.out.println();
    }
}
