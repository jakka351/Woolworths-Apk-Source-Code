package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class zzapk {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaor zze;
    private final zzapa zzf;
    private final zzapb[] zzg;
    private zzaot zzh;
    private final List zzi;
    private final List zzj;
    private final zzaoy zzk;

    public zzapk(zzaor zzaorVar, zzapa zzapaVar, int i) {
        zzaoy zzaoyVar = new zzaoy(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaorVar;
        this.zzf = zzapaVar;
        this.zzg = new zzapb[4];
        this.zzk = zzaoyVar;
    }

    public final void zza() {
        zzaot zzaotVar = this.zzh;
        if (zzaotVar != null) {
            zzaotVar.zza();
        }
        zzapb[] zzapbVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzapb zzapbVar = zzapbVarArr[i];
            if (zzapbVar != null) {
                zzapbVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzaor zzaorVar = this.zze;
        zzaoy zzaoyVar = this.zzk;
        zzaot zzaotVar2 = new zzaot(priorityBlockingQueue, priorityBlockingQueue2, zzaorVar, zzaoyVar);
        this.zzh = zzaotVar2;
        zzaotVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzapb zzapbVar2 = new zzapb(priorityBlockingQueue2, this.zzf, zzaorVar, zzaoyVar);
            zzapbVarArr[i2] = zzapbVar2;
            zzapbVar2.start();
        }
    }

    public final zzaph zzb(zzaph zzaphVar) {
        zzaphVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzaphVar);
        }
        zzaphVar.zzg(this.zza.incrementAndGet());
        zzaphVar.zzc("add-to-queue");
        zzd(zzaphVar, 0);
        this.zzc.add(zzaphVar);
        return zzaphVar;
    }

    public final void zzc(zzaph zzaphVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzaphVar);
        }
        List list = this.zzi;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzapj) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzd(zzaphVar, 5);
    }

    public final void zzd(zzaph zzaphVar, int i) {
        List list = this.zzj;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzapi) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
