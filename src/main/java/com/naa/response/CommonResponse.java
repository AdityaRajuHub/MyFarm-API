package com.naa.response;

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
