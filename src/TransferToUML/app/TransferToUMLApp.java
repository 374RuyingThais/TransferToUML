package TransferToUML.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

<<<<<<< HEAD
import TransferToUML.impl.UMLTransferOutputStream;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;
=======
<<<<<<< HEAD
import TransferToUML.impl.UMLTransferOutputStream;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;
=======
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import TransferToUML.impl.UMLTransferOutputStream;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;
import problem.asm.ClassDeclarationVisitor;
import problem.asm.ClassFieldVisitor;
import problem.asm.ClassMethodVisitor;
>>>>>>> origin/master
>>>>>>> master
import problem.asm.DesignParser;

public class TransferToUMLApp {

	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
		DesignParser parser = new DesignParser();
		String[] classes = {

				"test.animal.Animal",
				"test.animal.AbstrctCat",
				"test.animal.Bonbay"
		};
				
				// "headfirst.observer.weather.CurrentConditionsDisplay",
				// "headfirst.observer.weather.DisplayElement",
				// "headfirst.observer.weather.ForecastDisplay",
				// "headfirst.observer.weather.HeatIndexDisplay",
				// "headfirst.observer.weather.Observer",
				// "headfirst.observer.weather.StatisticsDisplay",
				// "headfirst.observer.weather.Subject",
				// "headfirst.observer.weather.WeatherData",
				// "headfirst.observer.weather.WeatherStation",
				// "headfirst.observer.weather.WeatherStationHeatIndex"
//		};
		
		parser.main(classes);
<<<<<<< HEAD
		OutputStream out = new FileOutputStream("./input_output/UML.txt");
		IVisitor writer = new UMLTransferOutputStream(out);
		ITraverser traverser = (ITraverser) parser.model;
=======
		OutputStream out = new FileOutputStream("input_output/UML.txt");
		IVisitor writer = new UMLTransferOutputStream(out);
		ITraverser traverser = (ITraverser) parser.model;
=======

		String[] classes = { "problem.asm.Animal", "problem.asm.AbstractCat", "problem.asm.BombayCat" };

		DesignParser parser = new DesignParser();
		parser.main(classes);

		OutputStream out = new FileOutputStream("input_output/UML.txt");
		IVisitor writer = new UMLTransferOutputStream(out);
		//ITraverser traverser = (ITraverser) parser.model;
		
>>>>>>> origin/master
>>>>>>> master
		String title = "example";
		out.write("digraph ".getBytes());
		out.write(title.getBytes());
		out.write(" { rankdir=BT;".getBytes());
<<<<<<< HEAD
		traverser.accept(writer);
		out.write("}".getBytes());
		out.close();
		//UMLGenerator g = new UMLGenerator(title);
		//g.execute();
	}
=======
<<<<<<< HEAD
		traverser.accept(writer);
=======
		//traverser.accept(writer);
>>>>>>> origin/master
		out.write("}".getBytes());
		out.close();
		UMLGenerator g = new UMLGenerator(title);
		g.execute();
<<<<<<< HEAD
	}
=======

	}

>>>>>>> origin/master
>>>>>>> master
}
