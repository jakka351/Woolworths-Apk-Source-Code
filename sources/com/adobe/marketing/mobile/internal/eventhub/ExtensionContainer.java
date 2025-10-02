package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.EventHistoryRequest;
import com.adobe.marketing.mobile.Extension;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.ExtensionEventListener;
import com.adobe.marketing.mobile.SharedStateResolution;
import com.adobe.marketing.mobile.SharedStateResolver;
import com.adobe.marketing.mobile.SharedStateResult;
import com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.EventDataUtils;
import com.adobe.marketing.mobile.util.SerialWorkDispatcher;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/ExtensionContainer;", "Lcom/adobe/marketing/mobile/ExtensionApi;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ExtensionContainer extends ExtensionApi {

    /* renamed from: a, reason: collision with root package name */
    public final Class f13183a;
    public String b;
    public String c;
    public String d;
    public Event e;
    public Extension f;
    public Object g;
    public final ConcurrentLinkedQueue h;
    public final SerialWorkDispatcher.WorkHandler i;
    public final SerialWorkDispatcher j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/ExtensionContainer$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public ExtensionContainer(Class extensionClass, Function1 function1) {
        Intrinsics.h(extensionClass, "extensionClass");
        this.f13183a = extensionClass;
        this.h = new ConcurrentLinkedQueue();
        SerialWorkDispatcher.WorkHandler<Event> workHandler = new SerialWorkDispatcher.WorkHandler<Event>() { // from class: com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer$dispatchJob$1
            /* JADX WARN: Removed duplicated region for block: B:32:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean a(java.lang.Object r10) {
                /*
                    r9 = this;
                    com.adobe.marketing.mobile.Event r10 = (com.adobe.marketing.mobile.Event) r10
                    com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer r0 = r9.f13184a
                    com.adobe.marketing.mobile.Extension r1 = r0.f
                    if (r1 == 0) goto L67
                    boolean r1 = r1.g(r10)
                    r2 = 1
                    if (r1 != r2) goto L67
                    java.util.concurrent.ConcurrentLinkedQueue r1 = r0.h
                    java.util.Iterator r1 = r1.iterator()
                L15:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L64
                    java.lang.Object r3 = r1.next()
                    com.adobe.marketing.mobile.internal.eventhub.ExtensionListenerContainer r3 = (com.adobe.marketing.mobile.internal.eventhub.ExtensionListenerContainer) r3
                    java.lang.String r4 = r3.b
                    java.lang.String r5 = r3.f13185a
                    java.lang.String r6 = r10.g
                    java.lang.String r7 = "com.adobe.eventSource._wildcard_"
                    java.lang.String r8 = "com.adobe.eventType._wildcard_"
                    if (r6 == 0) goto L3a
                    boolean r5 = r5.equals(r8)
                    if (r5 == 0) goto L15
                    boolean r4 = r4.equals(r7)
                    if (r4 == 0) goto L15
                    goto L56
                L3a:
                    java.lang.String r6 = r10.d
                    boolean r6 = r5.equalsIgnoreCase(r6)
                    if (r6 == 0) goto L4a
                    java.lang.String r6 = r10.c
                    boolean r6 = r4.equalsIgnoreCase(r6)
                    if (r6 != 0) goto L56
                L4a:
                    boolean r5 = r5.equals(r8)
                    if (r5 == 0) goto L15
                    boolean r4 = r4.equals(r7)
                    if (r4 == 0) goto L15
                L56:
                    com.adobe.marketing.mobile.ExtensionEventListener r3 = r3.c     // Catch: java.lang.Exception -> L5c
                    r3.a(r10)     // Catch: java.lang.Exception -> L5c
                    goto L15
                L5c:
                    r3 = move-exception
                    r3.toString()
                    com.adobe.marketing.mobile.services.Log.a()
                    goto L15
                L64:
                    r0.e = r10
                    return r2
                L67:
                    r10 = 0
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.internal.eventhub.ExtensionContainer$dispatchJob$1.a(java.lang.Object):boolean");
            }
        };
        this.i = workHandler;
        g gVar = new g(0, this, function1);
        androidx.compose.material.ripple.a aVar = new androidx.compose.material.ripple.a(this, 9);
        SerialWorkDispatcher serialWorkDispatcher = new SerialWorkDispatcher(extensionClass.getName(), workHandler);
        this.j = serialWorkDispatcher;
        serialWorkDispatcher.i = gVar;
        serialWorkDispatcher.j = aVar;
        serialWorkDispatcher.d();
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final SharedStateResolver a(Event event) {
        String str = this.b;
        if (str == null) {
            i();
            Log.d();
            return null;
        }
        EventHub eventHub = EventHub.m;
        eventHub.getClass();
        return (SharedStateResolver) eventHub.f().submit(new a(eventHub, str, event)).get();
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void b(Map state, Event event) throws ExecutionException, InterruptedException {
        Map mapB;
        Intrinsics.h(state, "state");
        String str = this.b;
        if (str == null) {
            i();
            Log.d();
            return;
        }
        EventHub eventHub = EventHub.m;
        eventHub.getClass();
        try {
            mapB = EventDataUtils.b(0, state);
        } catch (Exception e) {
            SharedStateType.d.toString();
            e.toString();
            Log.d();
            mapB = null;
        }
        Object obj = eventHub.f().submit(new d(eventHub, str, mapB, event)).get();
        Intrinsics.g(obj, "eventHubExecutor.submit(callable).get()");
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void c(Event event) {
        Intrinsics.h(event, "event");
        EventHub eventHub = EventHub.m;
        EventHub.m.b(event);
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void d(EventHistoryRequest[] eventHistoryRequests, boolean z, au.com.woolworths.product.details.b bVar) {
        Intrinsics.h(eventHistoryRequests, "eventHistoryRequests");
        AndroidEventHistory androidEventHistory = EventHub.m.k;
        if (androidEventHistory != null) {
            ((ExecutorService) androidEventHistory.b.getD()).submit(new com.adobe.marketing.mobile.internal.eventhub.history.a(eventHistoryRequests, z, androidEventHistory, bVar));
        }
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final SharedStateResult e(String extensionName, Event event, SharedStateResolution sharedStateResolution) {
        Intrinsics.h(extensionName, "extensionName");
        EventHub eventHub = EventHub.m;
        eventHub.getClass();
        return (SharedStateResult) eventHub.f().submit(new d(eventHub, extensionName, event, sharedStateResolution)).get();
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void f(String str, String str2, ExtensionEventListener extensionEventListener) {
        this.h.add(new ExtensionListenerContainer(str, str2, extensionEventListener));
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void g() {
        this.j.c();
    }

    @Override // com.adobe.marketing.mobile.ExtensionApi
    public final void h() {
        SerialWorkDispatcher serialWorkDispatcher = this.j;
        synchronized (serialWorkDispatcher.h) {
            if (serialWorkDispatcher.g == SerialWorkDispatcher.State.g) {
                throw new IllegalStateException("Cannot pause SerialWorkDispatcher (" + serialWorkDispatcher.f13256a + "). Already shutdown.");
            }
            if (serialWorkDispatcher.g == SerialWorkDispatcher.State.e) {
                serialWorkDispatcher.g = SerialWorkDispatcher.State.f;
            } else {
                serialWorkDispatcher.a();
                Log.a();
            }
        }
    }

    public final String i() {
        if (this.f == null) {
            return "ExtensionContainer";
        }
        StringBuilder sb = new StringBuilder("ExtensionContainer[");
        sb.append(this.b);
        sb.append('(');
        return YU.a.o(sb, this.d, ")]");
    }
}
