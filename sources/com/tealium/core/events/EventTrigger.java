package com.tealium.core.events;

import com.tealium.dispatcher.Dispatch;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/events/EventTrigger;", "", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EventTrigger {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/events/EventTrigger$Companion;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    boolean a(Dispatch dispatch);

    boolean b(Dispatch dispatch);
}
