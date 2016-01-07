package problem.asm;

<<<<<<< HEAD

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import TransferToUML.api.IClass;
import TransferToUML.api.IModel;
import TransferToUML.api.IRelation;
import TransferToUML.impl.Class;
import TransferToUML.impl.Relation;

public class ClassDeclarationVisitor extends ClassVisitor implements IClassVisitor{
	
=======
import java.util.Arrays;
import java.util.Collection;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import TransferToUML.api.IClass;
import TransferToUML.api.IModel;
import TransferToUML.api.IRelation;
import TransferToUML.impl.Class;
import TransferToUML.impl.Relation;

import TransferToUML.api.IComponent;
import TransferToUML.api.IDeclaration;
import TransferToUML.api.IModel;
import TransferToUML.impl.Declaration;
import TransferToUML.impl.Model;

public class ClassDeclarationVisitor extends ClassVisitor {
	
<<<<<<< HEAD
>>>>>>> master
	private IModel model;
	private IClass myClass;
	
	public ClassDeclarationVisitor(int api, IModel model){
<<<<<<< HEAD
		super(api);
		this.model = model;
		//not necessary to give this.myClass a value, because it will be replace when visits
		this.myClass = null;
=======
=======
	public ClassDeclarationVisitor(int api){
>>>>>>> origin/master
		super(api);
		this.model = model;
		//not necessary to give this.myClass a value, because it will be replace when visits
		this.myClass = new Class();
>>>>>>> master
	}
	
	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces){
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
		
		//System.out.println("Class: "+name+" extends "+superName+" implements "+Arrays.toString(interfaces));
		
		String classType = "normal";
		
		//Interface
		if ((access & Opcodes.ACC_INTERFACE) != 0) {
			classType = "Interface";
		}
		
		//TODO: Abstract
		
		String[] nameSplit = name.split("/");
		name = nameSplit[nameSplit.length - 1];
<<<<<<< HEAD
//		this.myClass.addName(name);
//		this.myClass.setClassType(classType);
		this.myClass = new Class(name, classType);
		
		IRelation r;
		if ((classType == "Interface") && (interfaces.length > 0)) {
			r = new Relation(name,interfaces[0]);
			//r.addSuperClass(name, interfaces[0]);
		} else {			
			r = new Relation(name,superName, interfaces);
=======
		this.myClass.addName(name);
		this.myClass.setClassType(classType);
		
		IRelation r;
		if ((classType == "Interface") && (interfaces.length > 0)) {
			r = new Relation(interfaces[0]);
			//r.addSuperClass(name, interfaces[0]);
		} else {			
			r = new Relation(superName, interfaces);
>>>>>>> master
			//r.addSuperClass(name, superName);
			//r.addInterfaces(name, interfaces);
		}
		this.myClass.addRelation(r);
		this.model.addRelation(r);
		this.model.addClass(myClass);
		
<<<<<<< HEAD
=======
=======
		// TODO: delete the line below
		//System.out.println("Class: "+name+" extends "+superName+" implements "+Arrays.toString(interfaces));
		
>>>>>>> origin/master
>>>>>>> master
		// TODO: construct an internal representation of the class for later use by decorators
		super.visit(version, access, name, signature, superName, interfaces);
		
	}

	@Override
	public IClass getBelongedClass() {
		return this.myClass;
	}
}
