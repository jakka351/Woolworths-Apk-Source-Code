package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes5.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaeVar);
        com.google.android.gms.internal.base.zac.zab(parcelZaa, apiFeatureRequest);
        zac(1, parcelZaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaeVar);
        com.google.android.gms.internal.base.zac.zab(parcelZaa, apiFeatureRequest);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zahVar);
        zac(2, parcelZaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaeVar);
        com.google.android.gms.internal.base.zac.zab(parcelZaa, apiFeatureRequest);
        zac(3, parcelZaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, iStatusCallback);
        com.google.android.gms.internal.base.zac.zab(parcelZaa, apiFeatureRequest);
        zac(4, parcelZaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, iStatusCallback);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zahVar);
        zac(6, parcelZaa);
    }
}
