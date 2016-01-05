package TransferToUML.visitor;

import TransferToUML.api.IDeclaration;
import TransferToUML.api.IVariable;
import TransferToUML.api.IMethod;
import TransferToUML.api.IModel;

public interface IVisitor {
	public void preVisit(IModel c);
	public void visit(IModel c);
	public void postVisit(IModel c);

	public void preVisit(IVariable f);
	public void visit(IVariable f);
	public void postVisit(IVariable f);
	
	public void preVisit(IMethod m);
	public void visit(IMethod m);
	public void postVisit(IMethod m);

	public void preVisit(IDeclaration c);
	public void visit(IDeclaration c);
	public void postVisit(IDeclaration c);
}
