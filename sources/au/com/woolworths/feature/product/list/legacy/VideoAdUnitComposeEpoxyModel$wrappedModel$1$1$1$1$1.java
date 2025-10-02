package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$1$1 extends FunctionReferenceImpl implements Function1<VideoAdBottomSheet, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VideoAdBottomSheet p0 = (VideoAdBottomSheet) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        productListViewModel.v.f(new ProductListContract.Actions.LaunchVideoAdBottomSheet(p0));
        return Unit.f24250a;
    }
}
