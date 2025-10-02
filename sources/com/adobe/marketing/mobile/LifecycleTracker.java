package com.adobe.marketing.mobile;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.services.Log;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/LifecycleTracker;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class LifecycleTracker implements DefaultLifecycleObserver {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        Log.a();
        HashMap map = new HashMap();
        map.put(UrlHandler.ACTION, "pause");
        Event.Builder builder = new Event.Builder("Lifecycle Pause", "com.adobe.eventType.generic.lifecycle", "com.adobe.eventSource.requestContent", null);
        builder.d(map);
        MobileCore.a(builder.a());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.h(owner, "owner");
        Log.a();
        HashMap map = new HashMap();
        map.put(UrlHandler.ACTION, "start");
        map.put("additionalcontextdata", null);
        Event.Builder builder = new Event.Builder("Lifecycle Resume", "com.adobe.eventType.generic.lifecycle", "com.adobe.eventSource.requestContent", null);
        builder.d(map);
        MobileCore.a(builder.a());
    }
}
