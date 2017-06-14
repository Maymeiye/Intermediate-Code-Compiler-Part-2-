abstract class Statement
{
	
		void printParseTree(String indent)
		{
			IO.displayln(indent + indent.length() + " <statement>");
		}

		abstract void emitInstructions();
	
	/*Assignment assignment;
	Print print;
	Block block;
	Cond cond;
	Switch Switch;
	ForLoop forLoop;
	WhileLoop whileLoop;
	DoLoop doLoop;
	void printParseTree(String indent)
	{
		IO.displayln(indent + indent.length() + " <statement>");
	}
	
	void emitInstructions()
	{
		assignment.emitInstructions();
		print.emitInstructions();
		block.emitInstructions();
		cond.emitInstructions();
		forLoop.emitInstructions();
		whileLoop.emitInstructions();
		doLoop.emitInstructions();
		Switch.emitInstructions();
	}*/
}
