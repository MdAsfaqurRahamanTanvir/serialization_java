import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
	 
		System.out.println("Writing Object!!");
		
		Person person=new Person(47,"Tanvir");
		Person person1=new Person(48,"Shorker");
		
		System.out.println(person);
		System.out.println(person1);
		
		try(FileOutputStream fs=new FileOutputStream("people.bin"))
		{ 
			
			ObjectOutputStream os=new ObjectOutputStream(fs);
			
			os.writeObject(person);
			os.writeObject(person1);
			
			os.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
