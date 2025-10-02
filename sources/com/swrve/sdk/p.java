package com.swrve.sdk;

import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SwrveImp e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ p(SwrveImp swrveImp, String str, String str2, int i) {
        this.d = i;
        this.e = swrveImp;
        this.f = str;
        this.g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SwrveImp swrveImp = this.e;
                SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveImp.s;
                String str = this.f;
                swrveMultiLayerLocalStorage.f(str, "swrve.q1", this.g, swrveImp.S(str));
                QaUser.o();
                break;
            default:
                this.e.s.g(this.f, "SwrveCampaignSettings", this.g);
                SwrveLogger.e("Saved and flushed campaign state in cache", new Object[0]);
                break;
        }
    }
}
