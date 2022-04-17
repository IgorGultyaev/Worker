package com.company;

public class Worker {

    OnTaskDoneListener callback;
    OnTaskErrorListener errorCallback;
    int errorNum;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int errorNum) {
        this.callback = callback;
        this.errorCallback = errorCallback;
        this.errorNum = errorNum;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == errorNum) {
                errorCallback.onError("Task " + i + " is error");
            } else {
                callback.onDone("Task " + i + " is done");
            }

        }
    }

}
