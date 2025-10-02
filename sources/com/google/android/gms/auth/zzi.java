package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzi implements zzk {
    final /* synthetic */ AccountChangeEventsRequest zza;

    public zzi(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        AccountChangeEventsResponse accountChangeEventsResponseZzh = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzh(this.zza);
        zzl.zzc(accountChangeEventsResponseZzh);
        return accountChangeEventsResponseZzh.getEvents();
    }
}
