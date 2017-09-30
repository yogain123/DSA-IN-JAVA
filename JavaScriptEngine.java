import java.util.*;
import java.io.*;
import javax.script.*;
class rev
{
	public static void main(String args[]) throws Exception
	{

		//System.out.println(new StringBuffer(sc.nextLine()).reverse().toString());	
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object res = engine.eval("2+3");
		System.out.println(res);
	}
}
