class WhileLoop extends Statement
{
	Expr expr;
	Statement statement;

	WhileLoop(Expr e, Statement s)
	{
		expr = e;
		statement = s;
	}

	void printParseTree(String indent)
	{
		String indent1 = indent + " ";
		String indent2 = indent + "  ";
		
		super.printParseTree(indent);
		IO.displayln(indent1 + indent1.length() + " <while loop>");
		IO.displayln(indent2 + indent2.length() + " while");
		expr.printParseTree(indent2);
		statement.printParseTree(indent2);
	}
	
	void emitInstructions()
	{
		int num = Compiler.setLabel(Compiler.IFlabel);
		IO.displayln (num + ":" );
		expr.emitInstructions();
		int num2 = Compiler.setLabel(num);
		IO.displayln(Compiler.indent +"ifF goto  "+ num2 );
		statement.emitInstructions();
		IO.displayln(Compiler.indent +"goto  "+ num );
		IO.displayln(num2 +":");	
	}
}

