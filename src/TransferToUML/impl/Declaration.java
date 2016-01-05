package TransferToUML.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import TransferToUML.api.IComponent;
import TransferToUML.api.IDeclaration;
import TransferToUML.visitor.ITraverser;
import TransferToUML.visitor.IVisitor;

public class Declaration implements IDeclaration, ITraverser {
	private int version;
	private int access;
	private String name;
	private String signature;
	private String superName;
	private String[] interfaces;
	private Collection<IComponent> components;

	public Declaration(int version, int access, String name, String signature, String superName, String[] interfaces, Collection<IComponent> components) {
		this.version = version;
		this.access = access;
		this.name = name;
		this.signature = signature;
		this.superName = superName;
		this.interfaces = interfaces;
		this.components = Collections.unmodifiableCollection(new ArrayList<>(components));
	}

	@Override
	public int getVersion() {
		return this.version;
	}

	@Override
	public int getAccess() {
		return this.access;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getSignature() {
		return this.signature;
	}

	@Override
	public String getSuperClass() {
		return this.superName;
	}

	@Override
	public String[] getInterfaces() {
		return this.interfaces;
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

}