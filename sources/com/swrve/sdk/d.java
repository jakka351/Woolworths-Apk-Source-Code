package com.swrve.sdk;

import android.app.Activity;
import com.swrve.sdk.config.SwrveConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SwrveBase e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ d(SwrveBase swrveBase, Activity activity, int i) {
        this.d = i;
        this.e = swrveBase;
        this.f = activity;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.d;
        Activity activity = this.f;
        SwrveBase swrveBase = this.e;
        switch (i) {
            case 0:
                int i2 = SwrveBase.p0;
                SwrveConfig swrveConfig = swrveBase.l;
                SwrveNotificationConfig swrveNotificationConfig = swrveConfig.f;
                if (!SwrveBase.H0(activity)) {
                    swrveConfig.getClass();
                    if (swrveBase.P && !swrveBase.O) {
                        swrveBase.F0(activity);
                        break;
                    }
                }
                break;
            case 1:
                int i3 = SwrveBase.p0;
                SwrveConfig swrveConfig2 = swrveBase.l;
                SwrveNotificationConfig swrveNotificationConfig2 = swrveConfig2.f;
                if (!SwrveBase.H0(activity)) {
                    swrveConfig2.getClass();
                    if (swrveBase.P) {
                        try {
                            swrveBase.t0(activity);
                            break;
                        } catch (Exception e) {
                            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
                            return;
                        }
                    }
                }
                break;
            default:
                int i4 = SwrveBase.p0;
                if (swrveBase.P) {
                    try {
                        if (swrveBase.f0.equals(activity.getClass().getCanonicalName())) {
                            swrveBase.f0 = "";
                            swrveBase.j0();
                            break;
                        }
                    } catch (Exception e2) {
                        SwrveLogger.c("Exception thrown in Swrve SDK", e2, new Object[0]);
                    }
                }
                break;
        }
    }
}
