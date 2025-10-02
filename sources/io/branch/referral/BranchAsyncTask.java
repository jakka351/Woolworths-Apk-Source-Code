package io.branch.referral;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class BranchAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    /* JADX WARN: Multi-variable type inference failed */
    public final AsyncTask a(Object... objArr) {
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
        } catch (Exception e) {
            BranchLogger.f("Caught Exception in AsyncTask: " + e.getMessage());
            return execute(objArr);
        }
    }
}
