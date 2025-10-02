package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* loaded from: classes5.dex */
public final class zzo extends zza implements IInterface {
    public zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void zzd(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, createWalletObjectsRequest);
        zzc.zzc(parcelZza, bundle);
        zzc.zzd(parcelZza, zzqVar);
        zzc(6, parcelZza);
    }

    public final void zze(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, paymentCardRecognitionIntentRequest);
        zzc.zzc(parcelZza, bundle);
        zzc.zzd(parcelZza, zzqVar);
        zzc(24, parcelZza);
    }

    public final void zzf(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, isReadyToPayRequest);
        zzc.zzc(parcelZza, bundle);
        zzc.zzd(parcelZza, zzqVar);
        zzc(14, parcelZza);
    }

    public final void zzg(PaymentDataRequest paymentDataRequest, Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, paymentDataRequest);
        zzc.zzc(parcelZza, bundle);
        zzc.zzd(parcelZza, zzqVar);
        zzc(19, parcelZza);
    }
}
