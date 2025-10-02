package com.swrve.sdk.messaging;

/* loaded from: classes.dex */
public interface SwrveInAppMessageListener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static final class SwrveMessageAction {
        public static final /* synthetic */ SwrveMessageAction[] d = {new SwrveMessageAction("Dismiss", 0), new SwrveMessageAction("Custom", 1), new SwrveMessageAction("CopyToClipboard", 2), new SwrveMessageAction("Impression", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        SwrveMessageAction EF5;

        public static SwrveMessageAction valueOf(String str) {
            return (SwrveMessageAction) Enum.valueOf(SwrveMessageAction.class, str);
        }

        public static SwrveMessageAction[] values() {
            return (SwrveMessageAction[]) d.clone();
        }
    }
}
