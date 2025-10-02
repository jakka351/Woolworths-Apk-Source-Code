package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$16$1 extends FunctionReferenceImpl implements Function1<BroadcastBannerData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BroadcastBannerData p0 = (BroadcastBannerData) obj;
        Intrinsics.h(p0, "p0");
        ((ContentPageViewModel) this.receiver).x6(p0);
        return Unit.f24250a;
    }
}
