package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import android.webkit.WebView;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFilterGroupItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesFullfilmentStatusItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.orders.OrdersContract;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiEvent;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityUiState;
import au.com.woolworths.pagingutils.NumericPageListing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ l(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String it = (String) obj;
                Intrinsics.h(it, "it");
                return Unit.f24250a;
            case 1:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return Unit.f24250a;
            case 2:
                InsetBanner it2 = (InsetBanner) obj;
                Intrinsics.h(it2, "it");
                return Unit.f24250a;
            case 3:
                WebView webView = (WebView) obj;
                Intrinsics.h(webView, "webView");
                webView.destroy();
                return Unit.f24250a;
            case 4:
                YourGroceriesFilterGroupItem.YourGroceriesFilterItem it3 = (YourGroceriesFilterGroupItem.YourGroceriesFilterItem) obj;
                Intrinsics.h(it3, "it");
                return Unit.f24250a;
            case 5:
                YourGroceriesProductItem it4 = (YourGroceriesProductItem) obj;
                Intrinsics.h(it4, "it");
                return Unit.f24250a;
            case 6:
                YourGroceriesSubstitutedProduct it5 = (YourGroceriesSubstitutedProduct) obj;
                Intrinsics.h(it5, "it");
                return Unit.f24250a;
            case 7:
                YourGroceriesFilterGroupItem.YourGroceriesFilterItem it6 = (YourGroceriesFilterGroupItem.YourGroceriesFilterItem) obj;
                Intrinsics.h(it6, "it");
                return Unit.f24250a;
            case 8:
                YourGroceriesFullfilmentStatusItem it7 = (YourGroceriesFullfilmentStatusItem) obj;
                Intrinsics.h(it7, "it");
                return Unit.f24250a;
            case 9:
                YourGroceriesProductItem it8 = (YourGroceriesProductItem) obj;
                Intrinsics.h(it8, "it");
                return Unit.f24250a;
            case 10:
                YourGroceriesSubstitutedProduct it9 = (YourGroceriesSubstitutedProduct) obj;
                Intrinsics.h(it9, "it");
                return Unit.f24250a;
            case 11:
                OrdersContract.ViewState it10 = (OrdersContract.ViewState) obj;
                Intrinsics.h(it10, "it");
                return it10.f7860a;
            case 12:
                return Unit.f24250a;
            case 13:
                String it11 = (String) obj;
                Intrinsics.h(it11, "it");
                return Unit.f24250a;
            case 14:
                String it12 = (String) obj;
                Intrinsics.h(it12, "it");
                return Unit.f24250a;
            case 15:
                ProductAvailabilityUiEvent it13 = (ProductAvailabilityUiEvent) obj;
                Intrinsics.h(it13, "it");
                return Unit.f24250a;
            case 16:
                ProductAvailabilityUiEvent it14 = (ProductAvailabilityUiEvent) obj;
                Intrinsics.h(it14, "it");
                return Unit.f24250a;
            case 17:
                ProductAvailabilityUiEvent it15 = (ProductAvailabilityUiEvent) obj;
                Intrinsics.h(it15, "it");
                return Unit.f24250a;
            case 18:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                return AnimatedContentKt.d(EnterExitTransitionKt.e(null, 3), EnterExitTransitionKt.f(null, 3));
            case 19:
                ProductAvailabilityUiState state = (ProductAvailabilityUiState) obj;
                Intrinsics.h(state, "state");
                return state.a();
            case 20:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.u(semantics);
                return Unit.f24250a;
            case 21:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                return Unit.f24250a;
            case 22:
                ((Integer) obj).getClass();
                return Unit.f24250a;
            case 23:
                String it16 = (String) obj;
                Intrinsics.h(it16, "it");
                return Unit.f24250a;
            case 24:
                NumericPageListing it17 = (NumericPageListing) obj;
                Intrinsics.h(it17, "it");
                return it17.c;
            case 25:
                NumericPageListing it18 = (NumericPageListing) obj;
                Intrinsics.h(it18, "it");
                return it18.b;
            case 26:
                NumericPageListing it19 = (NumericPageListing) obj;
                Intrinsics.h(it19, "it");
                return it19.e;
            case 27:
                return ((NumericPageListing) obj).f9175a;
            case 28:
                return ((NumericPageListing) obj).c;
            default:
                return ((NumericPageListing) obj).b;
        }
    }
}
