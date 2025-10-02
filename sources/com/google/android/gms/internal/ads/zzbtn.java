package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbtn {
    private static zzbye zze;
    private final Context zza;
    private final AdFormat zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzek zzc;

    @Nullable
    private final String zzd;

    public zzbtn(Context context, AdFormat adFormat, @Nullable com.google.android.gms.ads.internal.client.zzek zzekVar, @Nullable String str) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzekVar;
        this.zzd = str;
    }

    @Nullable
    public static zzbye zza(Context context) {
        zzbye zzbyeVar;
        synchronized (zzbtn.class) {
            try {
                if (zze == null) {
                    zze = com.google.android.gms.ads.internal.client.zzbb.zzb().zzj(context, new zzbot());
                }
                zzbyeVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyeVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzbye zzbyeVarZza = zza(context);
        if (zzbyeVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzc;
        if (zzekVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzi(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzekVar.zzp(jCurrentTimeMillis);
            zzmVarZza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzekVar);
        }
        try {
            zzbyeVarZza.zze(iObjectWrapperWrap, new zzbyi(this.zzd, this.zzb.name(), null, zzmVarZza, 0, null), new zzbtm(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
