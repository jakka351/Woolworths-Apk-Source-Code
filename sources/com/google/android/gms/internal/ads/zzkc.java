package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzkc {
    public zzld zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzkc(zzld zzldVar) {
        this.zza = zzldVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(zzld zzldVar) {
        this.zze |= this.zza != zzldVar;
        this.zza = zzldVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            zzghc.zza(i == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
