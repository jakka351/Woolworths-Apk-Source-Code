package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final /* synthetic */ class k implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k(Runnable runnable, Object obj, int i) {
        this.d = i;
        this.e = runnable;
        this.f = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                this.e.run();
                break;
            default:
                this.e.run();
                break;
        }
        return this.f;
    }
}
