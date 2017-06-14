class If2 extends Cond
{
	Expr expr;
	Statement statement1;
	Statement statement2;

	If2(Expr e, Statement s1, Statement s2)
	{
		expr = e;
		statement1 = s1;
		statement2 = s2;
	}

	void printParseTree(String indent)
	{
		String indent2 = indent + "  ";
		super.printParseTree(indent);
		IO.displayln(indent2 + indent2.length() + " if");
		expr.printParseTree(indent2);
		statement1.printParseTree(indent2);
		IO.displayln(indent2 + indent2.length() + " else");
		statement2.printParseTree(indent2);
	}
	
	void emitInstructions()
	{
		int num1 = Compiler.setLabel(Compiler.IFlabel);
		expr.emitInstructions();
		IO.displayln(Compiler.indent +"ifF goto  " + num1);
		statement1.emitInstructions();
		int num2 = Compiler.setLabel(num1);
		IO.displayln(Compiler.indent +"goto "+ num2  );
		IO.displayln(num1+ ":");
		statement2.emitInstructions();
		IO.displayln( num2 + ":");	
	}
}

