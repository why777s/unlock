package service;

import dao.impl.LockV2DaoImpl;

/**
 * Created by why777s on 2017/7/11.
 */
public class LockV2Service {
    private LockV2DaoImpl lockV2Dao;

    public void setLockV2Dao(LockV2DaoImpl lockV2Dao) {
        this.lockV2Dao = lockV2Dao;
    }

    
}
