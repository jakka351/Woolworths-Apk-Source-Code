package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zze extends com.google.android.gms.internal.wallet.zza implements IInterface {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.wallet.zzc.zzd(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.wallet.zzc.zzc(parcelZza, buttonOptions);
        return a.i(zzb(1, parcelZza));
    }
}
