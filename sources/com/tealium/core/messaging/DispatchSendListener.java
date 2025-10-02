package com.tealium.core.messaging;

import com.tealium.dispatcher.Dispatch;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/messaging/DispatchSendListener;", "Lcom/tealium/core/messaging/Listener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DispatchSendListener extends Listener {
    Object d(Dispatch dispatch, Continuation continuation);
}
