package com.adobe.marketing.mobile.services.ui.message;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "", "Builder", "MessageAlignment", "MessageAnimation", "MessageGesture", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppMessageSettings {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$Builder;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$Builder$Companion;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAlignment;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MessageAlignment {
        public static final MessageAlignment d;
        public static final MessageAlignment e;
        public static final MessageAlignment f;
        public static final MessageAlignment g;
        public static final MessageAlignment h;
        public static final /* synthetic */ MessageAlignment[] i;

        static {
            MessageAlignment messageAlignment = new MessageAlignment("CENTER", 0);
            d = messageAlignment;
            MessageAlignment messageAlignment2 = new MessageAlignment("LEFT", 1);
            e = messageAlignment2;
            MessageAlignment messageAlignment3 = new MessageAlignment("RIGHT", 2);
            f = messageAlignment3;
            MessageAlignment messageAlignment4 = new MessageAlignment("TOP", 3);
            g = messageAlignment4;
            MessageAlignment messageAlignment5 = new MessageAlignment("BOTTOM", 4);
            h = messageAlignment5;
            i = new MessageAlignment[]{messageAlignment, messageAlignment2, messageAlignment3, messageAlignment4, messageAlignment5};
        }

        public static MessageAlignment valueOf(String str) {
            return (MessageAlignment) Enum.valueOf(MessageAlignment.class, str);
        }

        public static MessageAlignment[] values() {
            return (MessageAlignment[]) i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageAnimation;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MessageAnimation {
        public static final MessageAnimation d;
        public static final MessageAnimation e;
        public static final MessageAnimation f;
        public static final MessageAnimation g;
        public static final MessageAnimation h;
        public static final /* synthetic */ MessageAnimation[] i;

        /* JADX INFO: Fake field, exist only in values array */
        MessageAnimation EF0;

        static {
            MessageAnimation messageAnimation = new MessageAnimation("NONE", 0);
            MessageAnimation messageAnimation2 = new MessageAnimation("LEFT", 1);
            d = messageAnimation2;
            MessageAnimation messageAnimation3 = new MessageAnimation("RIGHT", 2);
            e = messageAnimation3;
            MessageAnimation messageAnimation4 = new MessageAnimation("TOP", 3);
            f = messageAnimation4;
            MessageAnimation messageAnimation5 = new MessageAnimation("BOTTOM", 4);
            g = messageAnimation5;
            MessageAnimation messageAnimation6 = new MessageAnimation("CENTER", 5);
            MessageAnimation messageAnimation7 = new MessageAnimation("FADE", 6);
            h = messageAnimation7;
            i = new MessageAnimation[]{messageAnimation, messageAnimation2, messageAnimation3, messageAnimation4, messageAnimation5, messageAnimation6, messageAnimation7};
        }

        public static MessageAnimation valueOf(String str) {
            return (MessageAnimation) Enum.valueOf(MessageAnimation.class, str);
        }

        public static MessageAnimation[] values() {
            return (MessageAnimation[]) i.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public enum MessageGesture {
        SWIPE_UP("swipeUp"),
        SWIPE_DOWN("swipeDown"),
        SWIPE_LEFT("swipeLeft"),
        SWIPE_RIGHT("swipeRight"),
        TAP_BACKGROUND("tapBackground");

        public final String d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture$Companion;", "", "", "", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings$MessageGesture;", "gestureToEnumMap", "Ljava/util/Map;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
        }

        static {
            MessageGesture[] messageGestureArrValues = values();
            int iH = MapsKt.h(messageGestureArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
            for (MessageGesture messageGesture : messageGestureArrValues) {
                linkedHashMap.put(messageGesture.d, messageGesture);
            }
        }

        MessageGesture(String str) {
            this.d = str;
        }
    }
}
