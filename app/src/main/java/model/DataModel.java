package model;

import java.util.List;

public class DataModel {
    int code;
    String message;
    List<UserModel> userList;

    public DataModel(int code, String message, List<UserModel> userList) {
        this.code = code;
        this.message = message;
        this.userList = userList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserModel> getUserList() {
        return userList;
    }

    public void setUserList(List<UserModel> userList) {
        this.userList = userList;
    }
}
