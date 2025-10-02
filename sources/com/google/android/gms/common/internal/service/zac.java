package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zac extends zaf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zac(zae zaeVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        Objects.requireNonNull(zaeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zal) ((zah) anyClient).getService()).zae(new zad(this));
    }
}
