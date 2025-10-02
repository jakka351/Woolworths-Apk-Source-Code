package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class zzys {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyt zzytVar) {
        zzb(zzytVar);
        this.zza.add(new zzyr(handler, zzytVar));
    }

    public final void zzb(zzyt zzytVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzyr zzyrVar = (zzyr) it.next();
            if (zzyrVar.zzc() == zzytVar) {
                zzyrVar.zza();
                copyOnWriteArrayList.remove(zzyrVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyr zzyrVar = (zzyr) it.next();
            if (!zzyrVar.zzd()) {
                zzyrVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzyrVar.zzc().zzX(i, j, j2);
                    }
                });
            }
        }
    }
}
