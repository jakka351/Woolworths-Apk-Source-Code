package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.AdobeCallbackWithError;
import com.adobe.marketing.mobile.Event;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ EventHub e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e(Object obj, EventHub eventHub, Object obj2, int i) {
        this.d = i;
        this.f = obj;
        this.e = eventHub;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.g;
        EventHub this$0 = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                Class extensionClass = (Class) obj2;
                Function1 function1 = (Function1) obj;
                EventHub eventHub = EventHub.m;
                Intrinsics.h(extensionClass, "$extensionClass");
                String name = extensionClass.getName();
                ConcurrentHashMap concurrentHashMap = this$0.c;
                if (!concurrentHashMap.containsKey(name)) {
                    concurrentHashMap.put(name, new ExtensionContainer(extensionClass, new EventHub$registerExtension$1$container$1(this$0, function1, extensionClass)));
                    break;
                } else if (function1 != null) {
                    this$0.e(new androidx.compose.material.ripple.a(function1, 7));
                    break;
                }
                break;
            default:
                AdobeCallbackWithError adobeCallbackWithError = (AdobeCallbackWithError) obj;
                EventHub eventHub2 = EventHub.m;
                Intrinsics.h(this$0, "this$0");
                ConcurrentLinkedQueue concurrentLinkedQueue = this$0.d;
                String triggerEventId = ((Event) obj2).b;
                a aVar = new a(this$0, adobeCallbackWithError, triggerEventId);
                Object d = this$0.f13181a.getD();
                Intrinsics.g(d, "<get-scheduledExecutor>(...)");
                ScheduledFuture scheduledFutureSchedule = ((ScheduledExecutorService) d).schedule(aVar, 500L, TimeUnit.MILLISECONDS);
                Intrinsics.g(triggerEventId, "triggerEventId");
                concurrentLinkedQueue.add(new ResponseListenerContainer(triggerEventId, scheduledFutureSchedule, adobeCallbackWithError));
                break;
        }
    }
}
