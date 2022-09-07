package prog2.aula01;

public class Genericudo 
{
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
	
	/*===================1===================*/
	//Agora o método genericão
//	public static <T> void printArray(T[] inputArray)
//	{
//		for(T genericoso : inputArray)
//			System.out.printf("%s ", genericoso);
//		
//		System.out.println();
//	}
	// Erasure
	
	/*===================1.2===================*/
	// OU podemos fazer o seguinte:
	public static void printArray(Object[] inputArray)
	{
		for(Object generiquese : inputArray)
			System.out.printf("%s ", generiquese);
		
		System.out.println();
	}
	//Isso porque, por padrão, todo tipo genérico é transformado para Object
}
