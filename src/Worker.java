public class Worker implements OnTaskDoneListener, OnTaskErrorListener {
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }


    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
            if (i == 32) {
                errorCallback.onError("Error");
                i++;
            }
        }
    }

    @Override
    public void onDone(String result) {
    }

    @Override
    public void onError(String error) {
    }
}


