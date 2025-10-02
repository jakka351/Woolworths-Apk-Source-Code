package au.com.woolworths.feature.product.list;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics$ZeroPageResult$Action$relatedProductsImpression$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadZeroResultComposeUi$1$1$1$4$1 extends FunctionReferenceImpl implements Function1<HorizontalListData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HorizontalListData p0 = (HorizontalListData) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        TrackingMetadata trackingMetadataR6 = productListViewModel.r6();
        trackingMetadataR6.b(TrackableValue.R1, 0);
        trackingMetadataR6.b(TrackableValue.U1, 1);
        trackingMetadataR6.b(TrackableValue.Y1, ProductsDisplayModeKt.a(productListViewModel.L));
        List h = p0.getH();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : h) {
            if (obj2 instanceof ProductCard) {
                arrayList.add(obj2);
            }
        }
        String source = CollectionsKt.M(arrayList, ",", null, null, new au.com.woolworths.design.core.ui.component.stable.corerow.c(29), 30);
        AnalyticsManager analyticsManager = productListViewModel.h;
        ZeroResultAnalytics.ZeroPageResult.Action action = productListViewModel.w6().f;
        action.getClass();
        Intrinsics.h(source, "source");
        analyticsManager.i(new ZeroResultAnalytics$ZeroPageResult$Action$relatedProductsImpression$1(action, source), trackingMetadataR6);
        return Unit.f24250a;
    }
}
