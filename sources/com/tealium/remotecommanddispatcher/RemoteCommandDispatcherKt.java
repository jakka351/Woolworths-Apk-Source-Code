package com.tealium.remotecommanddispatcher;

import com.tealium.core.Module;
import com.tealium.core.Tealium;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"remotecommanddispatcher_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteCommandDispatcherKt {
    public static final RemoteCommandDispatcher a(Tealium tealium) {
        Module module;
        Intrinsics.h(tealium, "<this>");
        com.tealium.core.c cVar = tealium.u;
        cVar.getClass();
        synchronized (cVar.f19125a) {
            module = (Module) CollectionsKt.E(cVar.c(RemoteCommandDispatcher.class));
        }
        return (RemoteCommandDispatcher) module;
    }
}
