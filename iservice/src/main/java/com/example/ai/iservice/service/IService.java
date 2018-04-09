package com.example.ai.iservice.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.example.ai.iservice.ITest;
import com.example.ai.iservice.bean.User;

/**
 * Created by chenwanfeng on 2018/4/9.
 */

public class IService extends Service {
    // 测试用修改数据缓存
    User iUser;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    // 实现ITest
    ITest.Stub iBinder = new ITest.Stub() {
        @Override
        public User getUser() throws RemoteException {
            if (null == iUser)
                iUser = new User("chen", "浙江大学家里蹲");
            return iUser;
        }

        @Override
        public void setUser(User user) throws RemoteException {
            iUser = user;
        }
    };
}
