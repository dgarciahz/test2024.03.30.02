package testing_bytestNG;

import org.testng.annotations.Test;
import test1.test;

public class NewTest1 {
  @Test
  public void f() {
	  assert(! new test().getMessage().equals(""));
	  assert(new test().getMessage().equals(test._message));
  }
}
