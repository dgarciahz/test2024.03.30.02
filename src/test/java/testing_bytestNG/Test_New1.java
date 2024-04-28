package testing_bytestNG;

import java.util.Properties;

import org.testng.annotations.Test;
import test1.test;
import test1.test1;

public class Test_New1 {
  @Test
  public void f() {
	  assert(! new test().getMessage().equals(""));
	  assert(new test().getMessage().equals(test._message));
  }
  
  @Test
  public void f2() throws Exception {
	  test1 t=new test1();
	  Properties p1=t.readPropFile();
	  String aux1=p1.getProperty("db.user");
	  assert(aux1.equals("mkyong"));
	  assert(!aux1.equals("xxxxxx_mkyong"));
	  String aux2=p1.getProperty("currentTimeMillis");
	  assert(aux2!=null);
	  
	  test1 t2=new test1();
	  Properties p2=t2.readPropFile();
	  String aux3=p2.getProperty("db.user");
	  assert(aux3.equals(aux1));
	  String aux4=p2.getProperty("currentTimeMillis");
	  assert(!aux4.equals(aux2));
	  
  }
}
