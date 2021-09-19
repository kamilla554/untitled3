package com.company;

public class Head {
    boolean status;

    public Head(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status)
        {
            return "Head is okay";
        }
        else
        {
            return "Head is not okay";
        }
    }
}
