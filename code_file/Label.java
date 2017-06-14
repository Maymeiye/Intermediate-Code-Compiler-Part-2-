class Label
{
	int val;

	Label(int i)
	{
		val = i;
	}

	void printParseTree()
	{
		IO.displayln(" " + val);
	}
	void emitInstructions()
	{
		IO.displayln(Compiler.indent +"push #1");
		IO.displayln(Compiler.indent +"push " + val);
		IO.displayln(Compiler.indent +"eq");
	}
}
