package controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by why777s on 2017/7/9.
 */
public class UnlockAction extends ActionSupport {
    private String pwd;
    private String rightPwd;

    public String getRightPwd() {
        return rightPwd;
    }

    public void setRightPwd(String rightPwd) {
        this.rightPwd = rightPwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("咳咳咳");
        System.out.println(getPwd());
        System.out.println(getRightPwd());
        if (getPwd().equals(getRightPwd()))
            return SUCCESS;
        else
            return ERROR;
    }
}
