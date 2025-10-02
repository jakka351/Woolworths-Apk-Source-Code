package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfrx extends zzhib implements zzhjt {
    private zzfrx() {
        throw null;
    }

    public final zzfrx zza(String str) {
        str.getClass();
        zzbg();
        ((zzfrz) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(((zzfrz) this.zza).zzb());
    }

    public final zzfrx zzc(String str, zzfrv zzfrvVar) {
        str.getClass();
        zzfrvVar.getClass();
        zzbg();
        ((zzfrz) this.zza).zze().put(str, zzfrvVar);
        return this;
    }

    public /* synthetic */ zzfrx(byte[] bArr) {
        super(zzfrz.zzb);
    }
}
