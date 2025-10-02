package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ j(Runnable runnable, int i) {
        this.d = i;
        this.e = runnable;
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
        return null;
    }
}
