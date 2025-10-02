package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$2$1 extends FunctionReferenceImpl implements Function1<VideoAdPlayerState, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VideoAdPlayerState p0 = (VideoAdPlayerState) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        ProductListViewModel.V6(productListViewModel, productListViewModel.F, 0, null, 0, false, null, null, null, null, null, null, null, null, null, p0, null, 1572863);
        return Unit.f24250a;
    }
}
