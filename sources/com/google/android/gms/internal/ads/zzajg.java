package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes5.dex */
final class zzajg extends zzajj {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzef zzefVar) {
        return zzk(zzefVar, zza);
    }

    private static boolean zzk(zzef zzefVar, byte[] bArr) {
        if (zzefVar.zzd() < 8) {
            return false;
        }
        int iZzg = zzefVar.zzg();
        byte[] bArr2 = new byte[8];
        zzefVar.zzm(bArr2, 0, 8);
        zzefVar.zzh(iZzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzb(zzef zzefVar) {
        return zzi(zzadr.zzd(zzefVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    @EnsuresNonNullIf
    public final boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) throws zzas {
        if (zzk(zzefVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzefVar.zzi(), zzefVar.zze());
            int i = bArrCopyOf[9] & 255;
            List listZza = zzadr.zza(bArrCopyOf);
            if (zzajhVar.zza != null) {
                return true;
            }
            zzs zzsVar = new zzs();
            zzsVar.zzl("audio/ogg");
            zzsVar.zzm("audio/opus");
            zzsVar.zzE(i);
            zzsVar.zzF(48000);
            zzsVar.zzp(listZza);
            zzajhVar.zza = zzsVar.zzM();
            return true;
        }
        if (!zzk(zzefVar, zzb)) {
            zzajhVar.zza.getClass();
            return false;
        }
        zzajhVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzefVar.zzk(8);
        zzao zzaoVarZzc = zzaeh.zzc(zzgjz.zzr(zzaeh.zzb(zzefVar, false, false).zza));
        if (zzaoVarZzc == null) {
            return true;
        }
        zzs zzsVarZza = zzajhVar.zza.zza();
        zzsVarZza.zzk(zzaoVarZzc.zzc(zzajhVar.zza.zzl));
        zzajhVar.zza = zzsVarZza.zzM();
        return true;
    }
}
