package com.swrve.sdk;

import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SwrveImp e;
    public final /* synthetic */ String f;
    public final /* synthetic */ JSONObject g;

    public /* synthetic */ l(SwrveImp swrveImp, String str, JSONObject jSONObject, int i) {
        this.d = i;
        this.e = swrveImp;
        this.f = str;
        this.g = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SwrveImp swrveImp = this.e;
                SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveImp.s;
                String string = this.g.toString();
                String str = this.f;
                swrveMultiLayerLocalStorage.f(str, "CMCC2", string, swrveImp.S(str));
                break;
            default:
                SwrveImp swrveImp2 = this.e;
                SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage2 = swrveImp2.s;
                String string2 = this.g.toString();
                String str2 = this.f;
                swrveMultiLayerLocalStorage2.f(str2, "cmrp2s", string2, swrveImp2.S(str2));
                break;
        }
    }
}
