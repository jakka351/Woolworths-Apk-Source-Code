package com.google.android.gms.internal.wallet;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.wobs.WalletObjects;

/* loaded from: classes5.dex */
public final class zzab implements WalletObjects {
    @Override // com.google.android.gms.wallet.wobs.WalletObjects
    @SuppressLint
    public final void createWalletObjects(GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        googleApiClient.enqueue(new zzaa(this, googleApiClient, createWalletObjectsRequest, i));
    }
}
