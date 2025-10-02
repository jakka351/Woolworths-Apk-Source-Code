package com.swrve.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes6.dex */
public class SwrveBackgroundEventSenderWorker extends Worker {
    public SwrveBackgroundEventSenderWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        ListenableWorker.Result.Success successA = ListenableWorker.Result.a();
        try {
            SwrveLogger.e("SwrveSDK: SwrveBackgroundEventSenderWorker started.", new Object[0]);
            new SwrveBackgroundEventSender((Swrve) SwrveSDKBase.f19075a, getApplicationContext()).b(getInputData());
            return successA;
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: SwrveBackgroundEventSenderWorker exception.", e, new Object[0]);
            return new ListenableWorker.Result.Failure();
        }
    }
}
