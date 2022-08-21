package accessModifier;

public class AccessModifierRules {
public static void main(String[] args) {

	
	
	AllModifiers a=new AllModifiers();
	System.out.println("Modifier	SameClass	SameClassSamePackage	SamePackage	DifferentPackageSubclass	World");
	System.out.print("Public		");
	a.print(true, true, true, true, true);
	System.out.print("Protected	");
	a.print(true, true, true, true, false);
	System.out.print("Private		");
	a.print(true, false, false, false, false);
	System.out.print("Default		");
	a.print(true, true, true, false, false);
}
}
class AllModifiers{
	
	void print(boolean InClass, boolean SamePackageSubClass, boolean InPackage, boolean DifferentPackageSubClass, boolean InWorld)
	{
		System.out.println(InClass + "			"+ SamePackageSubClass + "		"+ InPackage + "			" + DifferentPackageSubClass + "			"+InWorld);
		
	}}

