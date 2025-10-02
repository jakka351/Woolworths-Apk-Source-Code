package au.com.woolworths.shop.cart.ui.productreview;

import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewResult;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductReviewViewModel e;

    public /* synthetic */ f(ProductReviewViewModel productReviewViewModel, int i) {
        this.d = i;
        this.e = productReviewViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ProductReviewViewModel productReviewViewModel = this.e;
        PageResult result = (PageResult) obj;
        switch (i) {
            case 0:
                Timber.Forest forest = ProductReviewViewModel.q;
                Intrinsics.h(result, "result");
                Object obj2 = null;
                if (result instanceof PageResult.Success) {
                    if (((PageResult.Success) result).f10438a instanceof ProductReviewResult.Response) {
                        obj2 = ProductReviewContract.Actions.ShowSnackBarDeleteProductSuccess.f10518a;
                    }
                } else if (result instanceof PageResult.Fail) {
                    obj2 = ProductReviewContract.Actions.ShowSnackBarDeleteProductFail.f10517a;
                } else if (!result.equals(PageResult.Uninitialized.f10439a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (obj2 != null) {
                    productReviewViewModel.l.k(obj2);
                }
                return unit;
            default:
                if (result instanceof PageResult.Fail) {
                    productReviewViewModel.l.k(ProductReviewContract.Actions.ShowSnackBarUpdateProductFail.f10522a);
                }
                return unit;
        }
    }
}
