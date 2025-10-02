package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zaav implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ StatusPendingResult zaa;

    public zaav(zaaz zaazVar, StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
        Objects.requireNonNull(zaazVar);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zaa.setResult(new Status(8));
    }
}
