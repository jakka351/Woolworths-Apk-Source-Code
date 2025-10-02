package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzfvx {
    private final Set zza;
    private final Set zzb;
    private final zzgea zzc;
    private ListenableFuture zzd = null;

    public zzfvx(Set set, Set set2, zzgea zzgeaVar) {
        this.zza = set;
        this.zzb = set2;
        this.zzc = zzgeaVar;
    }

    public final synchronized ListenableFuture zza() {
        try {
            ListenableFuture listenableFuture = this.zzd;
            if (listenableFuture != null) {
                return listenableFuture;
            }
            Set set = this.zzb;
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzfvv) it.next()).zza());
            }
            zzgea zzgeaVar = this.zzc;
            ListenableFuture listenableFutureZzk = zzgot.zzk(zzgot.zzl(arrayList), zzfvw.zza, zzgpk.zza());
            zzgeaVar.zze(2, listenableFutureZzk);
            this.zzd = listenableFutureZzk;
            Iterator it2 = this.zza.iterator();
            while (it2.hasNext()) {
                ((zzfvv) it2.next()).zza();
            }
            ListenableFuture listenableFuture2 = this.zzd;
            if (listenableFuture2 != null) {
                return listenableFuture2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ListenableFuture zzb() {
        ListenableFuture listenableFuture;
        listenableFuture = this.zzd;
        if (listenableFuture == null) {
            throw null;
        }
        return listenableFuture;
    }
}
