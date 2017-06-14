class LabeledCase extends Case
{
	Label label;
	//DefaultCase defaultCase;
	// SList sList; inherited from Case

	LabeledCase(Label l, SList sl)
	{
		label = l;
		sList = sl;
	}
	void printParseTree(String indent)
	{
		String indent1 = indent + " ";

		IO.display(indent + indent.length() + " case :");
		label.printParseTree();
		sList.printParseTree(indent1);
	}
	void emitInstructions()
	{
		label.emitInstructions();
		int num2 = Compiler.setLabel(Switch.num);
		IO.displayln(Compiler.indent +"ifF goto  "+ num2 );
		sList.emitInstructions();
		IO.displayln(Compiler.indent +"goto  "+ Switch.num);
		IO.displayln(num2 +":");	
	}
}