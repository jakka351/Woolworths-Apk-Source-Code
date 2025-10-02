package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int iIsGooglePlayServicesAvailable = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZab = zab(context, minApkVersion);
        if (iZab != -1) {
            return iZab;
        }
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            int i = 0;
            while (true) {
                try {
                    if (i >= sparseIntArray.size()) {
                        iIsGooglePlayServicesAvailable = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iIsGooglePlayServicesAvailable == -1) {
                iIsGooglePlayServicesAvailable = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
            }
            sparseIntArray.put(minApkVersion, iIsGooglePlayServicesAvailable);
        }
        return iIsGooglePlayServicesAvailable;
    }

    public final int zab(Context context, int i) {
        int i2;
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public final void zac() {
        SparseIntArray sparseIntArray = this.zaa;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }
}
