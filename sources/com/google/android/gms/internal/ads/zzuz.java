package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class zzuz {
    public final int zza;

    @Nullable
    public final zzup zzb;
    private final CopyOnWriteArrayList zzc;

    private zzuz(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable zzup zzupVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzupVar;
    }

    @CheckResult
    public final zzuz zza(int i, @Nullable zzup zzupVar) {
        return new zzuz(this.zzc, 0, zzupVar);
    }

    public final void zzb(Handler handler, zzva zzvaVar) {
        this.zzc.add(new zzus(handler, zzvaVar));
    }

    public final void zzc(zzva zzvaVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            if (zzusVar.zzb == zzvaVar) {
                copyOnWriteArrayList.remove(zzusVar);
            }
        }
    }

    public final void zzd(final zzug zzugVar, final zzul zzulVar, final int i) {
        zzi(new zzdf() { // from class: com.google.android.gms.internal.ads.zzuy
            @Override // com.google.android.gms.internal.ads.zzdf
            public final /* synthetic */ void zza(Object obj) {
                ((zzva) obj).zzcT(0, this.zza.zzb, zzugVar, zzulVar, i);
            }
        });
    }

    public final void zze(final zzug zzugVar, final zzul zzulVar) {
        zzi(new zzdf() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // com.google.android.gms.internal.ads.zzdf
            public final /* synthetic */ void zza(Object obj) {
                ((zzva) obj).zzcU(0, this.zza.zzb, zzugVar, zzulVar);
            }
        });
    }

    public final void zzf(final zzug zzugVar, final zzul zzulVar) {
        zzi(new zzdf() { // from class: com.google.android.gms.internal.ads.zzuu
            @Override // com.google.android.gms.internal.ads.zzdf
            public final /* synthetic */ void zza(Object obj) {
                ((zzva) obj).zzcV(0, this.zza.zzb, zzugVar, zzulVar);
            }
        });
    }

    public final void zzg(final zzug zzugVar, final zzul zzulVar, final IOException iOException, final boolean z) {
        zzi(new zzdf() { // from class: com.google.android.gms.internal.ads.zzuv
            @Override // com.google.android.gms.internal.ads.zzdf
            public final /* synthetic */ void zza(Object obj) {
                ((zzva) obj).zzcW(0, this.zza.zzb, zzugVar, zzulVar, iOException, z);
            }
        });
    }

    public final void zzh(final zzul zzulVar) {
        zzi(new zzdf() { // from class: com.google.android.gms.internal.ads.zzuw
            @Override // com.google.android.gms.internal.ads.zzdf
            public final /* synthetic */ void zza(Object obj) {
                ((zzva) obj).zzcX(0, this.zza.zzb, zzulVar);
            }
        });
    }

    public final void zzi(final zzdf zzdfVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzus zzusVar = (zzus) it.next();
            final zzva zzvaVar = zzusVar.zzb;
            zzeo.zzd(zzusVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzux
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdfVar.zza(zzvaVar);
                }
            });
        }
    }

    public zzuz() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
