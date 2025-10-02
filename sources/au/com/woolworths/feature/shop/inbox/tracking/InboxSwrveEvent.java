package au.com.woolworths.feature.shop.inbox.tracking;

import au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/tracking/InboxSwrveEvent;", "Lau/com/woolworths/foundation/swrve/tracking/api/SwrveEvent;", "", "Companion", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InboxSwrveEvent implements SwrveEvent {
    public static final InboxSwrveEvent d;
    public static final InboxSwrveEvent e;
    public static final InboxSwrveEvent f;
    public static final InboxSwrveEvent g;
    public static final InboxSwrveEvent h;
    public static final /* synthetic */ InboxSwrveEvent[] i;
    public static final /* synthetic */ EnumEntries j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/tracking/InboxSwrveEvent$Companion;", "", "", "SWIPE_CLEAR_BUTTON_NAME", "Ljava/lang/String;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        InboxSwrveEvent inboxSwrveEvent = new InboxSwrveEvent() { // from class: au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent.BELL_ICON_CLICK
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "screen.homepage.bell_icon.button";
            }
        };
        d = inboxSwrveEvent;
        InboxSwrveEvent inboxSwrveEvent2 = new InboxSwrveEvent() { // from class: au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent.UNREAD_MESSAGE_IMPRESSION
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "screen.homepage.bell_icon.unread_message_per_session.impression";
            }
        };
        e = inboxSwrveEvent2;
        InboxSwrveEvent inboxSwrveEvent3 = new InboxSwrveEvent() { // from class: au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent.IMPRESSION
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "screen.homepage.notifications_screen";
            }
        };
        f = inboxSwrveEvent3;
        InboxSwrveEvent inboxSwrveEvent4 = new InboxSwrveEvent() { // from class: au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent.EMPTY_SCREEN
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "screen.notification_centre.empty_screen";
            }
        };
        g = inboxSwrveEvent4;
        InboxSwrveEvent inboxSwrveEvent5 = new InboxSwrveEvent() { // from class: au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent.CLEAR_ALL_CLICK
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "screen.notification_centre.clear_all.button";
            }
        };
        h = inboxSwrveEvent5;
        InboxSwrveEvent[] inboxSwrveEventArr = {inboxSwrveEvent, inboxSwrveEvent2, inboxSwrveEvent3, inboxSwrveEvent4, inboxSwrveEvent5};
        i = inboxSwrveEventArr;
        j = EnumEntriesKt.a(inboxSwrveEventArr);
    }

    public static InboxSwrveEvent valueOf(String str) {
        return (InboxSwrveEvent) Enum.valueOf(InboxSwrveEvent.class, str);
    }

    public static InboxSwrveEvent[] values() {
        return (InboxSwrveEvent[]) i.clone();
    }
}
