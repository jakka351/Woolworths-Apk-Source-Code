package au.com.woolworths.foundation.swrve.tracking.impl;

import androidx.lifecycle.compose.d;
import au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent;
import au.com.woolworths.foundation.swrve.tracking.api.SwrveEventTracker;
import com.swrve.sdk.SwrveSDKBase;
import com.swrve.sdk.messaging.SwrveEmbeddedCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/swrve/tracking/impl/SwrveEventTrackerImpl;", "Lau/com/woolworths/foundation/swrve/tracking/api/SwrveEventTracker;", "tracking-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SwrveEventTrackerImpl implements SwrveEventTracker {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f8912a = new d(12);

    public static void a() {
        if (SwrveSDKBase.f19075a == null) {
            throw new IllegalArgumentException("SwrveSDK not initialized.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public final void b(SwrveEvent event) {
        Intrinsics.h(event, "event");
        if (((Boolean) this.f8912a.invoke()).booleanValue()) {
            return;
        }
        a();
        String d = event.getD();
        SwrveSDKBase.a();
        SwrveSDKBase.f19075a.o(d);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public final void c(SwrveEvent swrveEvent, Map map) {
        if (((Boolean) this.f8912a.invoke()).booleanValue()) {
            return;
        }
        a();
        String d = swrveEvent.getD();
        SwrveSDKBase.a();
        SwrveSDKBase.f19075a.E(d, map);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public final void d(int i, String buttonName) {
        Object next;
        Intrinsics.h(buttonName, "buttonName");
        if (((Boolean) this.f8912a.invoke()).booleanValue()) {
            return;
        }
        a();
        SwrveSDKBase.a();
        ArrayList arrayListZ = SwrveSDKBase.f19075a.z();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListZ) {
            if (obj instanceof SwrveEmbeddedCampaign) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (i == ((SwrveEmbeddedCampaign) next).c) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SwrveEmbeddedCampaign swrveEmbeddedCampaign = (SwrveEmbeddedCampaign) next;
        if (swrveEmbeddedCampaign != null) {
            SwrveEmbeddedMessage swrveEmbeddedMessage = swrveEmbeddedCampaign.o;
            SwrveSDKBase.a();
            SwrveSDKBase.f19075a.n(swrveEmbeddedMessage, buttonName);
        }
    }
}
