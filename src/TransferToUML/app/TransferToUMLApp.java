package TransferToUML.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import TransferToUML.impl.UMLTransferOutputStream;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;
import problem.asm.ClassDeclarationVisitor;
import problem.asm.ClassFieldVisitor;
import problem.asm.ClassMethodVisitor;
import problem.asm.DesignParser;

public class TransferToUMLApp {

	public static void main(String[] args) throws IOException {

		String[] classes = { "problem.asm.Animal", "problem.asm.AbstractCat", "problem.asm.BombayCat" };

		DesignParser parser = new DesignParser();
		parser.main(classes);

		OutputStream out = new FileOutputStream("input_output/UML.txt");
		IVisitor writer = new UMLTransferOutputStream(out);
		//ITraverser traverser = (ITraverser) parser.model;
		
		String title = "example";
		out.write("digraph ".getBytes());
		out.write(title.getBytes());
		out.write(" { rankdir=BT;".getBytes());
		//traverser.accept(writer);
		out.write("}".getBytes());
		out.close();
		UMLGenerator g = new UMLGenerator(title);
		g.execute();

	}

}
