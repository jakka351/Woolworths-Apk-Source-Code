package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzfeu {
    private final zzfet zza = new zzfet();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfet zzf() {
        zzfet zzfetVar = this.zza;
        zzfet zzfetVarClone = zzfetVar.clone();
        zzfetVar.zza = false;
        zzfetVar.zzb = false;
        return zzfetVarClone;
    }

    public final String zzg() {
        StringBuilder sb = new StringBuilder("\n\tPool does not exist: ");
        sb.append(this.zzd);
        sb.append("\n\tNew pools created: ");
        sb.append(this.zzb);
        sb.append("\n\tPools removed: ");
        sb.append(this.zzc);
        sb.append("\n\tEntries added: ");
        sb.append(this.zzf);
        sb.append("\n\tNo entries retrieved: ");
        return YU.a.m(sb, this.zze, "\n");
    }
}
