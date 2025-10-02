package com.swrve.sdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.swrve.sdk.localstorage.SQLiteLocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n(SwrveImp swrveImp, HashSet hashSet, k kVar) {
        this.e = swrveImp;
        this.f = hashSet;
        this.g = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.g;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                String str = (String) obj2;
                List list = SwrveImp.i0;
                SwrveLogger.e("Sending device info for userId:%s", str);
                ((SwrveBase) obj).u0(str, (String) serializable, true);
                break;
            default:
                SwrveImp swrveImp = (SwrveImp) obj2;
                HashSet hashSet = (HashSet) serializable;
                k kVar = (k) obj;
                if (swrveImp.J.intValue() == -1) {
                    SwrveLogger.g("SwrveSDK skipping check for excessive asset downloads.", new Object[0]);
                } else if (swrveImp.J.intValue() == 0) {
                    hashSet.clear();
                    SwrveLogger.h("SwrveSDK asset download limit is zero, so removing all assets from download queue", new Object[0]);
                } else {
                    SwrveLogger.g("SwrveSDK checking for excessive asset downloads. QueueSize:%s", Integer.valueOf(hashSet.size()));
                    Iterator it = hashSet.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        SwrveAssetsQueueItem swrveAssetsQueueItem = (SwrveAssetsQueueItem) it.next();
                        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveImp.s;
                        String strD = swrveAssetsQueueItem.d();
                        SQLiteLocalStorage sQLiteLocalStorage = swrveMultiLayerLocalStorage.b;
                        int iG = sQLiteLocalStorage != null ? sQLiteLocalStorage.g(strD) : 0;
                        if (iG >= swrveImp.J.intValue()) {
                            SwrveLogger.h("SwrveSDK asset download limit exceeded for asset %s, so skipping download.", swrveAssetsQueueItem.d());
                            it.remove();
                            z = true;
                        } else {
                            swrveAssetsQueueItem.g(iG);
                        }
                    }
                    SwrveLogger.g("SwrveSDK finished checking for excessive asset downloads. QueueSize:%s", Integer.valueOf(hashSet.size()));
                    if (z) {
                        swrveImp.f0(swrveImp.j.c(), "event", androidx.constraintlayout.core.state.a.r(AppMeasurementSdk.ConditionalUserProperty.NAME, "Swrve.asset_download_limit_exceeded"), null, false);
                    }
                }
                swrveImp.F.a(hashSet, kVar);
                break;
        }
    }

    public /* synthetic */ n(String str, SwrveBase swrveBase, String str2) {
        this.e = str;
        this.g = swrveBase;
        this.f = str2;
    }
}
