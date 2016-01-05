package TransferToUML.impl;

import java.util.Collection;

import TransferToUML.api.IComponent;
import TransferToUML.api.IModel;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;


public class Model implements ITraverser, IModel{
	
	public Collection<IComponent> components;
	public String declaration;
	public String field;
	public String method;
	
	public Model(String declaration, String field, String method, Collection<IComponent> components) {
		this.declaration = declaration;
		this.field = field;
		this.method = method;
		this.components = components;
	}

	@Override
	public void accept(IVisitor v) {
		v.preVisit(this);
		for(IComponent p: this.components) {
			ITraverser t = (ITraverser)p;
			t.accept(v);
		}
		v.postVisit(this);
	}

	@Override
	public Collection<IComponent> getComponents() {
		return this.components;
	}

	@Override
	public String getDeclaration() {
		return this.declaration;
	}

	@Override
	public String getField() {
		return this.field;
	}

	@Override
	public String getMethod() {
		return this.method;
	}
	
	@Override
	public String toString(){
		//TODO
		return "Declaration: " + this.declaration + "; Field: " + this.field + "; Method: " + this.method + "Components: " + this.components + ";";
	}

}
