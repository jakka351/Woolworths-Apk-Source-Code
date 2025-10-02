package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes5.dex */
final class zzgoy extends AbstractOwnableSynchronizer implements Runnable {
    private final zzgpa zza;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final /* synthetic */ void zza(Thread thread) {
        setExclusiveOwnerThread(thread);
    }
}
