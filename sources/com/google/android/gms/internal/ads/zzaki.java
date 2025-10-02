package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzaki {
    private final zzef zza = new zzef();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    @Nullable
    public final zzcl zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzef zzefVar = this.zza;
        if (zzefVar.zze() == 0 || zzefVar.zzg() != zzefVar.zze() || !this.zzc) {
            return null;
        }
        zzefVar.zzh(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int iZzs = zzefVar.zzs();
            if (iZzs != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzefVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzefVar.zzs();
                    }
                    i = iZzs3 + i3;
                    Arrays.fill(iArr, i3, i, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzefVar.zzs()]);
                }
            }
            i3 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzck zzckVar = new zzck();
        zzckVar.zzc(bitmapCreateBitmap);
        zzckVar.zzi(this.zzf / this.zzd);
        zzckVar.zzj(0);
        zzckVar.zzf(this.zzg / this.zze, 0);
        zzckVar.zzg(0);
        zzckVar.zzm(this.zzh / this.zzd);
        zzckVar.zzn(this.zzi / this.zze);
        return zzckVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzef zzefVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzefVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i2 = 0;
        for (int i3 = i / 5; i2 < i3; i3 = i3) {
            int iZzs = zzefVar.zzs();
            int iZzs2 = zzefVar.zzs();
            int iZzs3 = zzefVar.zzs();
            int iZzs4 = zzefVar.zzs();
            double d = iZzs2;
            int iZzs5 = zzefVar.zzs() << 24;
            String str = zzeo.zza;
            double d2 = iZzs3 - 128;
            double d3 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255));
            i2++;
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzef zzefVar, int i) {
        int iZzx;
        if (i < 4) {
            return;
        }
        zzefVar.zzk(3);
        int i2 = i - 4;
        if ((zzefVar.zzs() & 128) != 0) {
            if (i2 < 7 || (iZzx = zzefVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzefVar.zzt();
            this.zzi = zzefVar.zzt();
            this.zza.zza(iZzx - 4);
            i2 = i - 11;
        }
        zzef zzefVar2 = this.zza;
        int iZzg = zzefVar2.zzg();
        int iZze = zzefVar2.zze();
        if (iZzg >= iZze || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iZze - iZzg);
        zzefVar.zzm(zzefVar2.zzi(), iZzg, iMin);
        zzefVar2.zzh(iZzg + iMin);
    }

    public final /* synthetic */ void zze(zzef zzefVar, int i) {
        if (i < 19) {
            return;
        }
        this.zzd = zzefVar.zzt();
        this.zze = zzefVar.zzt();
        zzefVar.zzk(11);
        this.zzf = zzefVar.zzt();
        this.zzg = zzefVar.zzt();
    }
}
