package TransferToUML.api;

import java.util.Collection;

import TransferToUML.visitor.ITraverser;

public interface IClass extends ITraverser{
	
	public String getName();
	public Collection<IMethod> getMethods();
	public Collection<IField> getFields();
	public Collection<IRelation> getRelations();
	
<<<<<<< HEAD
//	public void addName(String s);
=======
	public void addName(String s);
>>>>>>> master
	public void addMethod(IMethod m);
	public void addField(IField f);
	public void addRelation(IRelation r);
	
	public String getClassType();
<<<<<<< HEAD
//	public void setClassType(String s);
=======
	public void setClassType(String s);
>>>>>>> master

}
