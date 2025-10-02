package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.ui.graphics.BlurEffect;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListMenuOption;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ProductItemUiModel it = (ProductItemUiModel) obj;
                Intrinsics.h(it, "it");
                return Unit.f24250a;
            case 1:
                ProductCard it2 = (ProductCard) obj;
                Intrinsics.h(it2, "it");
                return Unit.f24250a;
            case 2:
                ProductItemUiModel it3 = (ProductItemUiModel) obj;
                Intrinsics.h(it3, "it");
                return Unit.f24250a;
            case 3:
                ProductItemUiModel it4 = (ProductItemUiModel) obj;
                Intrinsics.h(it4, "it");
                return Unit.f24250a;
            case 4:
                ProductItemUiModel it5 = (ProductItemUiModel) obj;
                Intrinsics.h(it5, "it");
                return Unit.f24250a;
            case 5:
                ProductItemUiModel it6 = (ProductItemUiModel) obj;
                Intrinsics.h(it6, "it");
                return Unit.f24250a;
            case 6:
                ProductCard it7 = (ProductCard) obj;
                Intrinsics.h(it7, "it");
                return Unit.f24250a;
            case 7:
                DynamicSizeCardData it8 = (DynamicSizeCardData) obj;
                Intrinsics.h(it8, "it");
                return Unit.f24250a;
            case 8:
                DynamicSizeCardData it9 = (DynamicSizeCardData) obj;
                Intrinsics.h(it9, "it");
                return Unit.f24250a;
            case 9:
                ShoppingListItemUiModel item = (ShoppingListItemUiModel) obj;
                Intrinsics.h(item, "item");
                return Long.valueOf(item.getC());
            case 10:
                ShoppingListItemUiModel item2 = (ShoppingListItemUiModel) obj;
                Intrinsics.h(item2, "item");
                return Long.valueOf(item2.getD());
            case 11:
                SortBy it10 = (SortBy) obj;
                Intrinsics.h(it10, "it");
                return Unit.f24250a;
            case 12:
                SnapAListMenuOption it11 = (SnapAListMenuOption) obj;
                Intrinsics.h(it11, "it");
                return Unit.f24250a;
            case 13:
                SnapAListMenuOption it12 = (SnapAListMenuOption) obj;
                Intrinsics.h(it12, "it");
                return Unit.f24250a;
            case 14:
                AlternativeProductCard it13 = (AlternativeProductCard) obj;
                Intrinsics.h(it13, "it");
                return Unit.f24250a;
            case 15:
                AlternativeProductsDisclaimer it14 = (AlternativeProductsDisclaimer) obj;
                Intrinsics.h(it14, "it");
                return Unit.f24250a;
            case 16:
                AlternativeProductsCtaSection it15 = (AlternativeProductsCtaSection) obj;
                Intrinsics.h(it15, "it");
                return Unit.f24250a;
            case 17:
                AlternativeProductCard it16 = (AlternativeProductCard) obj;
                Intrinsics.h(it16, "it");
                return Unit.f24250a;
            case 18:
                AlternativeProductsDisclaimer it17 = (AlternativeProductsDisclaimer) obj;
                Intrinsics.h(it17, "it");
                return Unit.f24250a;
            case 19:
                AlternativeProductsCtaSection it18 = (AlternativeProductsCtaSection) obj;
                Intrinsics.h(it18, "it");
                return Unit.f24250a;
            case 20:
                AlternativeProductCard it19 = (AlternativeProductCard) obj;
                Intrinsics.h(it19, "it");
                return Unit.f24250a;
            case 21:
                AlternativeProductsDisclaimer it20 = (AlternativeProductsDisclaimer) obj;
                Intrinsics.h(it20, "it");
                return Unit.f24250a;
            case 22:
                AlternativeProductsCtaSection it21 = (AlternativeProductsCtaSection) obj;
                Intrinsics.h(it21, "it");
                return Unit.f24250a;
            case 23:
                AlternativeProductCard it22 = (AlternativeProductCard) obj;
                Intrinsics.h(it22, "it");
                return Unit.f24250a;
            case 24:
                AlternativeProductsDisclaimer it23 = (AlternativeProductsDisclaimer) obj;
                Intrinsics.h(it23, "it");
                return Unit.f24250a;
            case 25:
                AlternativeProductsCtaSection it24 = (AlternativeProductsCtaSection) obj;
                Intrinsics.h(it24, "it");
                return Unit.f24250a;
            case 26:
                InsetBanner it25 = (InsetBanner) obj;
                Intrinsics.h(it25, "it");
                return Unit.f24250a;
            case 27:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                return Unit.f24250a;
            case 28:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
                return AnimatedContentKt.d(EnterExitTransitionKt.e(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, nlnlnnn.xxx00780078x0078, null, 4), 2), EnterExitTransitionKt.f(AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, null, 6), 2));
            default:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.k(new BlurEffect(18.0f, 18.0f, 0));
                return Unit.f24250a;
        }
    }
}
