package au.com.woolworths.feature.rewards.offers.listpage.ui;

import au.com.woolworths.feature.rewards.offers.SectionViewItem;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OffersListPageScreenKt$OffersListPageScreen$4$1 extends FunctionReferenceImpl implements Function1<SectionViewItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SectionViewItem p0 = (SectionViewItem) obj;
        Intrinsics.h(p0, "p0");
        ((OfferListPageViewModel) this.receiver).p6(p0);
        return Unit.f24250a;
    }
}
