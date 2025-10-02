package au.com.woolworths.feature.shop.inbox.tracking;

import au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/tracking/InboxTncsSwrveEvent;", "Lau/com/woolworths/foundation/swrve/tracking/api/SwrveEvent;", "", "Companion", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InboxTncsSwrveEvent implements SwrveEvent {
    public static final InboxTncsSwrveEvent d;
    public static final /* synthetic */ InboxTncsSwrveEvent[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/tracking/InboxTncsSwrveEvent$Companion;", "", "", "CAMPAIGN_CODE", "Ljava/lang/String;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        InboxTncsSwrveEvent inboxTncsSwrveEvent = new InboxTncsSwrveEvent() { // from class: au.com.woolworths.feature.shop.inbox.tracking.InboxTncsSwrveEvent.IMPRESSION
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "screen.homepage.notifications_tncs_screen";
            }
        };
        d = inboxTncsSwrveEvent;
        InboxTncsSwrveEvent[] inboxTncsSwrveEventArr = {inboxTncsSwrveEvent};
        e = inboxTncsSwrveEventArr;
        f = EnumEntriesKt.a(inboxTncsSwrveEventArr);
    }

    public static InboxTncsSwrveEvent valueOf(String str) {
        return (InboxTncsSwrveEvent) Enum.valueOf(InboxTncsSwrveEvent.class, str);
    }

    public static InboxTncsSwrveEvent[] values() {
        return (InboxTncsSwrveEvent[]) e.clone();
    }
}
