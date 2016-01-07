package TransferToUML.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import TransferToUML.api.IClass;
import TransferToUML.api.IRelation;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;

@SuppressWarnings("unused")
public class Relation implements IRelation {
	
	private String superClass;
	private String[] interfaces;
//	private String[] uses;
//	private String[] associations;

//	private Map<String, String> classToSuperclass = new HashMap<String, String>();
//	private Map<String, String[]> classToInterface = new HashMap<String, String[]>();
//	private Map<String, String[]> classToUses = new HashMap<String, String[]>();
//	private Map<String, String[]> classToAssociations = new HashMap<String, String[]>();

	
	public Relation(String superClass) {
		this.superClass = superClass;
	}
	
	public Relation(String[] interfaces){
		this.interfaces = interfaces;
	}
	
	public Relation(String superClass, String[] interfaces) {
		this.superClass = superClass;
		this.interfaces = interfaces;
	}
	
	@Override
	public String getSuperClass() {
		return this.superClass;
	}

	@Override
	public String[] getInterfaces() {
		return this.interfaces;
	}

//	@Override
//	public void addSuperClass(String name, String[] superClassName) {
//		this.classToSuperclass.put(key, value);
//	}
//
//	@Override
//	public void addInterfaces() {
//		this.subclassToInterface.put(name, interfaceName);
//	}


	public void accept(IVisitor v) {
//		v.preVisit(this);
//		for(IClass p: this.components) {
//			ITraverser t = (ITraverser)p;
//			t.accept(v);
//		}
//		v.postVisit(this);
	}

}
