public interface InputBoundary {
    void execute(RequestData requestData);
}

interface OutputBoundary {
    void showError(ResponseData responseData);
    void showResult(ResponseData responseData);
}


