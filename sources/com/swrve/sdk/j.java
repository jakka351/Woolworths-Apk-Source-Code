package com.swrve.sdk;

import com.swrve.sdk.SwrveProfileManager;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;

/* loaded from: classes6.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j(SwrveGoogleUtil swrveGoogleUtil, SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage, String str, String str2) {
        this.g = swrveGoogleUtil;
        this.h = swrveMultiLayerLocalStorage;
        this.e = str;
        this.f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.d) {
            case 0:
                ((SwrveGoogleUtil) this.g).b((SwrveMultiLayerLocalStorage) this.h, this.e, this.f);
                break;
            default:
                SwrveProfileManager swrveProfileManager = (SwrveProfileManager) this.g;
                swrveProfileManager.e.a(this.e, this.f, (SwrveProfileManager.IdentifyIRESTResponseListener) this.h);
                break;
        }
    }

    public /* synthetic */ j(SwrveProfileManager swrveProfileManager, String str, String str2, SwrveProfileManager.IdentifyIRESTResponseListener identifyIRESTResponseListener) {
        this.g = swrveProfileManager;
        this.e = str;
        this.f = str2;
        this.h = identifyIRESTResponseListener;
    }
}
