package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes5.dex */
abstract class zzgpa extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgoz(null);
    private static final Runnable zzb = new zzgoz(null);

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgoy zzgoyVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzgoy)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgoyVar = (zzgoy) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzgoyVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzd = zzd();
            if (!zZzd) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzgpl.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (zZzd) {
                return;
            }
            zzf(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strP;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            strP = "running=[DONE]";
        } else if (runnable instanceof zzgoy) {
            strP = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strP = YU.a.p(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strP = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        return YU.a.p(new StringBuilder(strP.length() + 2 + String.valueOf(strZzc).length()), strP, ", ", strZzc);
    }

    public abstract Object zza() throws Exception;

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract void zzf(Object obj);

    public abstract void zzg(Throwable th);

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgoy zzgoyVar = new zzgoy(this, null);
            zzgoyVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzgoyVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
