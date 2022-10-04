package com.infinite.code;

abstract class ProgrammingLanguageAbstract{
    abstract void displayInfo();
}

class Python extends ProgrammingLanguageAbstract{
    String information="Python is an interpreted, high-level, "
            + "general-purpose programming language. Created by Guido van Rossum and first released in 1991.";
    @Override
    void displayInfo() {
        System.out.println(information);
        System.out.println();
    }

}
class Java extends ProgrammingLanguageAbstract{
    String information="Java is a general-purpose programming language that is class-based, "
            + "object-oriented, and designed to have as few implementation dependencies as possible,\n"
            + "originally developed by James Gosling at Sun Microsystems and released in 1995";
    @Override
    void displayInfo() {
        System.out.println(information);
        System.out.println();
    }

}
// Uncomment the code given below and resolve the errors And call the method from TestAbstraction class.

class Cobol extends ProgrammingLanguageAbstract{
	void displayInfo(){
		System.out.println("COBOL is a compiled English-like computer programming language designed for business use.\n"
				+ " It is imperative, procedural and, since 2002, object-oriented");
	}
}


class TestAbstraction {
    void displayInfo() {
        System.out.println("Main Class");
    }
    public static void main(String[] args) {
        TestAbstraction t=new TestAbstraction();
        ProgrammingLanguageAbstract pythonObject = new Python();
        pythonObject.displayInfo();
        // In Line  45 displayInfo() of Python class will get invoked.

        Java javaObject = new Java();
          t.displayInfo();

        javaObject.displayInfo();


//		First uncomment the Class cobol,resolve the errors and uncomment line given below.
	Cobol cobolObject = new Cobol();
     cobolObject.displayInfo();

    }




}
