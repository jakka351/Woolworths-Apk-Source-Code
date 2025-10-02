package au.com.woolworths.feature.shop.homepage.presentation;

import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class HomePageFragment$onCreateView$1$1$1$1$3$1 extends FunctionReferenceImpl implements Function2<HorizontalListData, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HorizontalListData p0 = (HorizontalListData) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.h(p0, "p0");
        ((ContentPageViewModel) this.receiver).C6(iIntValue, p0);
        return Unit.f24250a;
    }
}
