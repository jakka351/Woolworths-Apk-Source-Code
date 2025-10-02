package com.swrve.sdk;

import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTResponse;

/* loaded from: classes6.dex */
abstract class RESTCacheResponseListener implements IRESTResponseListener {
    @Override // com.swrve.sdk.rest.IRESTResponseListener
    public final void b(RESTResponse rESTResponse) {
        int i = rESTResponse.f19107a;
        String str = null;
        if (!SwrveHelper.v(i)) {
            throw null;
        }
        String str2 = rESTResponse.b;
        try {
            throw null;
        } catch (Exception unused) {
            if (str2 != null && !str2.equals("")) {
                str = str2;
            }
            c(i, str);
        }
    }

    public abstract void c(int i, String str);
}
