package com.adobe.marketing.mobile.internal.eventhub;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubError;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EventHubError {
    public static final EventHubError d;
    public static final EventHubError e;
    public static final EventHubError f;
    public static final EventHubError g;
    public static final EventHubError h;
    public static final /* synthetic */ EventHubError[] i;

    static {
        EventHubError eventHubError = new EventHubError("InvalidExtensionName", 0);
        d = eventHubError;
        EventHubError eventHubError2 = new EventHubError("DuplicateExtensionName", 1);
        e = eventHubError2;
        EventHubError eventHubError3 = new EventHubError("ExtensionInitializationFailure", 2);
        f = eventHubError3;
        EventHubError eventHubError4 = new EventHubError("ExtensionNotRegistered", 3);
        g = eventHubError4;
        EventHubError eventHubError5 = new EventHubError("Unknown", 4);
        EventHubError eventHubError6 = new EventHubError("None", 5);
        h = eventHubError6;
        i = new EventHubError[]{eventHubError, eventHubError2, eventHubError3, eventHubError4, eventHubError5, eventHubError6};
    }

    public static EventHubError valueOf(String str) {
        return (EventHubError) Enum.valueOf(EventHubError.class, str);
    }

    public static EventHubError[] values() {
        return (EventHubError[]) i.clone();
    }
}
