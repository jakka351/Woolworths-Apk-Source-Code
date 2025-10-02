package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzblj implements zzapa {
    private volatile zzbkw zza;
    private final Context zzb;

    public zzblj(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzapa
    @Nullable
    public final zzapd zza(zzaph zzaphVar) throws zzapq {
        Parcelable.Creator<zzbkx> creator = zzbkx.CREATOR;
        Map mapZzm = zzaphVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzbkx zzbkxVar = new zzbkx(zzaphVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzbzm zzbzmVar = new zzbzm();
            this.zza = new zzbkw(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzblh(this, zzbzmVar), new zzbli(this, zzbzmVar));
            this.zza.checkAvailabilityAndConnect();
            zzblf zzblfVar = new zzblf(this, zzbkxVar);
            zzgpd zzgpdVar = zzbzh.zza;
            ListenableFuture listenableFutureZzi = zzgot.zzi(zzgot.zzj(zzbzmVar, zzblfVar, zzgpdVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeV)).intValue(), TimeUnit.MILLISECONDS, zzbzh.zzd);
            listenableFutureZzi.addListener(new zzblg(this), zzgpdVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzbkz zzbkzVar = (zzbkz) new zzbut(parcelFileDescriptor).zza(zzbkz.CREATOR);
            if (zzbkzVar == null) {
                return null;
            }
            if (zzbkzVar.zza) {
                throw new zzapq(zzbkzVar.zzb);
            }
            String[] strArr3 = zzbkzVar.zze;
            String[] strArr4 = zzbkzVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < strArr3.length; i2++) {
                map.put(strArr3[i2], strArr4[i2]);
            }
            return new zzapd(zzbkzVar.zzc, zzbkzVar.zzd, map, zzbkzVar.zzg, zzbkzVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzbkw zzc() {
        return this.zza;
    }
}
