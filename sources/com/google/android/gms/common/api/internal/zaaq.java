package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* loaded from: classes5.dex */
abstract class zaaq implements Runnable {
    final /* synthetic */ zaar zab;

    public /* synthetic */ zaaq(zaar zaarVar, byte[] bArr) {
        Objects.requireNonNull(zaarVar);
        this.zab = zaarVar;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        Lock lockZas;
        zaar zaarVar = this.zab;
        zaarVar.zas().lock();
        try {
            try {
            } catch (RuntimeException e) {
                this.zab.zar().zas(e);
            }
            if (Thread.interrupted()) {
                lockZas = zaarVar.zas();
                lockZas.unlock();
            } else {
                zaa();
                lockZas = this.zab.zas();
                lockZas.unlock();
            }
        } catch (Throwable th) {
            this.zab.zas().unlock();
            throw th;
        }
    }

    @WorkerThread
    public abstract void zaa();
}
