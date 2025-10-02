package com.tealium.core.messaging;

import com.tealium.remotecommands.RemoteCommandRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/messaging/b;", "Lcom/tealium/core/messaging/AfterDispatchSendCallbacks;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements AfterDispatchSendCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final EventRouter f19155a;

    public b(EventRouter eventRouter) {
        Intrinsics.h(eventRouter, "eventRouter");
        this.f19155a = eventRouter;
    }

    @Override // com.tealium.core.messaging.AfterDispatchSendCallbacks
    public final void a(String str) {
        this.f19155a.a(str);
    }

    @Override // com.tealium.core.messaging.AfterDispatchSendCallbacks
    public final void b(RemoteCommandRequest remoteCommandRequest) {
        this.f19155a.w(remoteCommandRequest);
    }
}
