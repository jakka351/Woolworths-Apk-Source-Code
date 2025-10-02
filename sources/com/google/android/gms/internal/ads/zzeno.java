package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzeno implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    public zzeno(zzgpd zzgpdVar, Context context) {
        this.zzb = zzgpdVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        final ContentResolver contentResolver;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznJ)).booleanValue() && (contentResolver = this.zza.getContentResolver()) != null) {
            return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzenn
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    ContentResolver contentResolver2 = contentResolver;
                    return new zzenp(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
                }
            });
        }
        return zzgot.zza(new zzenp(null, false));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 61;
    }
}
