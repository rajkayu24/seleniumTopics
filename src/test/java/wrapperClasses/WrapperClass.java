package wrapperClasses;

public class WrapperClass {

	public static void main(String[] args) {
	
	byte b=2;
	short s=8;
	int i=10;
	long l=20;
	float f=80.0f;
	double d=39.8D;
	char c='a';
	boolean b2=true;
	
	//converting primitives into objects:Autoboxing

	Byte byteobj=b;
	Short shortobj=s;
	Integer intobj=i;
	Long longobj=l;
	Float floatobj=f;
	Double doubleobj=d;
	Character charobj=c;
	Boolean booleanobj=b2;

	System.out.println("Byte object:"+byteobj);//this is object value
	System.out.println("Short object:"+shortobj);
	System.out.println("Integer object:"+intobj);
	System.out.println("Long object:"+longobj);
	System.out.println("Float object:"+floatobj);
	System.out.println("Double object:"+doubleobj);
	System.out.println("Chracter object:"+charobj);
	System.out.println("Boolean object:"+booleanobj);
	
	//converting object to primitive:UnBoxing
	byte primitivebytevalue=byteobj;
	short primitiveshortvalue=shortobj;
	
	int primitiveintvalue=intobj;
	
	long primitivelongvalue=longobj;
	
	float primitivefloatvalue=floatobj;
	
	double primitivedoublevalue=doubleobj;
	char primitivecharvalue=charobj;
	boolean primitivebooleanvalue=booleanobj;
	
	System.out.println("****************************************");
	System.out.println("byte value: "+primitivebytevalue);
	System.out.println("short value: "+primitiveshortvalue);
	System.out.println("int value:"+primitiveintvalue);
	System.out.println("long value:"+primitivelongvalue);
	System.out.println("float value:"+primitivefloatvalue);
	System.out.println("double value:"+primitivedoublevalue);
	System.out.println("char value:"+primitivecharvalue);
	System.out.println("boolean value:"+primitivebooleanvalue);
	
	//difference between primitive var and object var
	
	//prirmitive var we cant access any method but if it is object method than we can access certain 
//	no. of methods.
	
	//anather use of wrapper class is data conversion
	//data conversion methods 
	
	
	
	
	
	                                                                                                      
	
	
	}

}
