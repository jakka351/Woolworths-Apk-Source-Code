package com.woolworths.scanlibrary.util.location;

import android.os.Looper;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.woolworths.scanlibrary.util.location.BoundLocationManager;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ BoundLocationManager.BoundLocationListener d;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int statusCode = ((ApiException) exc).getStatusCode();
        if (statusCode == 6) {
            this.d.e.a(exc);
        } else {
            if (statusCode != 8502) {
                return;
            }
            Timber.f27013a.o("Location settings are inadequate, and cannot be fixed here. Fix in Settings.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        BoundLocationManager.BoundLocationListener boundLocationListener = this.d;
        boundLocationListener.getClass();
        Timber.f27013a.h("All location settings are satisfied.", new Object[0]);
        boundLocationListener.f.requestLocationUpdates(boundLocationListener.h, boundLocationListener.j, (Looper) null);
    }
}
