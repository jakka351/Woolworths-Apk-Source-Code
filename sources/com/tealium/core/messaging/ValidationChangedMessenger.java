package com.tealium.core.messaging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/messaging/ValidationChangedMessenger;", "Lcom/tealium/core/messaging/Messenger;", "Lcom/tealium/core/messaging/ValidationChangedListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ValidationChangedMessenger extends Messenger<ValidationChangedListener> {
    @Override // com.tealium.core.messaging.Messenger
    public final void a(Listener listener) {
        ValidationChangedListener listener2 = (ValidationChangedListener) listener;
        Intrinsics.h(listener2, "listener");
        listener2.g(null);
    }
}
