import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Gorgeous\\nchome\\freemarker.dat"));
		HashMap<String, Object> readObject = (HashMap<String, Object>) ois.readObject();
		ois.close();
		System.out.println(readObject);
		System.out.println("Hello World");
	}

}
