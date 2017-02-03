package prerequis;
/**
* Main entry point for demo
*/
public class App {
  public static void main(String[] args) {
    DeprecatedAnnotationSample sample = new DeprecatedAnnotationSample();
    sample.deprecatedMethod();
    sample.nonDeprecatedMethod();
  }
}
