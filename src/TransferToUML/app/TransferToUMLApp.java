package TransferToUML.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import TransferToUML.impl.UMLTransferOutputStream;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;
import problem.asm.DesignParser;

public class TransferToUMLApp {
	
	public static String[] classes = {
			"JavaCodeToUMLCode.test.animal.Animal",
			"JavaCodeToUMLCode.test.animal.AbstractCat",
			"JavaCodeToUMLCode.test.animal.BombayCat"
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
//	};

	public static void main(String[] args) throws IOException {
		
		DesignParser parser = new DesignParser();
		
		parser.main(classes);
		OutputStream out = new FileOutputStream("./input_output/UML.txt");
		IVisitor writer = new UMLTransferOutputStream(out);
		ITraverser traverser = (ITraverser) parser.model;
		
		String title = "example";
		out.write("digraph ".getBytes());
		out.write(title.getBytes());
		out.write(" { \nrankdir=BT;\n".getBytes());
		traverser.accept(writer);
		out.write("}".getBytes());
		out.close();
		//UMLGenerator g = new UMLGenerator(title);
		//g.execute();
	}
}
