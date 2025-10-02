package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$13$1 extends FunctionReferenceImpl implements Function1<HeroBanner, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HeroBanner p0 = (HeroBanner) obj;
        Intrinsics.h(p0, "p0");
        ((ContentPageViewModel) this.receiver).A6(p0);
        return Unit.f24250a;
    }
}
