package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes5.dex */
abstract class zza extends zzc {
    public final int zza;

    @Nullable
    public final Bundle zzb;
    final /* synthetic */ BaseGmsClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zza(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzc = baseGmsClient;
        this.zza = i;
        this.zzb = bundle;
    }

    public abstract boolean zza();

    public abstract void zzb(ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zzc(Object obj) {
        int i = this.zza;
        if (i != 0) {
            this.zzc.zzd(1, null);
            Bundle bundle = this.zzb;
            zzb(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else {
            if (zza()) {
                return;
            }
            this.zzc.zzd(1, null);
            zzb(new ConnectionResult(8, null));
        }
    }
}
