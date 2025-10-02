package au.com.woolworths.shop.checkout.ui.content.bottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import au.com.woolworths.shop.checkout.ui.analytics.MarketplacePickupBottomSheetActions;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/bottomsheet/MarketplacePickupBottomSheetViewModel;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetViewModel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MarketplacePickupBottomSheetViewModel extends BaseBottomSheetViewModel {
    public final AnalyticsManager i;
    public Screens j;

    public MarketplacePickupBottomSheetViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.i = analyticsManager;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel, au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract.CtaClickListener
    public final void c4(ContentCta cta) {
        Intrinsics.h(cta, "cta");
        p6(cta);
        Screens screens = this.j;
        if (screens == null) {
            Intrinsics.p("screen");
            throw null;
        }
        this.i.j(new MarketplacePickupBottomSheetActions.ButtonConfirm(screens), TrackingMetadata.Companion.a(TrackableValue.o0, "Everyday market checkout"));
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void q6(ContentCta contentCta) {
        Intrinsics.h(contentCta, "contentCta");
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void r6(String label) {
        Intrinsics.h(label, "label");
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void s6() {
        Screens screens = this.j;
        if (screens == null) {
            Intrinsics.p("screen");
            throw null;
        }
        this.i.j(new MarketplacePickupBottomSheetActions.OnAppear(screens), TrackingMetadata.Companion.a(TrackableValue.o0, "Everyday market checkout"));
    }
}
