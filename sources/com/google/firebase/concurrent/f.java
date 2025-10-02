package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ DelegatingScheduledExecutorService e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ DelegatingScheduledFuture.AnonymousClass1 g;

    public /* synthetic */ f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.AnonymousClass1 anonymousClass1, int i) {
        this.d = i;
        this.e = delegatingScheduledExecutorService;
        this.f = runnable;
        this.g = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.d.execute(new c(this.f, this.g, 0));
                break;
            case 1:
                this.e.d.execute(new a(this.f, this.g));
                break;
            default:
                this.e.d.execute(new c(this.f, this.g, 1));
                break;
        }
    }
}
