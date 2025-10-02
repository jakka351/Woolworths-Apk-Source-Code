package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzacq implements zzada {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzacp zzc = new zzacp(zzacn.zza);
    private static final zzacp zzd = new zzacp(zzacm.zza);

    @Nullable
    private zzgjz zze;
    private final zzajt zzf = new zzajo();

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzals());
                break;
            case 1:
                list.add(new zzalv());
                break;
            case 2:
                list.add(new zzaly(0));
                break;
            case 3:
                list.add(new zzaej(0));
                break;
            case 4:
                zzacu zzacuVarZza = zzc.zza(0);
                if (zzacuVarZza == null) {
                    list.add(new zzafa(0));
                    break;
                } else {
                    list.add(zzacuVarZza);
                    break;
                }
            case 5:
                list.add(new zzafd());
                break;
            case 6:
                list.add(new zzagz(this.zzf, 0));
                break;
            case 7:
                list.add(new zzahg(0));
                break;
            case 8:
                zzajt zzajtVar = this.zzf;
                list.add(new zzaif(zzajtVar, 0, null, null, zzgjz.zzi(), null));
                list.add(new zzaim(zzajtVar, 0));
                break;
            case 9:
                list.add(new zzajc());
                break;
            case 10:
                list.add(new zzanc());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgjz.zzi();
                }
                list.add(new zzann(1, 0, this.zzf, new zzel(0L), new zzama(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaoa());
                break;
            case 14:
                list.add(new zzafj(0));
                break;
            case 15:
                zzacu zzacuVarZza2 = zzd.zza(new Object[0]);
                if (zzacuVarZza2 != null) {
                    list.add(zzacuVarZza2);
                    break;
                }
                break;
            case 16:
                list.add(new zzaen(0, this.zzf));
                break;
            case 17:
                list.add(new zzajm());
                break;
            case 18:
                list.add(new zzaof());
                break;
            case 19:
                list.add(new zzaev());
                break;
            case 20:
                list.add(new zzafi());
                break;
            case 21:
                list.add(new zzaeu());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final synchronized zzacu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    @Override // com.google.android.gms.internal.ads.zzada
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzacu[] zzb(android.net.Uri r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacq.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzacu[]");
    }
}
