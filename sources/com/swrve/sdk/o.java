package com.swrve.sdk;

import com.swrve.sdk.config.SwrveConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SwrveImp e;

    public /* synthetic */ o(SwrveBase swrveBase, int i) {
        this.d = i;
        this.e = swrveBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Swrve swrve = (Swrve) this.e;
                swrve.j.e();
                swrve.j.d();
                if (swrve.j.b() != SwrveTrackingState.g) {
                    SwrveConfig swrveConfig = swrve.l;
                    SwrveInitMode swrveInitMode = swrveConfig.i;
                    boolean z = swrveConfig.j;
                    if ((swrveInitMode == SwrveInitMode.d && z) || (swrveInitMode == SwrveInitMode.e && z && swrve.j.f19068a.getSharedPreferences("swrve_prefs", 0).getString("userId", null) != null)) {
                        SwrveProfileManager swrveProfileManager = swrve.j;
                        swrveProfileManager.f19068a.getSharedPreferences("swrve_prefs", 0).edit().putString("userId", swrveProfileManager.c()).commit();
                        if (swrve.j.b() == SwrveTrackingState.d) {
                            swrve.j.f(SwrveTrackingState.e);
                        }
                        swrve.P = true;
                        break;
                    }
                } else {
                    SwrveLogger.e("SwrveSDK is currently in stopped state and will not start until an api is called.", new Object[0]);
                    break;
                }
                break;
            default:
                SwrveResourcesListener swrveResourcesListener = this.e.o;
                if (swrveResourcesListener != null) {
                    try {
                        swrveResourcesListener.a();
                        break;
                    } catch (Exception e) {
                        SwrveLogger.c("SwrveSDK exception trying to call SwrveResourcesListener.onResourcesUpdated", e, new Object[0]);
                    }
                }
                break;
        }
    }
}
