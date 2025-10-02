package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics$ZeroPageResult$Action$categoryTileClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadZeroResultComposeUi$1$1$1$1$1 extends FunctionReferenceImpl implements Function1<ProductCategoryTileData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCategoryTileData p0 = (ProductCategoryTileData) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        TrackingMetadata trackingMetadataX6 = productListViewModel.x6();
        trackingMetadataX6.b(TrackableValue.R1, 0);
        trackingMetadataX6.b(TrackableValue.U1, 1);
        trackingMetadataX6.b(TrackableValue.Y1, ProductsDisplayModeKt.a(productListViewModel.I));
        AnalyticsManager analyticsManager = productListViewModel.g;
        ZeroResultAnalytics.ZeroPageResult.Action action = productListViewModel.E6().f;
        String tileTitle = p0.e;
        action.getClass();
        Intrinsics.h(tileTitle, "tileTitle");
        analyticsManager.i(new ZeroResultAnalytics$ZeroPageResult$Action$categoryTileClick$1(action, tileTitle), trackingMetadataX6);
        productListViewModel.v.f(new ProductListContract.Actions.LaunchDeeplink(p0.f.getAction(), null));
        return Unit.f24250a;
    }
}
