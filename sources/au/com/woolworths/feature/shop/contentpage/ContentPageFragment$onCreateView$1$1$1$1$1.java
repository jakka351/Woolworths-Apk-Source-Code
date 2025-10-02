package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListData;
import au.com.woolworths.shop.aem.components.model.verticallist.VerticalListItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$1$1 extends FunctionReferenceImpl implements Function2<VerticalListData, VerticalListItem, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        VerticalListData p0 = (VerticalListData) obj;
        VerticalListItem p1 = (VerticalListItem) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        ((ContentPageViewModel) this.receiver).E6(p0, p1);
        return Unit.f24250a;
    }
}
