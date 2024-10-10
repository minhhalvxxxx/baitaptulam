

public class UiOutput implements OutputBoundary {
 
 @Override
 public void showError(ResponseData responseData) {
     System.out.println("ERROR: " + responseData.getError());
 }

 @Override
 public void showResult(ResponseData responseData) {
     System.out.println("Result (Perimeter): " + responseData.getResult());
     System.out.println("Result (Area): " + responseData.getResults());
 }
}
