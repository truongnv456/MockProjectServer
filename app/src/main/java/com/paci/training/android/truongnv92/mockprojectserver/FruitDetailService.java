package com.paci.training.android.truongnv92.mockprojectserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.paci.training.android.truongnv92.mockprojectserver.data_local.FruitEntity;
import com.paci.training.android.truongnv92.mockprojectserver.model.Fruit;

public class FruitDetailService extends Service {
    public FruitDetailService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        return new IMyAidlInterface.Stub() {
            @Override
            public String getFruitDetail(int position) throws RemoteException {
                for (Fruit fruit: FruitEntity.getFruits()) {
                    if (fruit.getId() == position) {
                        return fruit.getDetail();
                    }
                }
                return "Invalid fruit id";
            }
        };
    }
}
