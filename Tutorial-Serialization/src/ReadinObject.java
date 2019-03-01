import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadinObject {
	public static void main(String [] args)
	{ 
		System.out.println("Reading Object");
		
		try(FileInputStream fs=new FileInputStream("people.bin"))
		{ 
			
			ObjectInputStream os=new ObjectInputStream(fs);
			
			Person ps=(Person)os.readObject();
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
