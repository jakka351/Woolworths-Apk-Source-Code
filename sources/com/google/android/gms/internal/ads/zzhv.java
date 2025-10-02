package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzhv implements zzkj {
    public static final zzgjz zza = zzgjz.zzn("file", "content", "data", "android.resource", "rawresource", "asset");
    private final zzbd zzb;
    private final zzbc zzc;
    private final zzyv zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final HashMap zzn;
    private long zzo;

    public zzhv() {
        zzyv zzyvVar = new zzyv(true, 65536);
        zzo(1000, 0, "bufferForPlaybackMs", "0");
        zzo(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzo(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzo(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzo(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzo(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzo(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzo(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzo(50000, 50000, "maxBufferMs", "minBufferMs");
        zzo(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzo(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbd();
        this.zzc = new zzbc();
        this.zzd = zzyvVar;
        this.zze = zzeo.zzq(50000L);
        this.zzf = zzeo.zzq(1000L);
        this.zzg = zzeo.zzq(50000L);
        this.zzh = zzeo.zzq(50000L);
        this.zzi = zzeo.zzq(1000L);
        this.zzj = zzeo.zzq(1000L);
        this.zzk = zzeo.zzq(2000L);
        this.zzl = zzeo.zzq(1000L);
        this.zzm = zzeo.zzq(0L);
        this.zzn = new HashMap();
        this.zzo = -1L;
    }

    private final void zzl(zzox zzoxVar) {
        if (this.zzn.remove(zzoxVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzn.isEmpty()) {
            this.zzd.zza();
        } else {
            this.zzd.zzb(zzj());
        }
    }

    private final boolean zzn(zzki zzkiVar) {
        zzbe zzbeVar = zzkiVar.zzb;
        zzaf zzafVar = zzbeVar.zzb(zzbeVar.zzo(zzkiVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzafVar == null) {
            return false;
        }
        String scheme = zzafVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzo(int i, int i2, String str, String str2) {
        if (i < i2) {
            throw new IllegalArgumentException(zzghs.zzd("%s cannot be less than %s", str, str2));
        }
    }

    private static final boolean zzp(boolean z) {
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zza(zzox zzoxVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzo;
        boolean z = true;
        if (j != -1 && j != id) {
            z = false;
        }
        zzghc.zzi(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzo = id;
        HashMap map = this.zzn;
        if (!map.containsKey(zzoxVar)) {
            map.put(zzoxVar, new zzhu(null));
        }
        zzhu zzhuVar = (zzhu) map.get(zzoxVar);
        zzhuVar.getClass();
        zzhuVar.zzb = 13107200;
        zzhuVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzb(zzki zzkiVar, zzwq zzwqVar, zzyf[] zzyfVarArr) {
        zzhu zzhuVar = (zzhu) this.zzn.get(zzkiVar.zza);
        zzhuVar.getClass();
        boolean zZzn = zzn(zzkiVar);
        int length = zzyfVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i >= length) {
                zzhuVar.zzb = Math.max(13107200, i2);
                zzm();
                return;
            }
            zzyf zzyfVar = zzyfVarArr[i];
            if (zzyfVar != null) {
                switch (zzyfVar.zza().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i3 = 144310272;
                        break;
                    case 2:
                        if (!zZzn) {
                            i3 = 131072000;
                            break;
                        } else {
                            i3 = 19660800;
                            break;
                        }
                    case 3:
                    case 5:
                    default:
                        i3 = 131072;
                        break;
                    case 4:
                        i3 = 26214400;
                        break;
                }
                i2 += i3;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzox zzoxVar) {
        zzl(zzoxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzox zzoxVar) {
        zzl(zzoxVar);
        if (this.zzn.isEmpty()) {
            this.zzo = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zze(zzox zzoxVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzf(zzox zzoxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzki zzkiVar) {
        zzhu zzhuVar = (zzhu) this.zzn.get(zzkiVar.zza);
        zzhuVar.getClass();
        boolean zZzn = zzn(zzkiVar);
        int iZzg = this.zzd.zzg();
        int iZzj = zzj();
        long jMin = zZzn ? this.zzf : this.zze;
        long j = zZzn ? this.zzh : this.zzg;
        float f = zzkiVar.zzf;
        if (f > 1.0f) {
            jMin = Math.min(zzeo.zzv(jMin, f), j);
        }
        long j2 = zzkiVar.zze;
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = zzp(zZzn) || iZzg < iZzj;
            zzhuVar.zza = z;
            if (!z && j2 < 500000) {
                zzds.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || iZzg >= iZzj) {
            zzhuVar.zza = false;
        }
        return zzhuVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        long jMin;
        boolean z;
        boolean z2 = zzkiVar.zzg;
        long j = zzkiVar.zze;
        float f = zzkiVar.zzf;
        boolean zZzn = zzn(zzkiVar);
        long jZzw = zzeo.zzw(j, f);
        if (z2) {
            if (zZzn) {
                jMin = this.zzl;
                z = true;
            } else {
                jMin = this.zzk;
                z = false;
            }
        } else if (zZzn) {
            jMin = this.zzj;
            z = true;
        } else {
            jMin = this.zzi;
            z = false;
        }
        long j2 = zzkiVar.zzh;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin <= 0 || jZzw >= jMin) {
            return true;
        }
        return !zzp(z) && this.zzd.zzg() >= zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzi(zzbe zzbeVar, zzup zzupVar, long j) {
        Iterator it = this.zzn.values().iterator();
        while (it.hasNext()) {
            if (((zzhu) it.next()).zza) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    public final int zzj() {
        Iterator it = this.zzn.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzhu) it.next()).zzb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyv zzk() {
        return this.zzd;
    }
}
