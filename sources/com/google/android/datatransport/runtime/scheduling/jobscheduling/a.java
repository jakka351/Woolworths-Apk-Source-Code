package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Uploader d;
    public final /* synthetic */ TransportContext e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Runnable g;

    public /* synthetic */ a(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        this.d = uploader;
        this.e = transportContext;
        this.f = i;
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TransportContext transportContext = this.e;
        int i = this.f;
        Runnable runnable = this.g;
        Uploader uploader = this.d;
        SynchronizationGuard synchronizationGuard = uploader.f;
        try {
            try {
                EventStore eventStore = uploader.c;
                Objects.requireNonNull(eventStore);
                synchronizationGuard.d(new au.com.woolworths.product.details.epoxy.a(eventStore, 12));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader.f14476a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    synchronizationGuard.d(new au.com.woolworths.feature.rewards.offers.b(uploader, transportContext, i));
                } else {
                    uploader.a(transportContext, i);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                uploader.d.b(transportContext, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
