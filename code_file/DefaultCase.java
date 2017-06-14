class DefaultCase extends Case
{
	// SList sList; inherited from Case
	
	DefaultCase(SList sl)
	{
		sList = sl;
	}

	void printParseTree(String indent)
	{
		IO.displayln(indent + indent.length() + " default");
		sList.printParseTree(indent+" ");
	}
	void emitInstructions()
	{
		//int num2 = Compiler.setLabel(Switch.num);
		//IO.displayln(num2 +":");	
		sList.emitInstructions();
	}
}