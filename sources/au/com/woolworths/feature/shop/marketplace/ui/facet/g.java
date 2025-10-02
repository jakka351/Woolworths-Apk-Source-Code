package au.com.woolworths.feature.shop.marketplace.ui.facet;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.marketplace.MarketplaceFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MarketplaceFacetFragment e;

    public /* synthetic */ g(MarketplaceFacetFragment marketplaceFacetFragment, int i) {
        this.d = i;
        this.e = marketplaceFacetFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                FeatureToggleManager featureToggleManager = this.e.d;
                if (featureToggleManager != null) {
                    return Boolean.valueOf(featureToggleManager.c(MarketplaceFeature.d));
                }
                Intrinsics.p("featureManager");
                throw null;
            case 1:
                return new MarketplaceFacetEpoxyController(this.e.E1());
            default:
                this.e.E1().onSecondaryActionClicked();
                return Unit.f24250a;
        }
    }
}
