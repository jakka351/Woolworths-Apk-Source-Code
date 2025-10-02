package au.com.woolworths.feature.product.list;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$DynamicCard$1$2$1 extends FunctionReferenceImpl implements Function1<DynamicSizeCardData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((DynamicSizeCardData) obj);
        return Unit.f24250a;
    }

    public final void m(DynamicSizeCardData p0) {
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        AnalyticsManager analyticsManager = productListViewModel.h;
        if (p0 instanceof ActionableCard) {
            ProductListActions.ActionableCardImpression actionableCardImpression = ProductListActions.ActionableCardImpression.e;
            TrackingMetadata trackingMetadataA = ActionableCardKt.a((ActionableCard) p0);
            String strV6 = productListViewModel.v6();
            if (strV6 != null) {
                trackingMetadataA.b(TrackableValue.J2, strV6);
            }
            trackingMetadataA.a(productListViewModel.r6());
            analyticsManager.j(actionableCardImpression, trackingMetadataA);
            return;
        }
        if (p0 instanceof GoogleAdBannerCard) {
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) p0;
            BuildersKt.c(ViewModelKt.a(productListViewModel), null, null, new ProductListViewModel$onGoogleAdBannerImpression$1(productListViewModel, googleAdBannerCard, null), 3);
            ProductListActions.GoogleAdBannerImpression googleAdBannerImpression = ProductListActions.GoogleAdBannerImpression.e;
            TrackingMetadata trackingMetadataA2 = GoogleAdBannerCardKt.a(googleAdBannerCard);
            String strV62 = productListViewModel.v6();
            if (strV62 != null) {
                trackingMetadataA2.b(TrackableValue.J2, strV62);
            }
            trackingMetadataA2.a(productListViewModel.r6());
            analyticsManager.j(googleAdBannerImpression, trackingMetadataA2);
        }
    }
}
