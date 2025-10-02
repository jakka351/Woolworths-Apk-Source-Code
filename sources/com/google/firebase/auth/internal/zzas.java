package com.google.firebase.auth.internal;

import androidx.camera.core.impl.b;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;

/* loaded from: classes6.dex */
final class zzas implements OnFailureListener {
    public final /* synthetic */ zzat d;

    public zzas(zzat zzatVar) {
        this.d = zzatVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof FirebaseNetworkException) {
            Logger logger = zzaq.f;
            logger.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            zzaq zzaqVar = this.d.e;
            int i = (int) zzaqVar.b;
            zzaqVar.b = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * zzaqVar.b : i != 960 ? 30L : 960L;
            zzaqVar.f15196a = (zzaqVar.b * 1000) + DefaultClock.getInstance().currentTimeMillis();
            logger.v(b.k(zzaqVar.f15196a, "Scheduling refresh for "), new Object[0]);
            zzaqVar.d.postDelayed(zzaqVar.e, zzaqVar.b * 1000);
        }
    }
}
