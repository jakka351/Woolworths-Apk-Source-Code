package au.com.woolworths.shop.product.details;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ProductDetailsActivity$setViewContent$1$1$4$1 extends FunctionReferenceImpl implements Function1<ActionData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData p0 = (ActionData) obj;
        Intrinsics.h(p0, "p0");
        ProductDetailsViewModel productDetailsViewModel = (ProductDetailsViewModel) this.receiver;
        productDetailsViewModel.getClass();
        AnalyticsData analytics = p0.getAnalytics();
        if (analytics != null) {
            productDetailsViewModel.C6(AnalyticsDataKt.a(analytics));
        }
        productDetailsViewModel.s.f(new ProductDetailsContract.Action.OpenOliveChat(p0.getAction()));
        return Unit.f24250a;
    }
}
