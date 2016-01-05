package TransferToUML.visitor;

import TransferToUML.api.IDeclaration;
import TransferToUML.api.IField;
import TransferToUML.api.IMethod;
import TransferToUML.api.IModel;

public interface IVisitor {
	public void preVisit(IModel c);
	public void visit(IModel c);
	public void postVisit(IModel c);

	public void preVisit(IField f);
	public void visit(IField f);
	public void postVisit(IField f);
	
	public void preVisit(IMethod m);
	public void visit(IMethod m);
	public void postVisit(IMethod m);

	public void preVisit(IDeclaration c);
	public void visit(IDeclaration c);
	public void postVisit(IDeclaration c);
}
