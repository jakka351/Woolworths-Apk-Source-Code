package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public final class zzbth extends zzaya implements zzbti {
    public static zzbti zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof zzbti ? (zzbti) iInterfaceQueryLocalInterface : new zzbtg(iBinder);
    }
}
