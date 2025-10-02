package au.com.woolworths.shop.checkout.ui.content;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import au.com.woolworths.shop.checkout.databinding.IncludeCheckoutOrderTotalDetailsBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int measuredHeight;
        int measuredHeight2;
        switch (this.d) {
            case 0:
                CheckoutContentFragment checkoutContentFragment = (CheckoutContentFragment) this.e;
                IncludeCheckoutOrderTotalDetailsBinding includeCheckoutOrderTotalDetailsBinding = (IncludeCheckoutOrderTotalDetailsBinding) this.f;
                BottomSheetBehavior bottomSheetBehavior = checkoutContentFragment.h;
                if (bottomSheetBehavior == null) {
                    Intrinsics.p("bottomSheetBehavior");
                    throw null;
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    View view = checkoutContentFragment.getView();
                    int i = 0;
                    if (view != null) {
                        WindowInsetsCompat windowInsetsCompatN = ViewCompat.n(view);
                        Insets insetsE = windowInsetsCompatN != null ? windowInsetsCompatN.e(2) : null;
                        if (insetsE != null) {
                            i = insetsE.d;
                        }
                    }
                    measuredHeight = includeCheckoutOrderTotalDetailsBinding.C.getMeasuredHeight() + i;
                    measuredHeight2 = includeCheckoutOrderTotalDetailsBinding.A.h.getMeasuredHeight();
                } else {
                    measuredHeight = includeCheckoutOrderTotalDetailsBinding.C.getMeasuredHeight();
                    measuredHeight2 = includeCheckoutOrderTotalDetailsBinding.A.h.getMeasuredHeight();
                }
                bottomSheetBehavior.N(measuredHeight2 + measuredHeight);
                return;
            default:
                FirstDrawDoneListener firstDrawDoneListener = (FirstDrawDoneListener) this.e;
                View view2 = (View) this.f;
                firstDrawDoneListener.getClass();
                view2.getViewTreeObserver().removeOnDrawListener(firstDrawDoneListener);
                return;
        }
    }
}
