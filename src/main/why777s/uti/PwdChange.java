package uti;

import service.LockV1Service;

import java.util.Date;

/**
 * Created by why777s on 2017/7/10.
 */
public class PwdChange {
    private LockV1Service lockV1Service;

    public void setLockV1Service(LockV1Service lockV1Service) {
        this.lockV1Service = lockV1Service;
    }

    public void change(){
        System.out.println("定时器被调用");
        lockV1Service.changeAllPwd();

    }
}
