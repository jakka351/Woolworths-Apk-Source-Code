package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes5.dex */
public interface zzq extends IInterface {
    void zzb(int i, @Nullable FullWallet fullWallet, Bundle bundle) throws RemoteException;

    void zzc(Status status, boolean z, Bundle bundle) throws RemoteException;

    void zzd(int i, @Nullable MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    void zze(Status status, @Nullable PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) throws RemoteException;

    void zzf(Status status, @Nullable PaymentData paymentData, Bundle bundle) throws RemoteException;

    void zzg(int i, boolean z, Bundle bundle) throws RemoteException;

    void zzh(int i, Bundle bundle) throws RemoteException;
}
