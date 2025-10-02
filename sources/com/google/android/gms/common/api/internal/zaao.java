package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
final class zaao extends com.google.android.gms.signin.internal.zac {
    private final WeakReference zaa;

    public zaao(zaar zaarVar) {
        this.zaa = new WeakReference(zaarVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        zaar zaarVar = (zaar) this.zaa.get();
        if (zaarVar == null) {
            return;
        }
        zaarVar.zar().zar(new zaan(this, zaarVar, zaarVar, zakVar));
    }
}
