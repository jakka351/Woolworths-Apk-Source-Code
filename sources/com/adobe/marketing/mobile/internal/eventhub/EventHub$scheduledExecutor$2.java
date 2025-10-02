package com.adobe.marketing.mobile.internal.eventhub;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class EventHub$scheduledExecutor$2 extends Lambda implements Function0<ScheduledExecutorService> {
    public static final EventHub$scheduledExecutor$2 h = new EventHub$scheduledExecutor$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
