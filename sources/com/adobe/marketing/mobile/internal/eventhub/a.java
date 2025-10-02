package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.AdobeCallbackWithError;
import com.adobe.marketing.mobile.AdobeError;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.SharedStateResolver;
import com.adobe.marketing.mobile.SharedStateStatus;
import com.adobe.marketing.mobile.internal.util.MapExtensionsKt;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.EventDataUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ EventHub e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(EventHub eventHub, AdobeCallbackWithError adobeCallbackWithError, String str) {
        this.e = eventHub;
        this.g = adobeCallbackWithError;
        this.f = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean zB;
        switch (this.d) {
            case 0:
                EventHub this$0 = this.e;
                AdobeCallbackWithError adobeCallbackWithError = (AdobeCallbackWithError) this.g;
                final String str = this.f;
                EventHub eventHub = EventHub.m;
                Intrinsics.h(this$0, "this$0");
                CollectionsKt.f0(this$0.d, new EventHubKt$filterRemove$1(new ArrayList(), new Function1<ResponseListenerContainer, Boolean>() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$registerResponseListener$1$timeoutCallable$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(Intrinsics.c(((ResponseListenerContainer) obj).f13186a, str));
                    }
                }));
                try {
                    adobeCallbackWithError.c(AdobeError.e);
                } catch (Exception e) {
                    e.toString();
                    Log.a();
                }
                return Unit.f24250a;
            default:
                final EventHub this$02 = this.e;
                SharedStateType sharedStateType = SharedStateType.d;
                final String extensionName = this.f;
                Event event = (Event) this.g;
                EventHub eventHub2 = EventHub.m;
                Intrinsics.h(this$02, "this$0");
                Intrinsics.h(extensionName, "$extensionName");
                SharedStateManager sharedStateManagerI = this$02.i(extensionName);
                if (sharedStateManagerI == null) {
                    sharedStateType.toString();
                    Log.d();
                    return null;
                }
                final int iK = this$02.k(sharedStateManagerI, event);
                synchronized (sharedStateManagerI) {
                    zB = sharedStateManagerI.b(iK, new SharedState(iK, SharedStateStatus.e, sharedStateManagerI.a(Integer.MAX_VALUE).b));
                }
                if (zB) {
                    sharedStateType.toString();
                    Log.a();
                    return new SharedStateResolver() { // from class: com.adobe.marketing.mobile.internal.eventhub.b
                        @Override // com.adobe.marketing.mobile.SharedStateResolver
                        public final void a(Map map) throws ExecutionException, InterruptedException {
                            final Map mapB;
                            EventHub eventHub3 = EventHub.m;
                            final EventHub this$03 = this$02;
                            Intrinsics.h(this$03, "this$0");
                            final String extensionName2 = extensionName;
                            Intrinsics.h(extensionName2, "$extensionName");
                            try {
                                mapB = EventDataUtils.b(0, map);
                            } catch (Exception e2) {
                                SharedStateType.d.toString();
                                e2.toString();
                                Log.d();
                                mapB = null;
                            }
                            final int i = iK;
                            this$03.f().submit(new Callable() { // from class: com.adobe.marketing.mobile.internal.eventhub.c
                                @Override // java.util.concurrent.Callable
                                public final Object call() throws JSONException {
                                    EventHub this$04 = this$03;
                                    SharedStateType sharedStateType2 = SharedStateType.d;
                                    String extensionName3 = extensionName2;
                                    int i2 = i;
                                    Map map2 = mapB;
                                    EventHub eventHub4 = EventHub.m;
                                    Intrinsics.h(this$04, "this$0");
                                    Intrinsics.h(extensionName3, "$extensionName");
                                    SharedStateManager sharedStateManagerI2 = this$04.i(extensionName3);
                                    if (sharedStateManagerI2 == null) {
                                        sharedStateType2.toString();
                                        Log.d();
                                    } else {
                                        synchronized (sharedStateManagerI2) {
                                            SharedState sharedState = (SharedState) sharedStateManagerI2.f13188a.get(Integer.valueOf(i2));
                                            if (sharedState != null && sharedState.b == SharedStateStatus.e) {
                                                sharedStateManagerI2.f13188a.put(Integer.valueOf(i2), new SharedState(i2, SharedStateStatus.d, map2));
                                                sharedStateType2.toString();
                                                if (map2 != null) {
                                                    MapExtensionsKt.b(map2);
                                                }
                                                Log.a();
                                                this$04.d(extensionName3);
                                            } else {
                                                sharedStateType2.toString();
                                                Log.d();
                                            }
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }).get();
                        }
                    };
                }
                sharedStateType.toString();
                Log.d();
                return null;
        }
    }

    public /* synthetic */ a(EventHub eventHub, String str, Event event) {
        this.e = eventHub;
        this.f = str;
        this.g = event;
    }
}
