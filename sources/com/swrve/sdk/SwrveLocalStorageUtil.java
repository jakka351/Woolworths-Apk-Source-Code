package com.swrve.sdk;

import com.salesforce.marketingcloud.storage.db.k;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import java.util.UUID;

/* loaded from: classes.dex */
class SwrveLocalStorageUtil {
    public static synchronized String a(SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage) {
        String strC = swrveMultiLayerLocalStorage.c("", k.a.p);
        if (strC != null && strC.length() > 0) {
            return strC;
        }
        String string = UUID.randomUUID().toString();
        swrveMultiLayerLocalStorage.g("", k.a.p, string);
        return string;
    }
}
