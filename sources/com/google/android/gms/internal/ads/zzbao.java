package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbao implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbap zza;

    public zzbao(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            try {
                zzbapVar.zzk(null);
                if (zzbapVar.zzi() != null) {
                    zzbapVar.zzj(null);
                }
                zzbapVar.zzh().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
