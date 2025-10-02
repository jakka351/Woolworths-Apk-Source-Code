package com.swrve.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

/* loaded from: classes6.dex */
public class SwrvePushManagerWorker extends SwrvePushManagerBaseWorker {
    public SwrvePushManagerWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // com.swrve.sdk.SwrvePushManagerBaseWorker
    public final SwrvePushManager d() {
        return new SwrvePushManagerImp(getApplicationContext());
    }
}
