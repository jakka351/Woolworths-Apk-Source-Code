package au.com.woolworths.feature.shop.editorder.review;

import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CmoReviewActivity$onCreate$1$1$1$1 extends FunctionReferenceImpl implements Function1<CmoReviewContract.UserEvent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CmoReviewContract.UserEvent p0 = (CmoReviewContract.UserEvent) obj;
        Intrinsics.h(p0, "p0");
        ((CmoReviewViewModel) this.receiver).r6(p0);
        return Unit.f24250a;
    }
}
