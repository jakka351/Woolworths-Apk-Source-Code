package au.com.woolworths.shop.cart.ui.productreview;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.foundation.feature.di.AssistedViewModelFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductReviewFragment e;

    public /* synthetic */ c(ProductReviewFragment productReviewFragment, int i) {
        this.d = i;
        this.e = productReviewFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Bundle arguments = this.e.getArguments();
                Activities.ProductsReviewActivity.Extras extras = arguments != null ? (Activities.ProductsReviewActivity.Extras) arguments.getParcelable("extraData") : null;
                if (extras != null) {
                    return extras;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                ProductReviewFragment productReviewFragment = this.e;
                return new AssistedViewModelFactory(productReviewFragment, new b(productReviewFragment, 1));
            case 2:
                this.e.requireActivity().getF().d();
                return Unit.f24250a;
            default:
                FragmentActivity fragmentActivityRequireActivity = this.e.requireActivity();
                fragmentActivityRequireActivity.setResult(-1);
                fragmentActivityRequireActivity.finish();
                return Unit.f24250a;
        }
    }
}
