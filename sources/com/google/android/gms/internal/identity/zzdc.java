package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final /* synthetic */ class zzdc implements RemoteCall {
    static final /* synthetic */ zzdc zza = new zzdc();

    private /* synthetic */ zzdc() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ((zzv) ((zzdz) obj).getService()).zzE(new zzdm((TaskCompletionSource) obj2));
    }
}
