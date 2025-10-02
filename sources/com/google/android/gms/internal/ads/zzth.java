package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final /* synthetic */ class zzth implements zztk {
    static final /* synthetic */ zzth zza = new zzth();

    private /* synthetic */ zzth() {
    }

    @Override // com.google.android.gms.internal.ads.zztk
    public final /* synthetic */ int zza(Object obj) {
        int i = zztl.zza;
        String str = ((zzst) obj).zza;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }
}
