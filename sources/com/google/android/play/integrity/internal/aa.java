package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class aa extends t {
    public final /* synthetic */ IBinder g;
    public final /* synthetic */ ad h;

    public aa(ad adVar, IBinder iBinder) {
        this.h = adVar;
        this.g = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() throws RemoteException {
        ae aeVar = this.h.d;
        aeVar.n = (IInterface) aeVar.i.a(this.g);
        s sVar = aeVar.b;
        sVar.b("linkToDeath", new Object[0]);
        try {
            aeVar.n.asBinder().linkToDeath(aeVar.k, 0);
        } catch (RemoteException e) {
            sVar.a(e, "linkToDeath failed", new Object[0]);
        }
        aeVar.g = false;
        Iterator it = aeVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        aeVar.d.clear();
    }
}
