package com.google.android.gms.wallet;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes2.dex */
public abstract class zzaq extends BaseImplementation.ApiMethodImpl {
    public zzaq(GoogleApiClient googleApiClient) {
        super(Wallet.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzaq) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    @VisibleForTesting
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract void doExecute(com.google.android.gms.internal.wallet.zzy zzyVar) throws RemoteException;
}
