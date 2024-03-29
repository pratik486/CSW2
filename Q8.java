import java.util.HashSet;

public class Q8 
{
	static void Union(int arr1[], int arr2[]) 
	{
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr1.length; i++)
			hs.add(arr1[i]);
		for (int i = 0; i < arr2.length; i++)
			hs.add(arr2[i]);
		System.out.println(hs);
	}

	static void Intersect(int arr1[], int arr2[]) 
	{
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr1.length; i++)
			hs.add(arr1[i]);

		for (int i = 0; i < arr2.length; i++)
			if (hs.contains(arr2[i]))
				System.out.print(arr2[i] + " ");
	}

	public static void main(String[] args) 
	{
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };

		System.out.print("Union of two arrays is : ");
		Union(arr1, arr2);
		System.out.println("\n");
		System.out.print("Intersection of two arrays is : ");
		Intersect(arr1, arr2);
	}
}