package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzds {
    static final zzds zza = new zzds(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzds() {
        this.zzd = new HashMap();
    }

    public static zzds zza() {
        int i = zzfu.zza;
        return zza;
    }

    public final zzef zzb(zzfm zzfmVar, int i) {
        return (zzef) this.zzd.get(new zzdr(zzfmVar, i));
    }

    public zzds(boolean z) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
