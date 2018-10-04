import static org.greggordon.tools.Print.*;

class GException extends Exception {
	GException(String s) { super(s); }
}

public class Ex11 {
	static void f() {
		try {
			g();
		} catch(GException ge) {
			println("Caught GException in f try");
			ge.printStackTrace();
			throw new RuntimeException(ge);
		}
	}
	static void g() throws GException {
		throw new GException("from g()");
	}
	public static void main(String[] args) {
		f();
	}	
}
