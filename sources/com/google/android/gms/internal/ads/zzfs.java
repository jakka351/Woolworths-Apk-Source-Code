package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class zzfs implements zzga {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzge zzd;

    public zzfs(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
        zzgyVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzgyVar)) {
            return;
        }
        arrayList.add(zzgyVar);
        this.zzc++;
    }

    public final void zzf(zzge zzgeVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzgy) this.zzb.get(i)).zza(this, zzgeVar, this.zza);
        }
    }

    public final void zzg(zzge zzgeVar) {
        this.zzd = zzgeVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzgy) this.zzb.get(i)).zzb(this, zzgeVar, this.zza);
        }
    }

    public final void zzh(int i) {
        zzge zzgeVar = this.zzd;
        String str = zzeo.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzgy) this.zzb.get(i2)).zzc(this, zzgeVar, this.zza, i);
        }
    }

    public final void zzi() {
        zzge zzgeVar = this.zzd;
        String str = zzeo.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((zzgy) this.zzb.get(i)).zzd(this, zzgeVar, this.zza);
        }
        this.zzd = null;
    }
}
