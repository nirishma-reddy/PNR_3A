public class MainClass
{
public static <E> void printArray(E[] inputArray)
{
for(E element : inputArray)
System.out.printf("%s",element);
System.out.println();
}
public static void main(String args[])
{
Integer[] integerArray = {7,7,7,7,7};
Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
Character[] characterArray = {'N','I','R','I','S','H','M','A'};
System.out.println("Array integerArray contains:");
printArray(integerArray);
System.out.println("\nArray doubleArray contains:");
printArray(doubleArray);
System.out.println("\nArary characterArray contains:");
printArray(characterArray);
}
}