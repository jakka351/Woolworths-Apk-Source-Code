package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

/* loaded from: classes5.dex */
final class zzaa extends zzas {
    final /* synthetic */ CreateWalletObjectsRequest zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzab zzabVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        super(googleApiClient);
        this.zza = createWalletObjectsRequest;
        this.zzb = i;
    }

    @Override // com.google.android.gms.wallet.zzaq, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: zza */
    public final void doExecute(zzy zzyVar) throws PendingIntent.CanceledException {
        zzyVar.zzp(this.zza, this.zzb);
        setResult((zzaa) Status.RESULT_SUCCESS);
    }
}
