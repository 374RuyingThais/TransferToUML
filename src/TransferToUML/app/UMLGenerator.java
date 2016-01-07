package TransferToUML.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

<<<<<<< HEAD
public class UMLGenerator {
	
	private String fileName;
=======
<<<<<<< HEAD

public class UMLGenerator {
	String fileName;
=======
public class UMLGenerator {
	
	private String fileName;
>>>>>>> origin/master
>>>>>>> master

	public UMLGenerator(String fileName) {
		this.fileName = fileName;
	}

	public void execute() {
		try {
<<<<<<< HEAD
			String f = new File("src\\input_output\\UML.txt").getAbsoluteFile().getPath();
			String y = "src\\input_output\\" + this.fileName + ".png";
=======
<<<<<<< HEAD
			String f = new File("src\\Test\\UML.txt").getAbsoluteFile().getPath();
			String y = "src\\Test\\" + this.fileName + ".png";
=======
			String f = new File("src\\input_output\\UML.txt").getAbsoluteFile().getPath();
			String y = "src\\input_output\\" + this.fileName + ".png";
>>>>>>> origin/master
>>>>>>> master
			String z = new File(y).getAbsoluteFile().getPath();
			String path = "\"C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot\" -Tpng " + "\"" + f + "\"";
			Process p = Runtime.getRuntime().exec(path);
			InputStream inputStream = p.getInputStream();
			@SuppressWarnings("resource")
			OutputStream outputStream = new FileOutputStream(new File(z));
			int read = 0;
			byte[] bytes = new byte[1024];
			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> origin/master
>>>>>>> master
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
<<<<<<< HEAD
		UMLGenerator unifier = new UMLGenerator("example");
=======
<<<<<<< HEAD
		UMLGenerator unifier = new UMLGenerator("milestone1-test");
=======
		UMLGenerator unifier = new UMLGenerator("example");
>>>>>>> origin/master
>>>>>>> master
		unifier.execute();
	}
}
