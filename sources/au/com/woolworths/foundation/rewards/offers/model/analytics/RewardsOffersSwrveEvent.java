package au.com.woolworths.foundation.rewards.offers.model.analytics;

import au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/analytics/RewardsOffersSwrveEvent;", "Lau/com/woolworths/foundation/swrve/tracking/api/SwrveEvent;", "", "Companion", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RewardsOffersSwrveEvent implements SwrveEvent {
    public static final RewardsOffersSwrveEvent d;
    public static final RewardsOffersSwrveEvent e;
    public static final RewardsOffersSwrveEvent f;
    public static final RewardsOffersSwrveEvent g;
    public static final RewardsOffersSwrveEvent h;
    public static final RewardsOffersSwrveEvent i;
    public static final /* synthetic */ RewardsOffersSwrveEvent[] j;
    public static final /* synthetic */ EnumEntries k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/analytics/RewardsOffersSwrveEvent$Companion;", "", "", "CAMPAIGN_CODE", "Ljava/lang/String;", "OFFER_UOID", "SCREEN_NAME", "SWAPPABLE", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RewardsOffersSwrveEvent rewardsOffersSwrveEvent = new RewardsOffersSwrveEvent() { // from class: au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent.SCREEN_VIEW
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "screen.points";
            }
        };
        d = rewardsOffersSwrveEvent;
        RewardsOffersSwrveEvent rewardsOffersSwrveEvent2 = new RewardsOffersSwrveEvent() { // from class: au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent.REWARDS_OFFER_BOOSTED
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "offer.boosted.success";
            }
        };
        e = rewardsOffersSwrveEvent2;
        RewardsOffersSwrveEvent rewardsOffersSwrveEvent3 = new RewardsOffersSwrveEvent() { // from class: au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent.REWARDS_OFFER_ALL_BOOSTED
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "offer.boosted_all.success";
            }
        };
        f = rewardsOffersSwrveEvent3;
        RewardsOffersSwrveEvent rewardsOffersSwrveEvent4 = new RewardsOffersSwrveEvent() { // from class: au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent.REWARDS_OFFER_IMPRESSION
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "offer.impression.success";
            }
        };
        g = rewardsOffersSwrveEvent4;
        RewardsOffersSwrveEvent rewardsOffersSwrveEvent5 = new RewardsOffersSwrveEvent() { // from class: au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent.OFFER_FEED_IMPRESSION_AVAILABLE_OFFERS
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "offerfeed.impression.available_offers";
            }
        };
        h = rewardsOffersSwrveEvent5;
        RewardsOffersSwrveEvent rewardsOffersSwrveEvent6 = new RewardsOffersSwrveEvent() { // from class: au.com.woolworths.foundation.rewards.offers.model.analytics.RewardsOffersSwrveEvent.OFFER_FEED_IMPRESSION_NO_AVAILABLE_OFFERS
            @Override // au.com.woolworths.foundation.swrve.tracking.api.SwrveEvent
            /* renamed from: a */
            public final String getD() {
                return "offerfeed.impression.no_available_offers";
            }
        };
        i = rewardsOffersSwrveEvent6;
        RewardsOffersSwrveEvent[] rewardsOffersSwrveEventArr = {rewardsOffersSwrveEvent, rewardsOffersSwrveEvent2, rewardsOffersSwrveEvent3, rewardsOffersSwrveEvent4, rewardsOffersSwrveEvent5, rewardsOffersSwrveEvent6};
        j = rewardsOffersSwrveEventArr;
        k = EnumEntriesKt.a(rewardsOffersSwrveEventArr);
    }

    public static RewardsOffersSwrveEvent valueOf(String str) {
        return (RewardsOffersSwrveEvent) Enum.valueOf(RewardsOffersSwrveEvent.class, str);
    }

    public static RewardsOffersSwrveEvent[] values() {
        return (RewardsOffersSwrveEvent[]) j.clone();
    }
}
