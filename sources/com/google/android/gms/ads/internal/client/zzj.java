package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
final /* synthetic */ class zzj implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzj zza = new zzj();

    private /* synthetic */ zzj() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzby(iBinder);
    }
}
