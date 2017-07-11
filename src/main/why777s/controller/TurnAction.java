package controller;

import com.opensymphony.xwork2.ActionSupport;
import service.LockV1Service;

/**
 * Created by why777s on 2017/7/9.
 */
public class TurnAction extends ActionSupport {
    private String bikeID;
    private LockV1Service lockV1Service;
    public String bikdPWD;

    public String getBikdPWD() {
        return bikdPWD;
    }

    public void setBikdPWD(String bikdPWD) {
        this.bikdPWD = bikdPWD;
    }

    public void setLockV1Service(LockV1Service lockV1Service) {
        this.lockV1Service = lockV1Service;
    }

    public String getBikeID() {
        return bikeID;
    }

    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }


    public String lockV1turn() throws Exception {
        System.out.println("自行车编号:");
        System.out.println(getBikeID());
        System.out.println("自行车密码：");
        setBikdPWD(lockV1Service.getLockV1Pwd(getBikeID()));
        System.out.println(getBikdPWD());
        return SUCCESS;
    }
    public String lockV2turn() throws Exception{
        return SUCCESS;
    }
}
