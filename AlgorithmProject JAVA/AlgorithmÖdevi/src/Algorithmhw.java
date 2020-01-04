import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Algorithmhw {
	public static void main(String[] args) throws IOException {

		String file1 = "names.txt";
		AVLTree avlt = new AVLTree();

		String line = "";
		BufferedReader reader = new BufferedReader(new FileReader(file1));
		while ((line = reader.readLine()) != null) {
			avlt.insert(line);
		}
		reader.close();

		// contains(Object)method that is used to check if a particular element is
		// present in the queue, have leaner time complexity i.e. O(n).
		double startTime = System.nanoTime();
		if (avlt.search("Ali")) {
			double endTime = System.nanoTime();
			double result = endTime - startTime;
			System.out.println("AVLTree contains name \"Ali\"");
			System.out.println("Search time: " + result / 1000000 + " milliSeconds");
		}
		
		// ************************************************************************************************************************************
		// heap oluþturuldu.
		PriorityQueue<String> heap = new PriorityQueue<String>();

		BufferedReader reader2 = new BufferedReader(new FileReader(file1));
		while ((line = reader2.readLine()) !=null) {
			heap.add(line);
		}
		reader2.close();

		/*
		 * Iterator<String> itr = heap.iterator(); while (itr.hasNext())
		 * System.out.println(itr.next());
		 */

		// contains(Object)method that is used to check if a particular element is
		// present in the queue, have leaner time complexity i.e. O(n).
		startTime = System.nanoTime();
		if (heap.contains("Ali")) {
			double endTime = System.nanoTime();
			double result = endTime - startTime;
			System.out.println("\nHeap contains name \"Ali\"");
			System.out.println("Search time: " + result / 1000000 + " milliSeconds");
		}
	}
}