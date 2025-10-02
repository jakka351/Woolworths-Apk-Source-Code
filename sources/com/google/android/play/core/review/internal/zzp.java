package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class zzp extends zzj {
    public final /* synthetic */ IBinder e;
    public final /* synthetic */ zzr f;

    public zzp(zzr zzrVar, IBinder iBinder) {
        this.e = iBinder;
        this.f = zzrVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void a() throws RemoteException {
        zzf zzdVar;
        zzt zztVar = this.f.d;
        int i = zze.d;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            zzdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            zzdVar = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzd(iBinder);
        }
        zzi zziVar = zztVar.b;
        zztVar.m = zzdVar;
        zziVar.a("linkToDeath", new Object[0]);
        try {
            zztVar.m.asBinder().linkToDeath(zztVar.j, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            zziVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", zzi.c(zziVar.f14761a, "linkToDeath failed", objArr), e);
            }
        }
        zztVar.g = false;
        Iterator it = zztVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zztVar.d.clear();
    }
}
