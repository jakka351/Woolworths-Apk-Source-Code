package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class zzbjc implements zzggr {
    static final /* synthetic */ zzbjc zza = new zzbjc();

    private /* synthetic */ zzbjc() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        if (!((Boolean) zzbeh.zzi.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
