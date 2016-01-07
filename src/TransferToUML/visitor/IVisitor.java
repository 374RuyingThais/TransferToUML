package TransferToUML.visitor;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
import TransferToUML.api.IRelation;
import TransferToUML.api.IClass;
import TransferToUML.api.IField;
=======
import TransferToUML.api.IDeclaration;
import TransferToUML.api.IVariable;
>>>>>>> origin/master
import TransferToUML.api.IMethod;
import TransferToUML.api.IModel;

public interface IVisitor {
	
	public void preVisit(IClass c);
	public void visit(IClass c);
	public void postVisit(IClass c);
<<<<<<< HEAD
=======
	
	public void preVisit(IModel m);
	public void visit(IModel m);
	public void postVisit(IModel m);
>>>>>>> master

	public void preVisit(IVariable f);
	public void visit(IVariable f);
	public void postVisit(IVariable f);
	
	public void preVisit(IMethod m);
	public void visit(IMethod m);
	public void postVisit(IMethod m);

	public void preVisit(IRelation c);
	public void visit(IRelation c);
	public void postVisit(IRelation c);
<<<<<<< HEAD
	
	public void preVisit(IModel m);
	public void visit(IModel m);
	public void postVisit(IModel m);
	
	public void visitSperator();
=======
>>>>>>> master
}
