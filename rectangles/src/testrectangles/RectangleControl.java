
public class RectangleControl implements InputBoundary {
    
    Rectangle rectangle = null;
    UiOutput uiOutput = null;
    ResponseData responseData = null;

    RectangleControl() {
        uiOutput = new UiOutput();
        responseData = new ResponseData();
    }

    @Override
    public void execute(RequestData requestData) {
        if (isInteger(requestData.getSetLength()) && isInteger(requestData.getSetWidth())) {
            int length = Integer.parseInt(requestData.getSetLength());
            int width = Integer.parseInt(requestData.getSetWidth());
            rectangle = new Rectangle(length, width);
            int perimeter = rectangle.getPerimeter();
            int area = rectangle.getArea();
            responseData.setResult(perimeter); 
            responseData.setResults(area);
            uiOutput.showResult(responseData);
        } else {
            responseData.setError("Invalid input. Numbers must be integers."); 
            uiOutput.showError(responseData);
        }
    }
    public boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
    

