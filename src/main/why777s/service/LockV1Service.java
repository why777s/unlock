package service;

import dao.impl.LockV1DaoImpl;
import entity.LockV1;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

/**
 * Created by why777s on 2017/7/9.
 */
public class LockV1Service {
    private LockV1DaoImpl lockV1Dao;

    public void setLockV1Dao(LockV1DaoImpl lockV1Dao) {
        this.lockV1Dao = lockV1Dao;
    }

    @Transactional
    public String getLockV1Pwd(String bikeID){
        return lockV1Dao.get(LockV1.class,bikeID).getPwd();
    }

    @Transactional
    public void changeAllPwd(){
        List<LockV1> lockV1s = lockV1Dao.findall(LockV1.class);
        for (LockV1 i:lockV1s){
            System.out.println("自行车编号:"+i.getId());
            System.out.println("原来的密码:"+i.getPwd());
            Random random = new Random();
            String  randNum = String.valueOf(random.nextInt(4)+1);
            String  randNum2 = String.valueOf(random.nextInt(4)+1);
            String  randNum3 = String.valueOf(random.nextInt(4)+1);
            String  randNum4 = String.valueOf(random.nextInt(4)+1);
            i.setPwd(randNum+randNum2+randNum3+randNum4);
            System.out.println("修改后的密码:");
            System.out.println(i.getPwd());
            lockV1Dao.save(i);
        }
    }
}
