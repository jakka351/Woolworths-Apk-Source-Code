package com.medallia.digital.mobilesdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import org.json.JSONException;

/* loaded from: classes6.dex */
public class LocalNotificationWorker extends Worker {
    public LocalNotificationWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    @NonNull
    public ListenableWorker.Result doWork() throws JSONException {
        v3.f().a();
        v3.f().b();
        return ListenableWorker.Result.a();
    }
}
