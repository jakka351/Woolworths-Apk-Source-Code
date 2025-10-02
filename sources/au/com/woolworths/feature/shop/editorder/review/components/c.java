package au.com.woolworths.feature.shop.editorder.review.components;

import android.content.Context;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSectionItems;
import au.com.woolworths.feature.shop.homepage.data.ChatEntryCardCta;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBottomBanner;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListItemData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCardUiKt;
import au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner.DeliveryNowBannerKt;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderKt;
import au.com.woolworths.product.models.RewardsOfferInfo;
import com.skydoves.balloon.Balloon;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                ChangeMyOrderDetailsSectionItems.Cart.ActionTile it = (ChangeMyOrderDetailsSectionItems.Cart.ActionTile) obj;
                Intrinsics.h(it, "it");
                break;
            case 1:
                Intrinsics.h((CmoReviewContract.UserEvent) obj, "it");
                break;
            case 2:
                Intrinsics.h((CmoReviewContract.NavigationType) obj, "it");
                break;
            case 3:
                Intrinsics.h((CmoReviewContract.UserEvent) obj, "it");
                break;
            case 4:
                Intrinsics.h((CmoReviewContract.UserEvent) obj, "it");
                break;
            case 5:
                Balloon.Builder it2 = (Balloon.Builder) obj;
                Intrinsics.h(it2, "it");
                it2.d = 1.0f;
                Context context = it2.f19012a;
                it2.g = context.getResources().getDimensionPixelSize(R.dimen.half_default_margin);
                it2.f = context.getResources().getDimensionPixelSize(R.dimen.half_default_margin);
                break;
            case 6:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                RewardsOfferInfo rewardsOfferInfo = ProductCardUiKt.f7246a;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.u(semantics);
                break;
            case 7:
                Intrinsics.h((String) obj, "it");
                break;
            case 8:
                Intrinsics.h((ChatEntryCardCta) obj, "it");
                break;
            case 9:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                break;
            case 10:
                break;
            case 11:
                DeliveryNowBottomBanner deliveryNowBottomBanner = DeliveryNowBannerKt.f7248a;
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 12:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                DeliveryNowBottomBanner deliveryNowBottomBanner2 = DeliveryNowBannerKt.f7248a;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsProperties_androidKt.a(clearAndSetSemantics);
                break;
            case 13:
                SemanticsPropertyReceiver clearAndSetSemantics2 = (SemanticsPropertyReceiver) obj;
                DeliveryNowBottomBanner deliveryNowBottomBanner3 = DeliveryNowBannerKt.f7248a;
                Intrinsics.h(clearAndSetSemantics2, "$this$clearAndSetSemantics");
                SemanticsProperties_androidKt.a(clearAndSetSemantics2);
                break;
            case 14:
                Intrinsics.h((MyShoppingListsData) obj, "it");
                break;
            case 15:
                Intrinsics.h((MyShoppingListItemData) obj, "it");
                break;
            case 16:
                Intrinsics.h((MyShoppingListsData) obj, "it");
                break;
            case 17:
                Intrinsics.h((MyShoppingListItemData) obj, "it");
                break;
            case 18:
                Intrinsics.h((MyShoppingListsData) obj, "it");
                break;
            case 19:
                Intrinsics.h((MyShoppingListItemData) obj, "it");
                break;
            case 20:
                Intrinsics.h((MyShoppingListsData) obj, "it");
                break;
            case 21:
                Intrinsics.h((MyShoppingListItemData) obj, "it");
                break;
            case 22:
                Intrinsics.h((MyShoppingListsData) obj, "it");
                break;
            case 23:
                Intrinsics.h((MyShoppingListItemData) obj, "it");
                break;
            case 24:
                Intrinsics.h((MyShoppingListsData) obj, "it");
                break;
            case 25:
                Intrinsics.h((MyShoppingListItemData) obj, "it");
                break;
            case 26:
                Intrinsics.h((MyShoppingListsData) obj, "it");
                break;
            case 27:
                Intrinsics.h((MyShoppingListItemData) obj, "it");
                break;
            case 28:
                float f = ModeSelectorSubHeaderKt.f7251a;
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            default:
                float f2 = ModeSelectorSubHeaderKt.f7251a;
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
        }
        return unit;
    }
}
