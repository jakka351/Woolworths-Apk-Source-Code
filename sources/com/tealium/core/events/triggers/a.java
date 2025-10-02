package com.tealium.core.events.triggers;

import com.tealium.core.events.EventTrigger;
import com.tealium.dispatcher.Dispatch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/events/triggers/a;", "Lcom/tealium/core/events/EventTrigger;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a implements EventTrigger {
    @Override // com.tealium.core.events.EventTrigger
    public final boolean a(Dispatch dispatch) {
        Intrinsics.h(dispatch, "dispatch");
        Object obj = dispatch.get();
        if (obj != null) {
            return obj.equals(null);
        }
        return false;
    }

    @Override // com.tealium.core.events.EventTrigger
    public final boolean b(Dispatch dispatch) {
        Intrinsics.h(dispatch, "dispatch");
        Object obj = dispatch.get();
        if (obj != null) {
            return obj.equals(null);
        }
        return false;
    }
}
