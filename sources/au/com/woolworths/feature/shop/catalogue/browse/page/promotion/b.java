package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                break;
            case 1:
                ProductCard it = (ProductCard) obj;
                Intrinsics.h(it, "it");
                break;
            case 2:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.g(semantics2);
                break;
            case 3:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                int i2 = PromotionPageKt.d;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                break;
            case 4:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                float f = CategoryListingScreenKt.b;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.g(semantics4);
                break;
            case 5:
                LazyGridItemSpanScope item = (LazyGridItemSpanScope) obj;
                float f2 = CategoryListingScreenKt.b;
                Intrinsics.h(item, "$this$item");
                break;
            case 6:
                LazyGridItemSpanScope item2 = (LazyGridItemSpanScope) obj;
                float f3 = CategoryListingScreenKt.b;
                Intrinsics.h(item2, "$this$item");
                break;
            case 7:
                InsetBanner it2 = (InsetBanner) obj;
                Intrinsics.h(it2, "it");
                break;
            case 8:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.u(semantics5);
                break;
            case 9:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 10:
                ProductCard it3 = (ProductCard) obj;
                Intrinsics.h(it3, "it");
                break;
            case 11:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.g(semantics6);
                break;
            case 12:
                ProductCard it4 = (ProductCard) obj;
                Intrinsics.h(it4, "it");
                break;
            case 13:
                ProductCard it5 = (ProductCard) obj;
                Intrinsics.h(it5, "it");
                break;
            case 14:
                ProductCard it6 = (ProductCard) obj;
                Intrinsics.h(it6, "it");
                break;
            case 15:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            case 16:
                ProductCard it7 = (ProductCard) obj;
                Intrinsics.h(it7, "it");
                break;
            case 17:
                SemanticsPropertyReceiver semantics7 = (SemanticsPropertyReceiver) obj;
                float f4 = PromotionListingScreenKt.b;
                Intrinsics.h(semantics7, "$this$semantics");
                SemanticsPropertiesKt.g(semantics7);
                break;
            case 18:
                LazyGridItemSpanScope item3 = (LazyGridItemSpanScope) obj;
                float f5 = PromotionListingScreenKt.b;
                Intrinsics.h(item3, "$this$item");
                break;
            case 19:
                LazyGridItemSpanScope item4 = (LazyGridItemSpanScope) obj;
                float f6 = PromotionListingScreenKt.b;
                Intrinsics.h(item4, "$this$item");
                break;
            case 20:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                break;
            case 21:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 22:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                break;
            case 23:
                ActionData it8 = (ActionData) obj;
                Intrinsics.h(it8, "it");
                break;
            case 24:
                Region it9 = (Region) obj;
                Intrinsics.h(it9, "it");
                break;
            case 25:
                Region it10 = (Region) obj;
                Intrinsics.h(it10, "it");
                break;
            case 26:
                Region it11 = (Region) obj;
                Intrinsics.h(it11, "it");
                break;
            case 27:
                Region it12 = (Region) obj;
                Intrinsics.h(it12, "it");
                break;
            case 28:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
            default:
                Intrinsics.h((SemanticsPropertyReceiver) obj, "$this$semantics");
                break;
        }
        return unit;
    }
}
