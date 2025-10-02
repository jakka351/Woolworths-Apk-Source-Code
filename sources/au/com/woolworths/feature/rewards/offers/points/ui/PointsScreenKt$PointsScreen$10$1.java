package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.feature.rewards.offers.OfferSectionViewItem;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PointsScreenKt$PointsScreen$10$1 extends FunctionReferenceImpl implements Function1<OfferSectionViewItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OfferSectionViewItem p0 = (OfferSectionViewItem) obj;
        Intrinsics.h(p0, "p0");
        ((RewardsPointsViewModel) this.receiver).q6(p0);
        return Unit.f24250a;
    }
}
