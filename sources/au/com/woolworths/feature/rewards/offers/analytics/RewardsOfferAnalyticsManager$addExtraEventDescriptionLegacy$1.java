package au.com.woolworths.feature.rewards.offers.analytics;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/feature/rewards/offers/analytics/RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1", "Lau/com/woolworths/android/onesite/analytics/Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1 implements Action {
    public final /* synthetic */ Action d;

    public RewardsOfferAnalyticsManager$addExtraEventDescriptionLegacy$1(Action action) {
        this.d = action;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a */
    public final String getK() {
        return this.d.getK();
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b */
    public final Category getJ() {
        return this.d.getJ();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d.getD();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action, au.com.woolworths.android.onesite.analytics.BaseAction
    public final HashMap l() {
        HashMap mapL = this.d.l();
        TrackableValue trackableValue = TrackableValue.e;
        mapL.put("event.Description", "Legacy");
        return mapL;
    }
}
