package prerequis;
/**
* This class declares a deprecated method.
*/
public class DeprecatedAnnotationSample {
  /**
  * @deprecated
  * explanation of why it was deprecated
  */

  @Deprecated
  public void deprecatedMethod() {
    System.out.println("calling deprecatedMethod is deprecated");
  }
  /**
  * explanation of why it was deprecated
  */
  public void nonDeprecatedMethod() {
    System.out.println("calling nonDeprecatedMethod is well supported");
  }
}
