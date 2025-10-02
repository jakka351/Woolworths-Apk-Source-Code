package io.grpc.internal;

import io.grpc.Context;

/* loaded from: classes7.dex */
abstract class ContextRunnable implements Runnable {
    public final Context d;

    public ContextRunnable(Context context) {
        this.d = context;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.d;
        Context contextB = context.b();
        try {
            a();
        } finally {
            context.e(contextB);
        }
    }
}
