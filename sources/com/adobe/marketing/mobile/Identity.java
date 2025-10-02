package com.adobe.marketing.mobile;

import au.com.woolworths.android.onesite.analytics.adobe.a;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.VisitorID;
import com.adobe.marketing.mobile.internal.eventhub.EventHub;
import com.adobe.marketing.mobile.internal.eventhub.e;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.StringUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Identity {

    /* loaded from: classes4.dex */
    public static final class IdentityEventDataKeys {
    }

    public static void a(final a aVar) {
        Log.c();
        final androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(aVar, 2);
        Event eventA = new Event.Builder("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity", null).a();
        AdobeCallbackWithError<Event> adobeCallbackWithError = new AdobeCallbackWithError<Event>() { // from class: com.adobe.marketing.mobile.Identity.1
            @Override // com.adobe.marketing.mobile.AdobeCallback, com.adobe.marketing.mobile.EventHistoryResultHandler
            public final void a(Object obj) {
                aVar2.a((Event) obj);
            }

            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public final void c(AdobeError adobeError) {
                AdobeCallback adobeCallback = aVar;
                if (adobeCallback instanceof AdobeCallbackWithError) {
                    ((AdobeCallbackWithError) adobeCallback).c(adobeError);
                }
            }
        };
        if (eventA == null) {
            Log.b("MobileCore", "MobileCore", "Failed to dispatchEventWithResponseCallback - event is null", new Object[0]);
            adobeCallbackWithError.c(AdobeError.d);
        } else {
            EventHub eventHub = EventHub.m;
            eventHub.getClass();
            eventHub.f().submit(new e(eventA, eventHub, adobeCallbackWithError, 1));
            eventHub.b(eventA);
        }
        Log.c();
    }

    public static void b(String str, VisitorID.AuthenticationState authenticationState) {
        if (StringUtils.a("wfgcdds")) {
            Log.d();
            return;
        }
        Log.c();
        HashMap map = new HashMap();
        map.put("wfgcdds", str);
        if (map.isEmpty()) {
            Log.d();
            return;
        }
        Log.c();
        HashMap map2 = new HashMap();
        map2.put("visitoridentifiers", map);
        map2.put("authenticationstate", Integer.valueOf(authenticationState.d));
        map2.put("forcesync", Boolean.FALSE);
        map2.put("issyncevent", Boolean.TRUE);
        Event.Builder builder = new Event.Builder("IdentityRequestIdentity", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity", null);
        builder.d(map2);
        MobileCore.a(builder.a());
        Log.c();
    }
}
