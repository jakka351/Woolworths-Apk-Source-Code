package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zztr implements zzvi {
    private final zzada zza;

    @Nullable
    private zzacu zzb;

    @Nullable
    private zzacv zzc;

    public zztr(zzada zzadaVar) {
        this.zza = zzadaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zza(zzi zziVar, Uri uri, Map map, long j, long j2, zzacx zzacxVar) throws IOException {
        zzacl zzaclVar = new zzacl(zziVar, j, j2);
        this.zzc = zzaclVar;
        if (this.zzb != null) {
            return;
        }
        zzacu[] zzacuVarArrZzb = this.zza.zzb(uri, map);
        int length = zzacuVarArrZzb.length;
        zzgjw zzgjwVarZzv = zzgjz.zzv(length);
        if (length == 1) {
            this.zzb = zzacuVarArrZzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzacu zzacuVar = zzacuVarArrZzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaclVar.zzn() == j) {
                    }
                } catch (Throwable th) {
                    zzghc.zzh(this.zzb != null || zzaclVar.zzn() == j);
                    zzaclVar.zzl();
                    throw th;
                }
                if (zzacuVar.zzd(zzaclVar)) {
                    this.zzb = zzacuVar;
                    zzghc.zzh(true);
                    zzaclVar.zzl();
                    break;
                } else {
                    zzgjwVarZzv.zzh(zzacuVar.zze());
                    boolean z = this.zzb != null || zzaclVar.zzn() == j;
                    zzghc.zzh(z);
                    zzaclVar.zzl();
                    i++;
                }
            }
            if (this.zzb == null) {
                String strZzd = zzggw.zzd(zzgkp.zzc(zzgjz.zzr(zzacuVarArrZzb), zztq.zza), ", ");
                throw new zzwr(YU.a.p(new StringBuilder(strZzd.length() + 58), "None of the available extractors (", strZzd, ") could read the stream."), uri, zzgjwVarZzv.zzi());
            }
        }
        this.zzb.zzf(zzacxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzc() {
        zzacu zzacuVar = this.zzb;
        if (zzacuVar != null && (zzacuVar instanceof zzahg)) {
            ((zzahg) zzacuVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final long zzd() {
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            return zzacvVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zze(long j, long j2) {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzh(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final int zzf(zzads zzadsVar) throws IOException {
        zzacv zzacvVar;
        zzacu zzacuVar = this.zzb;
        if (zzacuVar == null || (zzacvVar = this.zzc) == null) {
            throw null;
        }
        return zzacuVar.zzg(zzacvVar, zzadsVar);
    }
}
