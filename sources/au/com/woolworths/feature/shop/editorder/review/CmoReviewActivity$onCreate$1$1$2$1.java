package au.com.woolworths.feature.shop.editorder.review;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CmoReviewActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function1<CmoReviewContract.NavigationType, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CmoReviewContract.NavigationType p0 = (CmoReviewContract.NavigationType) obj;
        Intrinsics.h(p0, "p0");
        CmoReviewActivity cmoReviewActivity = (CmoReviewActivity) this.receiver;
        int i = CmoReviewActivity.x;
        cmoReviewActivity.getClass();
        if (p0 instanceof CmoReviewContract.NavigationType.OrderDetailScreen) {
            cmoReviewActivity.setResult(-1, new Intent().putExtra("CMO_REVIEW_DESTINATION_RESULT", new Activities.CmoReviewActivity.Result(Activities.CmoReviewActivity.Result.Destination.d, ((CmoReviewContract.NavigationType.OrderDetailScreen) p0).f7080a.getText(cmoReviewActivity).toString())));
            cmoReviewActivity.finish();
        } else if (p0.equals(CmoReviewContract.NavigationType.ScreenBeforeOrderDetail.f7083a)) {
            cmoReviewActivity.setResult(-1, new Intent().putExtra("CMO_REVIEW_DESTINATION_RESULT", new Activities.CmoReviewActivity.Result(Activities.CmoReviewActivity.Result.Destination.e, null)));
            cmoReviewActivity.finish();
        } else if (p0.equals(CmoReviewContract.NavigationType.CheckoutScreen.f7079a)) {
            cmoReviewActivity.startActivity(ActivityNavigatorKt.a(Activities.CheckoutActivity.f4457a, ApplicationType.e));
        } else if (p0.equals(CmoReviewContract.NavigationType.CartScreen.f7078a)) {
            cmoReviewActivity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
        } else {
            boolean zEquals = p0.equals(CmoReviewContract.NavigationType.ProductScreen.f7082a);
            Activities.MainActivity mainActivity = Activities.MainActivity.f4487a;
            if (zEquals) {
                mainActivity.d(cmoReviewActivity, Activities.MainActivity.Tab.f);
            } else if (p0.equals(CmoReviewContract.NavigationType.BuyAgainScreen.f7077a)) {
                cmoReviewActivity.startActivity(ActivityNavigatorKt.a(Activities.BuyAgainActivity.f4453a, ApplicationType.e));
            } else if (p0.equals(CmoReviewContract.NavigationType.SpecialsScreen.f7084a)) {
                mainActivity.d(cmoReviewActivity, Activities.MainActivity.Tab.g);
            } else {
                if (!p0.equals(CmoReviewContract.NavigationType.PastShopsScreen.f7081a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cmoReviewActivity.startActivity(ActivityNavigatorKt.a(Activities.PastShopsActivity.f4499a, ApplicationType.e));
            }
        }
        return Unit.f24250a;
    }
}
