package com.swrve.sdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/swrve/sdk/SwrvePushInboxMessageState;", "", "SwrveSDK_firebaseRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwrvePushInboxMessageState {
    public static final SwrvePushInboxMessageState d;
    public static final SwrvePushInboxMessageState e;
    public static final /* synthetic */ SwrvePushInboxMessageState[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        SwrvePushInboxMessageState swrvePushInboxMessageState = new SwrvePushInboxMessageState("READ", 0);
        d = swrvePushInboxMessageState;
        SwrvePushInboxMessageState swrvePushInboxMessageState2 = new SwrvePushInboxMessageState("UNREAD", 1);
        e = swrvePushInboxMessageState2;
        SwrvePushInboxMessageState[] swrvePushInboxMessageStateArr = {swrvePushInboxMessageState, swrvePushInboxMessageState2, new SwrvePushInboxMessageState("DELETED", 2)};
        f = swrvePushInboxMessageStateArr;
        g = EnumEntriesKt.a(swrvePushInboxMessageStateArr);
    }

    public static SwrvePushInboxMessageState valueOf(String str) {
        return (SwrvePushInboxMessageState) Enum.valueOf(SwrvePushInboxMessageState.class, str);
    }

    public static SwrvePushInboxMessageState[] values() {
        return (SwrvePushInboxMessageState[]) f.clone();
    }
}
