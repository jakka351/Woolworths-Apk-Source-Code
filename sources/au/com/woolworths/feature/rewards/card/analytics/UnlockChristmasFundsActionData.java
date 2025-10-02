package au.com.woolworths.feature.rewards.card.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/card/analytics/UnlockChristmasFundsActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "SheetImpression", "FundsReleased", "Lau/com/woolworths/feature/rewards/card/analytics/UnlockChristmasFundsActionData$FundsReleased;", "Lau/com/woolworths/feature/rewards/card/analytics/UnlockChristmasFundsActionData$SheetImpression;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UnlockChristmasFundsActionData implements Action {
    public final Screens d = Screens.C;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/analytics/UnlockChristmasFundsActionData$FundsReleased;", "Lau/com/woolworths/feature/rewards/card/analytics/UnlockChristmasFundsActionData;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FundsReleased extends UnlockChristmasFundsActionData {
        public final String e;
        public final Category f;

        public FundsReleased(String label) {
            Intrinsics.h(label, "label");
            this.e = label;
            this.f = Category.k;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/analytics/UnlockChristmasFundsActionData$SheetImpression;", "Lau/com/woolworths/feature/rewards/card/analytics/UnlockChristmasFundsActionData;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SheetImpression extends UnlockChristmasFundsActionData {
        public final String e;
        public final Category f;

        public SheetImpression(String label) {
            Intrinsics.h(label, "label");
            this.e = label;
            this.f = Category.k;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
