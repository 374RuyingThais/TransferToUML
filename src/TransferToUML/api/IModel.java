package TransferToUML.api;

import java.util.Collection;

public interface IModel {
	public Collection<IComponent> getComponents();
	public String getDeclaration();
	public String getField();
	public String getMethod();
}
