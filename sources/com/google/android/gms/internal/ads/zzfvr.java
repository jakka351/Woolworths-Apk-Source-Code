package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class zzfvr implements zzfvs {
    private final zzhjs zza;

    public zzfvr(zzhjs zzhjsVar) {
        this.zza = zzhjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        ((zzhjs) obj).zzaO(outputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return (zzhjs) this.zza.zzbd().zza(inputStream, zzhhr.zza());
        } catch (zzhiw e) {
            throw new zzfvo("Cannot read proto.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
