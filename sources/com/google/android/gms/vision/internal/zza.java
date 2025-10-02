package com.google.android.gms.vision.internal;

import android.os.RemoteException;
import com.google.android.gms.common.util.PlatformVersion;

/* loaded from: classes5.dex */
public final class zza {
    public static RemoteException zza(String str) {
        return PlatformVersion.isAtLeastIceCreamSandwichMR1() ? new RemoteException(str) : new RemoteException();
    }
}
