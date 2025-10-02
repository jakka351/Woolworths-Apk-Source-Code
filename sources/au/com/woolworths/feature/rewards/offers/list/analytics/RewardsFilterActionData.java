package au.com.woolworths.feature.rewards.offers.list.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.offers.analytics.RewardsOfferScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/list/analytics/RewardsFilterActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsFilterActionData implements Action {
    public final String d;
    public final Screen e = RewardsOfferScreen.f;
    public final Category f = Category.m;

    public RewardsFilterActionData(String str) {
        this.d = str;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsFilterActionData) && Intrinsics.c(this.d, ((RewardsFilterActionData) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getE() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return a.h("RewardsFilterActionData(label=", this.d, ")");
    }
}
