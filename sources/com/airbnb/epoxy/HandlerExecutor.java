package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
class HandlerExecutor implements Executor {
    public final Handler d;

    public HandlerExecutor(Handler handler) {
        this.d = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.d;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
