package au.com.woolworths.foundation.swrve.tracking.api;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/swrve/tracking/api/StandardSwrveEvent;", "Lau/com/woolworths/foundation/swrve/tracking/api/SwrveEvent;", "", "Companion", "tracking-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class StandardSwrveEvent implements SwrveEvent {
    public static final StandardSwrveEvent d;
    public static final StandardSwrveEvent e;
    public static final /* synthetic */ StandardSwrveEvent[] f;
    public static final /* synthetic */ EnumEntries g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/swrve/tracking/api/StandardSwrveEvent$Companion;", "", "", "CampaignCode", "Ljava/lang/String;", "ButtonName", "tracking-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        StandardSwrveEvent standardSwrveEvent = new StandardSwrveEvent() { // from class: au.com.woolworths.foundation.swrve.tracking.api.StandardSwrveEvent.Impression
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "embedded_campaign.impression";
            }
        };
        d = standardSwrveEvent;
        StandardSwrveEvent standardSwrveEvent2 = new StandardSwrveEvent() { // from class: au.com.woolworths.foundation.swrve.tracking.api.StandardSwrveEvent.ButtonClick
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "embedded_campaign.button";
            }
        };
        e = standardSwrveEvent2;
        StandardSwrveEvent[] standardSwrveEventArr = {standardSwrveEvent, standardSwrveEvent2};
        f = standardSwrveEventArr;
        g = EnumEntriesKt.a(standardSwrveEventArr);
    }

    public static StandardSwrveEvent valueOf(String str) {
        return (StandardSwrveEvent) Enum.valueOf(StandardSwrveEvent.class, str);
    }

    public static StandardSwrveEvent[] values() {
        return (StandardSwrveEvent[]) f.clone();
    }
}
