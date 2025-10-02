package com.swrve.sdk;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class SwrvePushManagerBaseWorker extends Worker {
    public SwrvePushManagerBaseWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract SwrvePushManager d();

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        ListenableWorker.Result.Success successA = ListenableWorker.Result.a();
        try {
            SwrveLogger.e("SwrveSDK: SwrvePushWorker started.", new Object[0]);
            SwrvePushManager swrvePushManagerD = d();
            Map mapUnmodifiableMap = Collections.unmodifiableMap(getInputData().f3896a);
            Intrinsics.g(mapUnmodifiableMap, "unmodifiableMap(values)");
            Bundle bundle = new Bundle();
            for (String str : mapUnmodifiableMap.keySet()) {
                if (mapUnmodifiableMap.get(str) instanceof String) {
                    bundle.putString(str, (String) mapUnmodifiableMap.get(str));
                }
            }
            ((SwrvePushManagerImp) swrvePushManagerD).d(bundle);
            return successA;
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: SwrvePushWorker exception.", e, new Object[0]);
            return new ListenableWorker.Result.Failure();
        }
    }
}
