package TransferToUML.api;

import TransferToUML.visitor.ITraverser;

public interface IRelation extends ITraverser{
	
	public String getSubClass();
	public String getSuperClass();
	public String[] getInterfaces();
//	public Map<String, String[]> getUses();
//	public Map<String, String[]> getAssociations();
	
//	public void addSuperClass(String name, String[] superClassName);
//	public void addInterfaces(String name, String[] interfacesName);
//	public void addUses(String name, String[] usesName);
//	public void addAssociations(String name, String[] associationsName);
	
}
