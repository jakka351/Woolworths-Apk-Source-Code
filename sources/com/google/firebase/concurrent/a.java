package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(CustomThreadFactory customThreadFactory, Runnable runnable) {
        this.f = customThreadFactory;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.d) {
            case 0:
                CustomThreadFactory customThreadFactory = (CustomThreadFactory) this.f;
                Process.setThreadPriority(customThreadFactory.f);
                StrictMode.ThreadPolicy threadPolicy = customThreadFactory.g;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                this.e.run();
                break;
            default:
                Runnable runnable = this.e;
                DelegatingScheduledFuture.AnonymousClass1 anonymousClass1 = (DelegatingScheduledFuture.AnonymousClass1) this.f;
                try {
                    runnable.run();
                    anonymousClass1.a(null);
                    break;
                } catch (Exception e) {
                    anonymousClass1.b(e);
                }
        }
    }

    public /* synthetic */ a(Runnable runnable, DelegatingScheduledFuture.AnonymousClass1 anonymousClass1) {
        this.e = runnable;
        this.f = anonymousClass1;
    }
}
