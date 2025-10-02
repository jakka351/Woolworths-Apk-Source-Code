package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zbj extends zba {
    final /* synthetic */ zbk zba;

    public zbj(zbk zbkVar) {
        Objects.requireNonNull(zbkVar);
        this.zba = zbkVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbd(Status status) throws RemoteException {
        this.zba.setResult((zbk) status);
    }
}
