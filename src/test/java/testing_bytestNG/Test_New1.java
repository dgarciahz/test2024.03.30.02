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
	  
	  assert(false);
	  
	  test1 t=new test1();
	  t.readPropFile();
	  System.out.println();	  
	  System.out.println();	  
	  System.out.println(t.readed_currentTimeMillis);
	  System.out.println();	  
	  System.out.println();	  
	  
	  test1 t1=new test1();
	  Properties p1=t1.read_write_PropFile();
	  String aux1=p1.getProperty("db.user");
	  assert(aux1.equals("mkyong"));
	  assert(!aux1.equals("xxxxxx_mkyong"));
	  assert(t.readed_db_user.equals(aux1));
	  
	  String aux2=p1.getProperty("currentTimeMillis");
	  assert(aux2!=null);
	  System.out.println(aux2);
	  assert(!t.readed_currentTimeMillis.equals(aux2));
	  System.out.println();	  
	  System.out.println();	  
	  
	  test1 t2=new test1();
	  Properties p2=t2.read_write_PropFile();
	  String aux3=p2.getProperty("db.user");
	  assert(aux3.equals(aux1));
	  String aux4=p2.getProperty("currentTimeMillis");
	  System.out.println(aux4);
	  assert(!aux4.equals(p1.getProperty("currentTimeMillis")));
	  System.out.println();	  
	  System.out.println();	  
	  
  }
}
