package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zaw implements zabu {
    final /* synthetic */ zax zaa;

    public /* synthetic */ zaw(zax zaxVar, byte[] bArr) {
        Objects.requireNonNull(zaxVar);
        this.zaa = zaxVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zaa(@Nullable Bundle bundle) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zav(ConnectionResult.RESULT_SUCCESS);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zab(@NonNull ConnectionResult connectionResult) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zav(connectionResult);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public final void zac(int i, boolean z) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            if (zaxVar.zaw()) {
                zaxVar.zax(false);
                zaxVar.zap(i, z);
            } else {
                zaxVar.zax(true);
                zaxVar.zar().onConnectionSuspended(i);
            }
            zaxVar.zay().unlock();
        } catch (Throwable th) {
            this.zaa.zay().unlock();
            throw th;
        }
    }
}
