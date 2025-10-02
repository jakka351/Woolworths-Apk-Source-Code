package com.medallia.digital.mobilesdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes6.dex */
public class CheckBackgroundWorker extends Worker {
    public CheckBackgroundWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private void a() {
        v3.f().b();
    }

    private void b() {
        d7.b().b(d7.a.BG_STARTED_TIMESTAMP, System.currentTimeMillis());
    }

    @Override // androidx.work.Worker
    @NonNull
    public ListenableWorker.Result doWork() {
        if (!LifeCycle.b().f()) {
            return new ListenableWorker.Result.Retry();
        }
        if (!d7.b().a(d7.a.IS_ON_DESTROY_CALLED, false)) {
            v3.f().d();
            b();
            a();
        }
        return ListenableWorker.Result.a();
    }
}
