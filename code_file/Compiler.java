import java.util.HashMap;
import java.util.HashSet;

public abstract class Compiler extends Parser
{
	public static HashMap<String,Integer> MyHm  = new HashMap<String, Integer>();
	public static int index = 0;
	public static final String indent = "\t";
	public static int IFlabel = 1;
	public static HashSet<Integer> hs = new HashSet<Integer>();
	
	//use hash set to store label, so that each label would not use second time
	public static int setLabel(int label)
	  {
	    while ( hs.contains(label) ) label++;
	    hs.add(label);
	    return label;  
	  }
	
	//use hashmap to store variable, like make a2 become #0
	public static int instruction(String token)
	  {
	      if(MyHm.get(token) == null)
	      {
	    	  		MyHm.put(token,index);
	    	  		index++;
	      }
	    	  return MyHm.get(token);    
	  }
	
	public static void main(String argv[])
	{
		// argv[0]: input file containing an assignment list
		// argv[1]: output file containing the compiled instruction stream
		
		setIO( argv[0], argv[1] );
		setLex();

		getToken();
		SList slist = sList();// build a parse tree
		if ( ! t.isEmpty() )
			displayln(t + " : Syntax Error, unexpected symbol where id expected");
		else if ( ! syntaxErrorFound )
		{
			slist.emitInstructions();
		}
		closeIO();
	}
}