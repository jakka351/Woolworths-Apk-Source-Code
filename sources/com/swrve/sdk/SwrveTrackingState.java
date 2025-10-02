package com.swrve.sdk;

import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SwrveTrackingState {
    public static final SwrveTrackingState d;
    public static final SwrveTrackingState e;
    public static final SwrveTrackingState f;
    public static final SwrveTrackingState g;
    public static final /* synthetic */ SwrveTrackingState[] h;

    static {
        SwrveTrackingState swrveTrackingState = new SwrveTrackingState("UNKNOWN", 0);
        d = swrveTrackingState;
        SwrveTrackingState swrveTrackingState2 = new SwrveTrackingState("STARTED", 1);
        e = swrveTrackingState2;
        SwrveTrackingState swrveTrackingState3 = new SwrveTrackingState("EVENT_SENDING_PAUSED", 2);
        f = swrveTrackingState3;
        SwrveTrackingState swrveTrackingState4 = new SwrveTrackingState("STOPPED", 3);
        g = swrveTrackingState4;
        h = new SwrveTrackingState[]{swrveTrackingState, swrveTrackingState2, swrveTrackingState3, swrveTrackingState4};
    }

    public static SwrveTrackingState a(Context context) {
        String string = context.getSharedPreferences("swrve_prefs", 0).getString("trackingState", null);
        boolean zP = SwrveHelper.p(string);
        SwrveTrackingState swrveTrackingState = d;
        if (zP) {
            return swrveTrackingState;
        }
        if (string.equalsIgnoreCase("STARTED")) {
            return e;
        }
        if (string.equalsIgnoreCase("EVENT_SENDING_PAUSED")) {
            return f;
        }
        if (string.equalsIgnoreCase("STOPPED")) {
            return g;
        }
        string.equalsIgnoreCase("UNKNOWN");
        return swrveTrackingState;
    }

    public static SwrveTrackingState valueOf(String str) {
        return (SwrveTrackingState) Enum.valueOf(SwrveTrackingState.class, str);
    }

    public static SwrveTrackingState[] values() {
        return (SwrveTrackingState[]) h.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "UNKNOWN" : "STOPPED" : "EVENT_SENDING_PAUSED" : "STARTED";
    }
}
