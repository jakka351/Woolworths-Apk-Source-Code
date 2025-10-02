package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes5.dex */
final class zzafb extends zzafg {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafb(zzaeb zzaebVar) {
        super(zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final boolean zza(zzef zzefVar) throws zzaff {
        if (this.zzc) {
            zzefVar.zzk(1);
        } else {
            int iZzs = zzefVar.zzs();
            int i = iZzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzs >> 2) & 3];
                zzs zzsVar = new zzs();
                zzsVar.zzl("video/x-flv");
                zzsVar.zzm("audio/mpeg");
                zzsVar.zzE(1);
                zzsVar.zzF(i2);
                this.zza.zzu(zzsVar.zzM());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzs zzsVar2 = new zzs();
                zzsVar2.zzl("video/x-flv");
                zzsVar2.zzm(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzsVar2.zzE(1);
                zzsVar2.zzF(8000);
                this.zza.zzu(zzsVar2.zzM());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzaff(YU.a.n(new StringBuilder(String.valueOf(i).length() + 28), "Audio format not supported: ", i));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final boolean zzb(zzef zzefVar, long j) throws zzas {
        if (this.zze == 2) {
            int iZzd = zzefVar.zzd();
            zzaeb zzaebVar = this.zza;
            zzaebVar.zzz(zzefVar, iZzd);
            zzaebVar.zzx(j, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzefVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzefVar.zzd();
            zzaeb zzaebVar2 = this.zza;
            zzaebVar2.zzz(zzefVar, iZzd2);
            zzaebVar2.zzx(j, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzefVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzefVar.zzm(bArr, 0, iZzd3);
        zzabs zzabsVarZza = zzabt.zza(bArr);
        zzs zzsVar = new zzs();
        zzsVar.zzl("video/x-flv");
        zzsVar.zzm("audio/mp4a-latm");
        zzsVar.zzj(zzabsVarZza.zzc);
        zzsVar.zzE(zzabsVarZza.zzb);
        zzsVar.zzF(zzabsVarZza.zza);
        zzsVar.zzp(Collections.singletonList(bArr));
        this.zza.zzu(zzsVar.zzM());
        this.zzd = true;
        return false;
    }
}
