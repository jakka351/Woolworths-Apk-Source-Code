package com.swrve.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes6.dex */
public class SwrveCampaignDeliveryWorker extends Worker {
    public SwrveCampaignDeliveryWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        ListenableWorker.Result.Failure failure = new ListenableWorker.Result.Failure();
        try {
            SwrveLogger.e("SwrveSDK: SwrveCampaignDeliveryWorker started.", new Object[0]);
            return new CampaignDeliveryManager(getApplicationContext()).c(getInputData(), getRunAttemptCount());
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: SwrveCampaignDeliveryWorker exception.", e, new Object[0]);
            return failure;
        }
    }
}
