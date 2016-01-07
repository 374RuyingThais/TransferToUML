package TransferToUML.impl;

import java.util.ArrayList;
import java.util.Collection;

import TransferToUML.api.IClass;
import TransferToUML.api.IModel;
import TransferToUML.api.IRelation;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;


public class Model implements IModel{
	
	public Collection<IClass> classes;
	public Collection<IRelation> relations;

	
	public Model(){
		this.classes = new ArrayList<IClass>();
		this.relations = new ArrayList<IRelation>();
	}

	public Model(Collection<IClass> classes) {
		this.classes = classes;
		this.relations = new ArrayList<IRelation>();
	}
	
	public Model(Collection<IClass> classes, ArrayList<IRelation> relations) {
		this.classes = classes;
		this.relations = relations;
	}

	public void accept(IVisitor v) {
		v.preVisit(this);
		for(IClass c: this.classes) {
			c.accept(v);
		}
		v.visit(this);
		v.postVisit(this);
	}

	@Override
	public void addClass(IClass c) {
		this.classes.add(c);
	}
	
	@Override
	public Collection<IClass> getClasses() {
		return this.classes;
	}

	@Override
	public void addRelation(IRelation r) {
		this.relations.add(r);
	}

	@Override
	public void setRelation(Collection<IRelation>  r) {
		this.relations = r;
	}
	
	@Override
	public Collection<IRelation> getRelations() {
		return this.relations;
	}

	@Override
	public IClass getNamedClass(String s) {
		for(IClass clazz : this.classes){
			if(clazz.getName().equals(s)){
				return clazz;
			}
		}
		return null;
	}

	@Override
	public String toString(){
		return "classes: " + this.classes + ";" + "Relation: " + this.relations + "; ";
	}

}
