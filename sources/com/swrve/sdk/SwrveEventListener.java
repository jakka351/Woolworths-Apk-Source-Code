package com.swrve.sdk;

import com.swrve.sdk.messaging.SwrveBaseMessage;
import com.swrve.sdk.messaging.SwrveEmbeddedListener;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import com.swrve.sdk.messaging.SwrveMessage;
import com.swrve.sdk.messaging.SwrveOrientation;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class SwrveEventListener implements ISwrveEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final SwrveBase f19051a;
    public final SwrveEmbeddedListener b;

    public SwrveEventListener(SwrveBase swrveBase, au.com.woolworths.foundation.swrve.embedded.campaign.a aVar) {
        this.f19051a = swrveBase;
        this.b = aVar;
    }

    public final void a(SwrveBaseMessage swrveBaseMessage, String str) {
        SwrveLogger.g("SwrveSDK: %s is a control message and will not be displayed.", Integer.valueOf(swrveBaseMessage.getId()));
        swrveBaseMessage.a().p();
        this.f19051a.O0(swrveBaseMessage.getId(), str);
    }

    public final void b(String str, Map map) {
        SwrveBaseMessage swrveBaseMessageO0;
        if (SwrveHelper.p(str)) {
            return;
        }
        SwrveBase swrveBase = this.f19051a;
        swrveBase.O();
        SwrveNotificationConfig swrveNotificationConfig = swrveBase.l.f;
        try {
            swrveBaseMessageO0 = swrveBase.o0(str, map, swrveBase.P().getResources().getConfiguration().orientation == 1 ? SwrveOrientation.d : SwrveOrientation.e, new Date());
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            swrveBaseMessageO0 = null;
        }
        if (swrveBaseMessageO0 != null) {
            swrveBase.e0 = map;
            if (swrveBaseMessageO0 instanceof SwrveMessage) {
                SwrveMessage swrveMessage = (SwrveMessage) swrveBaseMessageO0;
                if (swrveBase.K(swrveMessage)) {
                    if (swrveBaseMessageO0.c()) {
                        a(swrveBaseMessageO0, "false");
                    } else {
                        swrveBase.M(swrveMessage);
                    }
                }
            } else if (swrveBaseMessageO0 instanceof SwrveEmbeddedMessage) {
                HashMap mapH0 = swrveBase.h0(map);
                SwrveEmbeddedListener swrveEmbeddedListener = this.b;
                if (swrveEmbeddedListener != null) {
                    swrveBase.P();
                    swrveEmbeddedListener.a((SwrveEmbeddedMessage) swrveBaseMessageO0, mapH0);
                } else if (swrveBaseMessageO0.c()) {
                    a(swrveBaseMessageO0, "true");
                }
            }
            swrveBase.e0 = null;
        }
    }
}
