package TransferToUML.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import TransferToUML.api.IRelation;

import TransferToUML.visitor.IVisitor;

public class Relation implements IRelation {
	
	private String subClass;
	private String superClass;
	private Collection<String> interfaces;
	private Collection<String> uses;
	private Collection<String> associations;
	
	public Relation(String subName, String superClass) {
		this.subClass = subName;
		this.superClass = superClass;
		this.interfaces = null;
		this.uses = null;
		this.associations = null;
	}
	
	public Relation(String subName, String[] interfaces){
		this.subClass = subName;
		this.superClass = "";
		this.interfaces = new ArrayList<String>();
		for(String s : interfaces){
			this.interfaces.add(s);
		}
		this.uses = null;
		this.associations = null;
	}
	
	public Relation(String subName, String superClass, String[] interfaces) {
		this.subClass = subName;
		this.superClass = superClass;
		this.interfaces = new ArrayList<String>();
		for(String s : interfaces){
			this.interfaces.add(s);
		}
		this.uses = null;
		this.associations = null;
	}
	
	@Override
	public String getSubClass() {
		return this.subClass;
	}
	
	@Override
	public String getSuperClass() {
		return this.superClass;
	}

	@Override
	public Collection<String> getInterfaces() {
		return this.interfaces;
	}



	public void accept(IVisitor v) {
//		v.preVisit(this);
//		for(IClass p: this.components) {
//			ITraverser t = (ITraverser)p;
//			t.accept(v);
//		}
//		v.postVisit(this);
	}

	@Override
	public Collection<String> getUses() {
		return this.uses;
	}

	@Override
	public Collection<String> getAssociations() {
		return this.associations;
	}

//	@Override
//	public void addSuperClass(String superClass) {
//		
//	}

	@Override
	public void addInterfaces(String[] i) {

		for(String s : interfaces){
			if (!this.interfaces.contains(s))
				this.interfaces.add(s);
		}
	}

	@Override
	public void addUses(String[] useName) {
		for(String s : useName){
			if (!this.uses.contains(s))
				this.uses.add(s);
		}
	}

	@Override
	public void addUses(String s) {
		if (!this.uses.contains(s))
			this.uses.add(s);
	}

	@Override
	public void addAssociations(String[] associationsName) {
		for(String s : associationsName){
			if (!this.associations.contains(s))
				this.associations.add(s);
		}
	}

	@Override
	public void addAssociations(String s) {
		if (!this.associations.contains(s))
			this.associations.add(s);
	}

}
