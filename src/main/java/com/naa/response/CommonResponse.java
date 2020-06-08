package com.naa.response;

import java.util.ArrayList;
import java.util.List;

public  class CommonResponse {
	protected boolean success;
    protected String message;
   
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "APIResponse [success=" + success + "]";
    }

}
