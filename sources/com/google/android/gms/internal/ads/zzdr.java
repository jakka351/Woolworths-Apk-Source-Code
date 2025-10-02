package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public final class zzdr {
    private final zzdb zza;
    private final zzdl zzb;
    private final zzdn zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;

    @GuardedBy
    private boolean zzh;
    private boolean zzi;

    public zzdr(Looper looper, zzdb zzdbVar, zzdn zzdnVar) {
        this(new CopyOnWriteArraySet(), looper, zzdbVar, zzdnVar, true);
    }

    private final void zzh() {
        if (this.zzi) {
            zzghc.zzh(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    @CheckResult
    public final zzdr zza(Looper looper, zzdn zzdnVar) {
        return new zzdr(this.zzd, looper, this.zza, zzdnVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            try {
                if (this.zzh) {
                    return;
                }
                this.zzd.add(new zzdo(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(Object obj) {
        zzh();
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            zzdo zzdoVar = (zzdo) it.next();
            if (zzdoVar.zza.equals(obj)) {
                zzdoVar.zza(this.zzc);
                copyOnWriteArraySet.remove(zzdoVar);
            }
        }
    }

    public final void zzd(final int i, final zzdm zzdmVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdm zzdmVar2 = zzdmVar;
                    ((zzdo) it.next()).zzb(i, zzdmVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        ArrayDeque arrayDeque = this.zzf;
        if (arrayDeque.isEmpty()) {
            return;
        }
        zzdl zzdlVar = this.zzb;
        if (!zzdlVar.zzb(1)) {
            zzdlVar.zzg(zzdlVar.zzc(1));
        }
        ArrayDeque arrayDeque2 = this.zze;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void zzf() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzdo) it.next()).zza(this.zzc);
        }
        copyOnWriteArraySet.clear();
    }

    public final /* synthetic */ boolean zzg(Message message) {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdo) it.next()).zzc(this.zzc);
            if (this.zzb.zzb(1)) {
                break;
            }
        }
        return true;
    }

    private zzdr(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdb zzdbVar, zzdn zzdnVar, boolean z) {
        this.zza = zzdbVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdnVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdbVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdq
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                this.zza.zzg(message);
                return true;
            }
        });
        this.zzi = z;
    }
}
