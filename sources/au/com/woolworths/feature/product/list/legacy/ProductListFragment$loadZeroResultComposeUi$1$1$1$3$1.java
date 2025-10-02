package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadZeroResultComposeUi$1$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        TrackingMetadata trackingMetadataX6 = productListViewModel.x6();
        trackingMetadataX6.b(TrackableValue.R1, 0);
        trackingMetadataX6.b(TrackableValue.U1, 1);
        trackingMetadataX6.b(TrackableValue.Y1, ProductsDisplayModeKt.a(productListViewModel.I));
        productListViewModel.g.b(productListViewModel.E6(), trackingMetadataX6);
        return Unit.f24250a;
    }
}
