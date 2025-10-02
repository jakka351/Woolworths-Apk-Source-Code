package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.AdobeCallbackWithError;
import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/ResponseListenerContainer;", "Lcom/adobe/marketing/mobile/internal/eventhub/EventListenerContainer;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ResponseListenerContainer extends EventListenerContainer {

    /* renamed from: a, reason: collision with root package name */
    public final String f13186a;
    public final ScheduledFuture b;
    public final AdobeCallbackWithError c;

    public ResponseListenerContainer(String triggerEventId, ScheduledFuture scheduledFuture, AdobeCallbackWithError adobeCallbackWithError) {
        Intrinsics.h(triggerEventId, "triggerEventId");
        this.f13186a = triggerEventId;
        this.b = scheduledFuture;
        this.c = adobeCallbackWithError;
    }
}
