package com.swrve.sdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.swrve.sdk.localstorage.SQLiteLocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class QueueEventRunnable implements Runnable {
    public SwrveMultiLayerLocalStorage d;
    public String e;
    public String f;
    public HashMap g;
    public Map h;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = this.g;
        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.d;
        String str = this.f;
        String str2 = this.e;
        String strB = "";
        try {
            int iP = SwrveCommon.f19047a.p();
            strB = EventHelper.b(this.f, map, this.h, iP, System.currentTimeMillis());
            if (str.equals("device_update") || (str.equals("event") && map.containsKey(AppMeasurementSdk.ConditionalUserProperty.NAME) && map.get(AppMeasurementSdk.ConditionalUserProperty.NAME).toString().startsWith("Swrve."))) {
                SQLiteLocalStorage sQLiteLocalStorage = swrveMultiLayerLocalStorage.b;
                if (sQLiteLocalStorage != null) {
                    sQLiteLocalStorage.c(str2, strB);
                } else {
                    swrveMultiLayerLocalStorage.a(str2, strB);
                }
            } else {
                swrveMultiLayerLocalStorage.a(str2, strB);
            }
            SwrveLogger.e("Event queued of type: %s and seqNum:%s for userId:%s", str, Integer.valueOf(iP), str2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(strB);
            QaUser.p(arrayList);
        } catch (Exception e) {
            SwrveLogger.c(YU.a.A("Unable to insert QueueEvent into local storage. EventString:", strB), e, new Object[0]);
        }
    }
}
