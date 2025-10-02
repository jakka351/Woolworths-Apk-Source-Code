package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ DelegatingScheduledFuture.AnonymousClass1 f;

    public /* synthetic */ c(Object obj, DelegatingScheduledFuture.AnonymousClass1 anonymousClass1, int i) {
        this.d = i;
        this.e = obj;
        this.f = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.d) {
            case 0:
                try {
                    ((Runnable) this.e).run();
                    return;
                } catch (Exception e) {
                    this.f.b(e);
                    throw e;
                }
            case 1:
                try {
                    ((Runnable) this.e).run();
                    return;
                } catch (Exception e2) {
                    this.f.b(e2);
                    return;
                }
            default:
                Callable callable = (Callable) this.e;
                DelegatingScheduledFuture.AnonymousClass1 anonymousClass1 = this.f;
                try {
                    anonymousClass1.a(callable.call());
                    return;
                } catch (Exception e3) {
                    anonymousClass1.b(e3);
                    return;
                }
        }
    }
}
