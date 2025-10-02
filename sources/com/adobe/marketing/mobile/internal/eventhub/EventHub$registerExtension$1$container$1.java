package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.SerialWorkDispatcher;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "Lcom/adobe/marketing/mobile/internal/eventhub/EventHubError;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class EventHub$registerExtension$1$container$1 extends Lambda implements Function1<EventHubError, Unit> {
    public final /* synthetic */ EventHub h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Class j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHub$registerExtension$1$container$1(EventHub eventHub, Function1 function1, Class cls) {
        super(1);
        this.h = eventHub;
        this.i = function1;
        this.j = cls;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final EventHubError error = (EventHubError) obj;
        Intrinsics.h(error, "error");
        EventHub eventHub = EventHub.m;
        final EventHub eventHub2 = this.h;
        ExecutorService executorServiceF = eventHub2.f();
        final Function1 function1 = this.i;
        final Class cls = this.j;
        executorServiceF.submit(new Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.f
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                Function1 function12 = function1;
                EventHub eventHub3 = eventHub2;
                Class extensionClass = cls;
                EventHubError error2 = error;
                Intrinsics.h(extensionClass, "$extensionClass");
                Intrinsics.h(error2, "$error");
                if (function12 != null) {
                    g gVar = new g(function12, error2);
                    EventHub eventHub4 = EventHub.m;
                    eventHub3.e(gVar);
                }
                EventHub eventHub5 = EventHub.m;
                EventHubError eventHubError = EventHubError.h;
                if (error2 == eventHubError) {
                    extensionClass.toString();
                    Log.c();
                    eventHub3.l();
                    return;
                }
                extensionClass.toString();
                error2.toString();
                Log.d();
                ExtensionContainer extensionContainer = (ExtensionContainer) eventHub3.c.remove(extensionClass.getName());
                if (extensionContainer != null) {
                    SerialWorkDispatcher serialWorkDispatcher = extensionContainer.j;
                    synchronized (serialWorkDispatcher.h) {
                        try {
                            SerialWorkDispatcher.State state = serialWorkDispatcher.g;
                            SerialWorkDispatcher.State state2 = SerialWorkDispatcher.State.g;
                            if (state != state2) {
                                serialWorkDispatcher.g = state2;
                                Future future = serialWorkDispatcher.f;
                                if (future != null) {
                                    future.cancel(true);
                                }
                                serialWorkDispatcher.f = null;
                                serialWorkDispatcher.d.clear();
                                androidx.compose.material.ripple.a aVar = serialWorkDispatcher.j;
                                if (aVar != null) {
                                    serialWorkDispatcher.c.submit(aVar);
                                }
                                serialWorkDispatcher.c.shutdown();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    eventHub3.l();
                    extensionClass.toString();
                    Log.c();
                } else {
                    extensionClass.toString();
                    Log.d();
                    eventHubError = EventHubError.g;
                }
                eventHub3.e(new au.com.woolworths.base.wallet.digipay.framesview.b(eventHubError, 2));
            }
        });
        return Unit.f24250a;
    }
}
