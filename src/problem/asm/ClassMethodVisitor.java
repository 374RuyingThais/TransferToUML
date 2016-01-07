package problem.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import TransferToUML.api.IClass;
import TransferToUML.api.IMethod;
import TransferToUML.api.IModel;
import TransferToUML.impl.Method;


public class ClassMethodVisitor extends ClassVisitor implements IClassVisitor{
	
	private IModel model;
	private IClass myClass;
	private ClassVisitor decorated;	
	
	public ClassMethodVisitor(int api){
		super(api);
	}
	
	public ClassMethodVisitor(int api, ClassVisitor decorated, IModel model) {
		super(api, decorated);
		this.model = model;
		this.myClass = null;
		this.decorated = decorated;
	} 
	
	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions){
		
		MethodVisitor toDecorate = super.visitMethod(access, name, desc, signature, exceptions);
		IMethod m = new Method(access, name, desc, signature, exceptions);
		
		//System.out.println("	method " + name);

		this.myClass = this.getBelongedClass();
		
		IClass namedClass = this.model.getNamedClass(this.myClass.getName());
		namedClass.addMethod(m);
		
//		addAccessLevel(access);
//		addReturnType(desc);
//		addArguments(desc);
		
		return toDecorate;
	}
	
	void addAccessLevel(int access){
		String level="";
		if((access&Opcodes.ACC_PUBLIC)!=0){
			level="public";
		}else if((access&Opcodes.ACC_PROTECTED)!=0){
			level="protected";
		}else if((access&Opcodes.ACC_PRIVATE)!=0){
			level="private";
		}else{
			level="default";
		}
		// TODO: delete the next line
		System.out.println("		access level: "+level);
		// TODO: ADD this information to your representation of the current method.
	}
	
	void addReturnType(String desc){
		String returnType = Type.getReturnType(desc).getClassName();
		// TODO: delete the next line
		System.out.println("		return type: " + returnType);
		// TODO: ADD this information to your representation of the current method.
	}
	
	void addArguments(String desc){
		Type[] args = Type.getArgumentTypes(desc);
	    for(int i=0; i< args.length; i++){
	    	String arg=args[i].getClassName();
	    	// TODO: delete the next line
	    	System.out.println("		arg "+i+": "+arg);
	    	// TODO: ADD this information to your representation of the current method.
	    }
	}

	@Override
	public IClass getBelongedClass() {
		if(decorated instanceof IClassVisitor){
			return ((IClassVisitor) decorated).getBelongedClass();
		}
		return this.myClass;
	};
}
