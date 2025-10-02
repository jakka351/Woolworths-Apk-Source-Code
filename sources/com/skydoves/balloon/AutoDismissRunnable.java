package com.skydoves.balloon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/AutoDismissRunnable;", "Ljava/lang/Runnable;", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoDismissRunnable implements Runnable {
    public final Balloon d;

    public AutoDismissRunnable(Balloon balloon) {
        this.d = balloon;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.c();
    }
}
