package com.swrve.sdk;

import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SwrveBase e;

    public /* synthetic */ e(SwrveBase swrveBase, int i) {
        this.d = i;
        this.e = swrveBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        int i2 = 1;
        SwrveBase swrveBase = this.e;
        switch (i) {
            case 0:
                int i3 = SwrveBase.p0;
                if (swrveBase.P) {
                    try {
                        SwrveLogger.e("onPause", new Object[0]);
                        if (swrveBase.I0()) {
                            try {
                                swrveBase.l0(new e(swrveBase, i2));
                            } catch (Exception e) {
                                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
                            }
                        }
                        swrveBase.r = swrveBase.B().getTime() + swrveBase.q;
                        swrveBase.i0(swrveBase.j.c());
                        break;
                    } catch (Exception e2) {
                        SwrveLogger.c("Exception thrown in Swrve SDK", e2, new Object[0]);
                        return;
                    }
                }
                break;
            case 1:
                int i4 = SwrveBase.p0;
                swrveBase.getClass();
                try {
                    SwrveLogger.e("Flushing to disk", new Object[0]);
                    SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveBase.s;
                    if (swrveMultiLayerLocalStorage != null) {
                        swrveMultiLayerLocalStorage.b();
                        break;
                    }
                } catch (Exception e3) {
                    SwrveLogger.c("Flush to disk failed", e3, new Object[0]);
                    return;
                }
                break;
            default:
                if (swrveBase.Q != null) {
                    String strC = swrveBase.j.c();
                    String strA = swrveBase.j.a();
                    boolean zIsEmpty = swrveBase.s.d(1, strC).isEmpty();
                    if (!zIsEmpty || swrveBase.N) {
                        SwrveLogger.b("SwrveSDK events recently queued or sent, so sending and executing a delayed refresh of campaigns", new Object[0]);
                        if (!zIsEmpty) {
                            swrveBase.u0(strC, strA, false);
                        }
                        swrveBase.N = false;
                        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new m(swrveBase, scheduledExecutorServiceNewSingleThreadScheduledExecutor, 0), swrveBase.I.longValue(), TimeUnit.MILLISECONDS);
                        break;
                    }
                } else {
                    SwrveLogger.h("Not executing checkForCampaignAndResourcesUpdates because initialisedTime is null indicating the sdk is not initialised.", new Object[0]);
                    break;
                }
                break;
        }
    }
}
