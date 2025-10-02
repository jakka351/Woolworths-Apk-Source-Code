package au.com.woolworths.shop.cart.ui.productreview;

import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.SavedStateHandle;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductReviewFragment e;

    public /* synthetic */ b(ProductReviewFragment productReviewFragment, int i) {
        this.d = i;
        this.e = productReviewFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
                Intrinsics.h(addCallback, "$this$addCallback");
                ProductReviewFragment productReviewFragment = this.e;
                ProductReviewViewModel productReviewViewModelI1 = productReviewFragment.I1();
                ProductReviewAnalytics productReviewAnalytics = productReviewViewModelI1.i;
                String str = productReviewViewModelI1.e.d;
                productReviewAnalytics.getClass();
                productReviewAnalytics.f10512a.g((Event) new ProductReviewAnalytics.ProductReview(str).h.c.getD());
                productReviewFragment.requireActivity().finish();
                return Unit.f24250a;
            default:
                SavedStateHandle it = (SavedStateHandle) obj;
                Intrinsics.h(it, "it");
                ProductReviewFragment productReviewFragment2 = this.e;
                ProductReviewViewModel.Factory factory = productReviewFragment2.i;
                if (factory != null) {
                    return factory.a(((Activities.ProductsReviewActivity.Extras) productReviewFragment2.k.getD()).d);
                }
                Intrinsics.p("viewModelFactory");
                throw null;
        }
    }
}
