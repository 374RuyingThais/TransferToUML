<<<<<<< HEAD
=======
<<<<<<< HEAD:src/TransferToUML/api/IField.java
package TransferToUML.api;

import TransferToUML.visitor.ITraverser;

public interface IField extends ITraverser {
	public int getAccess();
	public String getName();
	public String getDescription();
	public String getSignature();
	public Object getValue();
}
=======
>>>>>>> master
package TransferToUML.api;

public interface IVariable extends IComponent {
	public int getAccess();
	public String getName();
	public String getDescription();
	public String getSignature();
	public Object getValue();
}
<<<<<<< HEAD
=======
>>>>>>> origin/master:src/TransferToUML/api/IVariable.java
>>>>>>> master
