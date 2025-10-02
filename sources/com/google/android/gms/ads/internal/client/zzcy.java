package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbox;

/* loaded from: classes.dex */
public interface zzcy extends IInterface {
    zzbox getAdapterCreator() throws RemoteException;

    zzfc getLiteSdkVersion() throws RemoteException;
}
