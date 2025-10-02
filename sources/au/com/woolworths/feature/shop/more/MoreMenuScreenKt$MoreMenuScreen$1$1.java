package au.com.woolworths.feature.shop.more;

import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MoreMenuScreenKt$MoreMenuScreen$1$1 extends FunctionReferenceImpl implements Function1<DynamicSizeCardData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicSizeCardData p0 = (DynamicSizeCardData) obj;
        Intrinsics.h(p0, "p0");
        ((ContentPageViewModel) this.receiver).m(p0);
        return Unit.f24250a;
    }
}
