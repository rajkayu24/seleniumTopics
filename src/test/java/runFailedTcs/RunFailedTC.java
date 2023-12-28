package runFailedTcs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunFailedTC {
  @Test
  public void tc1(){
	  Assert.assertTrue(true);
  }
  
  @Test
  public void tc2(){
	  Assert.assertTrue(false);
  }
  @Test
  public void tc3(){
	  Assert.assertTrue(true);
  }
}
