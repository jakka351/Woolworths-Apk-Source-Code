package au.com.woolworths.shop.cart.ui.productreview;

import android.webkit.WebView;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ h(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ProductReviewCard it = (ProductReviewCard) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                ProductReviewAlternativeType it2 = (ProductReviewAlternativeType) obj;
                Intrinsics.h(it2, "it");
                break;
            case 2:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                break;
            case 3:
                break;
            case 4:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                break;
            case 5:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsProperties_androidKt.a(semantics3);
                break;
            case 6:
                CollectionMethodOption it3 = (CollectionMethodOption) obj;
                Intrinsics.h(it3, "it");
                break;
            case 7:
                FulfilmentWindowsOption it4 = (FulfilmentWindowsOption) obj;
                Intrinsics.h(it4, "it");
                break;
            case 8:
                FulfilmentWindowsOption it5 = (FulfilmentWindowsOption) obj;
                Intrinsics.h(it5, "it");
                break;
            case 9:
                PackagingMethodOption it6 = (PackagingMethodOption) obj;
                Intrinsics.h(it6, "it");
                break;
            case 10:
                PackagingMethodOption it7 = (PackagingMethodOption) obj;
                Intrinsics.h(it7, "it");
                break;
            case 11:
                PackagingMethodOption it8 = (PackagingMethodOption) obj;
                Intrinsics.h(it8, "it");
                break;
            case 12:
                PackagingMethodOption it9 = (PackagingMethodOption) obj;
                Intrinsics.h(it9, "it");
                break;
            case 13:
                PackagingMethodOption it10 = (PackagingMethodOption) obj;
                Intrinsics.h(it10, "it");
                break;
            case 14:
                String it11 = (String) obj;
                Intrinsics.h(it11, "it");
                break;
            case 15:
                String it12 = (String) obj;
                Intrinsics.h(it12, "it");
                break;
            case 16:
                String it13 = (String) obj;
                Intrinsics.h(it13, "it");
                break;
            case 17:
                String it14 = (String) obj;
                Intrinsics.h(it14, "it");
                break;
            case 18:
                BroadcastBannerData it15 = (BroadcastBannerData) obj;
                Intrinsics.h(it15, "it");
                break;
            case 19:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                break;
            case 20:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                break;
            case 21:
                BasicCoreBroadcastBannerModel it16 = (BasicCoreBroadcastBannerModel) obj;
                Intrinsics.h(it16, "it");
                break;
            case 22:
                ActionData it17 = (ActionData) obj;
                Intrinsics.h(it17, "it");
                break;
            case 23:
                BasicCoreBroadcastBannerModel it18 = (BasicCoreBroadcastBannerModel) obj;
                Intrinsics.h(it18, "it");
                break;
            case 24:
                ActionData it19 = (ActionData) obj;
                Intrinsics.h(it19, "it");
                break;
            case 25:
                BasicCoreBroadcastBannerModel it20 = (BasicCoreBroadcastBannerModel) obj;
                Intrinsics.h(it20, "it");
                break;
            case 26:
                ActionData it21 = (ActionData) obj;
                Intrinsics.h(it21, "it");
                break;
            case 27:
                FulfilmentSlotSelectionOptionId it22 = (FulfilmentSlotSelectionOptionId) obj;
                Intrinsics.h(it22, "it");
                break;
            case 28:
                WebView it23 = (WebView) obj;
                Intrinsics.h(it23, "it");
                it23.getSettings().setJavaScriptEnabled(true);
                it23.getSettings().setDomStorageEnabled(true);
                break;
            default:
                String it24 = (String) obj;
                Intrinsics.h(it24, "it");
                break;
        }
        return Unit.f24250a;
    }
}
