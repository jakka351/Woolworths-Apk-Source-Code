package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzaeo implements zzaek {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeo(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzaeo zzb(zzef zzefVar) {
        int iZzC = zzefVar.zzC();
        zzefVar.zzk(8);
        int iZzC2 = zzefVar.zzC();
        int iZzC3 = zzefVar.zzC();
        zzefVar.zzk(4);
        int iZzC4 = zzefVar.zzC();
        zzefVar.zzk(12);
        return new zzaeo(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return 1751742049;
    }
}
