package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.SharedStateResolution;
import com.adobe.marketing.mobile.SharedStateStatus;
import com.adobe.marketing.mobile.WrapperType;
import com.adobe.marketing.mobile.internal.eventhub.history.AndroidEventHistory;
import com.adobe.marketing.mobile.internal.util.MapExtensionsKt;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.EventDataUtils;
import com.adobe.marketing.mobile.util.SerialWorkDispatcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHub;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class EventHub {
    public static final EventHub m = new EventHub();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f13181a = LazyKt.b(EventHub$scheduledExecutor$2.h);
    public final Lazy b = LazyKt.b(EventHub$eventHubExecutor$2.h);
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public final AtomicInteger f = new AtomicInteger(0);
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public boolean h;
    public final SerialWorkDispatcher.WorkHandler i;
    public final SerialWorkDispatcher j;
    public AndroidEventHistory k;
    public final WrapperType l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHub$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SharedStateResolution.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public EventHub() {
        SerialWorkDispatcher.WorkHandler<Event> workHandler = new SerialWorkDispatcher.WorkHandler<Event>() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$dispatchJob$1
            @Override // com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler
            public final boolean a(Object obj) {
                AndroidEventHistory androidEventHistory;
                Event event = (Event) obj;
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.d = event;
                EventHub eventHub = this.f13182a;
                Iterator it = eventHub.e.iterator();
                while (it.hasNext()) {
                    objectRef.d = ((EventPreprocessor) it.next()).a((Event) objectRef.d);
                }
                if (((Event) objectRef.d).g != null) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = eventHub.d;
                    Function1<ResponseListenerContainer, Boolean> function1 = new Function1<ResponseListenerContainer, Boolean>() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$dispatchJob$1$doWork$matchingResponseListeners$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ResponseListenerContainer responseListenerContainer = (ResponseListenerContainer) obj2;
                            Event event2 = (Event) objectRef.d;
                            responseListenerContainer.getClass();
                            Intrinsics.h(event2, "event");
                            boolean z = false;
                            if (Intrinsics.c(event2.g, responseListenerContainer.f13186a)) {
                                ScheduledFuture scheduledFuture = responseListenerContainer.b;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    };
                    ArrayList arrayList = new ArrayList();
                    CollectionsKt.f0(concurrentLinkedQueue, new EventHubKt$filterRemove$1(arrayList, function1));
                    eventHub.e(new g(2, arrayList, objectRef));
                }
                Collection collectionValues = eventHub.c.values();
                Intrinsics.g(collectionValues, "registeredExtensions.values");
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((ExtensionContainer) it2.next()).j.b(objectRef.d);
                }
                if (LoggingMode.d.compareTo(LoggingMode.e) >= 0) {
                    eventHub.g(event);
                    Objects.toString(objectRef.d);
                    Log.a();
                }
                Event event2 = (Event) objectRef.d;
                if (event2.i == null || (androidEventHistory = eventHub.k) == null) {
                    return true;
                }
                ((ExecutorService) androidEventHistory.b.getD()).submit(new androidx.camera.core.processing.g(14, event2, androidEventHistory, new androidx.compose.runtime.snapshots.a(objectRef, 3)));
                return true;
            }
        };
        this.i = workHandler;
        this.j = new SerialWorkDispatcher("EventHub", workHandler);
        f().submit(new e(EventHubPlaceholderExtension.class, this, null, 0));
        this.l = WrapperType.NONE;
    }

    public final boolean a(String str, Map map, Event event) throws JSONException {
        boolean zB;
        SharedStateType sharedStateType = SharedStateType.d;
        SharedStateManager sharedStateManagerI = i(str);
        if (sharedStateManagerI == null) {
            sharedStateType.toString();
            Log.d();
            return false;
        }
        int iK = k(sharedStateManagerI, event);
        synchronized (sharedStateManagerI) {
            zB = sharedStateManagerI.b(iK, new SharedState(iK, SharedStateStatus.d, map));
        }
        if (!zB) {
            sharedStateType.toString();
            Log.d();
            return zB;
        }
        sharedStateType.toString();
        if (map != null) {
            MapExtensionsKt.b(map);
        }
        Log.a();
        d(str);
        return zB;
    }

    public final void b(Event event) {
        Intrinsics.h(event, "event");
        f().submit(new g(1, this, event));
    }

    public final void c(Event event) {
        int iIncrementAndGet = this.f.incrementAndGet();
        String str = event.b;
        Intrinsics.g(str, "event.uniqueIdentifier");
        this.g.put(str, Integer.valueOf(iIncrementAndGet));
        if (!this.j.b(event)) {
            event.toString();
            Log.d();
        }
        if (LoggingMode.d.compareTo(LoggingMode.e) >= 0) {
            event.toString();
            Log.a();
        }
    }

    public final void d(String str) {
        Map mapS = androidx.constraintlayout.core.state.a.s("stateowner", str);
        Event.Builder builder = new Event.Builder("Shared state change", "com.adobe.eventType.hub", "com.adobe.eventSource.sharedState", null);
        builder.d(mapS);
        Event event = builder.a();
        Intrinsics.g(event, "event");
        c(event);
    }

    public final void e(Runnable runnable) {
        Object d = this.f13181a.getD();
        Intrinsics.g(d, "<get-scheduledExecutor>(...)");
        ((ScheduledExecutorService) d).submit(new androidx.compose.material.ripple.a(runnable, 6));
    }

    public final ExecutorService f() {
        Object d = this.b.getD();
        Intrinsics.g(d, "<get-eventHubExecutor>(...)");
        return (ExecutorService) d;
    }

    public final Integer g(Event event) {
        if (event == null) {
            return null;
        }
        return (Integer) this.g.get(event.b);
    }

    public final ExtensionContainer h(String str) {
        Object next;
        Set setEntrySet = this.c.entrySet();
        Intrinsics.g(setEntrySet, "registeredExtensions.entries");
        Iterator it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = ((ExtensionContainer) ((Map.Entry) next).getValue()).b;
            if (str2 != null ? str2.equalsIgnoreCase(str) : false) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (ExtensionContainer) entry.getValue();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final SharedStateManager i(String str) {
        ExtensionContainer extensionContainerH = h(str);
        if (extensionContainerH != null) {
            ?? r3 = extensionContainerH.g;
            SharedStateManager sharedStateManager = r3 != 0 ? (SharedStateManager) r3.get(SharedStateType.d) : null;
            if (sharedStateManager != null) {
                return sharedStateManager;
            }
        }
        return null;
    }

    public final void j(final Set extensions, final Function0 function0) {
        Intrinsics.h(extensions, "extensions");
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator it = extensions.iterator();
        while (it.hasNext()) {
            Class extensionClass = (Class) it.next();
            Function1<EventHubError, Unit> function1 = new Function1<EventHubError, Unit>() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$registerExtensions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    EventHubError it2 = (EventHubError) obj;
                    Intrinsics.h(it2, "it");
                    if (atomicInteger.incrementAndGet() == extensions.size()) {
                        EventHub eventHub = this;
                        eventHub.f().submit(new androidx.compose.material.ripple.a(eventHub, 8));
                        eventHub.e(new androidx.compose.ui.a(2, function0));
                    }
                    return Unit.f24250a;
                }
            };
            Intrinsics.h(extensionClass, "extensionClass");
            f().submit(new e(extensionClass, this, function1, 0));
        }
    }

    public final int k(SharedStateManager sharedStateManager, Event event) {
        boolean z;
        if (event != null) {
            Integer numG = g(event);
            if (numG != null) {
                return numG.intValue();
            }
        } else {
            synchronized (sharedStateManager) {
                z = sharedStateManager.f13188a.size() == 0;
            }
            if (!z) {
                return this.f.incrementAndGet();
            }
        }
        return 0;
    }

    public final void l() throws JSONException {
        if (this.h) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Collection<ExtensionContainer> collectionValues = this.c.values();
            Intrinsics.g(collectionValues, "registeredExtensions.values");
            for (ExtensionContainer extensionContainer : collectionValues) {
                String str = extensionContainer.b;
                if (str != null && !str.equals("com.adobe.module.eventhub")) {
                    linkedHashMap.put(str, MapsKt.l(new Pair("friendlyName", extensionContainer.c), new Pair("version", extensionContainer.d)));
                }
            }
            WrapperType wrapperType = this.l;
            Pair pair = new Pair("type", wrapperType.d);
            int iOrdinal = wrapperType.ordinal();
            a("com.adobe.module.eventhub", EventDataUtils.b(0, MapsKt.j(new Pair("version", "3.3.1"), new Pair("wrapper", MapsKt.j(pair, new Pair("friendlyName", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? "None" : "Xamarin" : "Unity" : "Cordova" : "Flutter" : "React Native"))), new Pair("extensions", linkedHashMap))), null);
        }
    }
}
