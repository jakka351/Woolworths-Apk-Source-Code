package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class zzalc implements zzajv {
    private final zzef zza = new zzef();
    private final zzef zzb = new zzef();
    private final zzalb zzc;

    @Nullable
    private Inflater zzd;

    public zzalc(List list) {
        zzalb zzalbVar = new zzalb();
        this.zzc = zzalbVar;
        zzalbVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i2 + i);
        zzefVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzef zzefVar2 = this.zzb;
        if (zzeo.zzM(zzefVar, zzefVar2, this.zzd)) {
            zzefVar.zzb(zzefVar2.zzi(), zzefVar2.zze());
        }
        zzalb zzalbVar = this.zzc;
        zzalbVar.zzd();
        int iZzd = zzefVar.zzd();
        zzcl zzclVarZzc = null;
        if (iZzd >= 2 && zzefVar.zzt() == iZzd) {
            zzalbVar.zzb(zzefVar);
            zzclVarZzc = zzalbVar.zzc(zzefVar);
        }
        zzdfVar.zza(new zzajn(zzclVarZzc != null ? zzgjz.zzj(zzclVarZzc) : zzgjz.zzi(), -9223372036854775807L, 5000000L));
    }
}
